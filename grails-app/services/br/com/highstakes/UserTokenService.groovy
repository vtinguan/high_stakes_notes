package br.com.highstakes

import br.com.highstakes.exceptions.UnauthorizedException

class UserTokenService {

    def createNewLoginToken(User user) {
        Date today = new Date();
        Date tomorrow = new Date(today.getTime() + (1000 * 60 * 60 * 24));
        String token = UUID.randomUUID().toString() + Calendar.instance.time.time
        UserToken userToken = new UserToken(user: user, created: today, expirationDate: tomorrow, isValid: true, accessToken: token).save(failOnError: true)
        return userToken
    }

    def getOrCreateLastToken(User user) {
        Date today = new Date()
        UserToken userToken = UserToken.findByUserAndIsValidAndExpirationDateGreaterThan(user, true, today, [sort: 'id', order: 'desc', max: 1])
        if (!userToken) {
            return createNewLoginToken(user)
        }
        return userToken
    }

    def logout(String accessToken) {
        UserToken userToken = this.loginByToken(accessToken)
        userToken.isValid = false
        userToken.save(failOnError: true)
        return ["": ""]
    }

    def loginByToken(String accessToken) {
        Date today = new Date()
        UserToken userToken = UserToken.findByAccessTokenAndIsValidAndExpirationDateGreaterThan(accessToken, true, today, [sort: 'id', order: 'desc', max: 1])
        if (!userToken) {
            throw new UnauthorizedException()
        }
        return userToken
    }

    def createLoginResponse(UserToken userToken) {
        return ["access_token": userToken.accessToken, "expirationDate": userToken.expirationDate]
    }
}

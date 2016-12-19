package br.com.highstakes

import br.com.highstakes.exceptions.UnauthorizedException
import br.com.highstakes.exceptions.UserAlreadyTakenException

class UserService {

    def userTokenService

    def signUp(String username, String password) {

        User user = User.findByUsername(username)
        if (user) {
            throw new UserAlreadyTakenException()
        } else {
            user = new User(username: username, password: password).save(failOnError: true)
            UserToken userToken = userTokenService.createNewLoginToken(user)
            return userTokenService.createLoginResponse(userToken)
        }
    }

    def login(String username, String password) {

        User user = User.findByUsername(username)
        if (!user || user.password != password) {
            throw new UnauthorizedException()
        } else {
            UserToken userToken = userTokenService.getOrCreateLastToken(user)
            return userTokenService.createLoginResponse(userToken)
        }
    }

    def forgotPassword(String username) {
        User user = User.findByUsername(username)
        if (!user) {
            throw new UnauthorizedException()
        }
        return ["password" : user.password]
    }
}

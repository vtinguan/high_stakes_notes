package br.com.highstakes

import br.com.highstakes.exceptions.UnauthorizedException
import br.com.highstakes.exceptions.UserAlreadyTakenException
import grails.test.mixin.*
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@Mock([User, UserToken])
class UserServiceTests extends Specification {

    UserService userService = new UserService()

    void 'trying to sign up with already registrated user'() {
        when:
        User u = new User(username: "aaa", password: "bbb").save(failOnError: true)
        userService.signUp("aaa", "bbb")

        then:
        thrown(UserAlreadyTakenException)
    }


    void 'sign up with new user'() {
        setup:
        userService.userTokenService = Mock(UserTokenService)
        userService.userTokenService.createNewLoginToken(_) >> new UserToken(user: _, created: _, expirationDate: _, accessToken: "aaa", isValid: true)
        userService.userTokenService.createLoginResponse(_) >> ["access_token" : "aaa", "expirationDate" : new Date().toString()]
        when:
        def response = userService.signUp("aaa", "bbb")

        then:
        response.access_token == "aaa"
    }

    void 'login with wrong password'() {
        when:
        User u = new User(username: "aaa", password: "bbb").save(failOnError: true)
        userService.login("aaa", "bb")

        then:
        thrown(UnauthorizedException)
    }

    void 'login succeed'() {
        when:
        userService.userTokenService = Mock(UserTokenService)
        userService.userTokenService.getOrCreateLastToken(_) >> new UserToken(user: _, created: _, expirationDate: _, accessToken: "aaa", isValid: true)
        userService.userTokenService.createLoginResponse(_) >> ["access_token" : "aaa", "expirationDate" : new Date().toString()]
        User u = new User(username: "aaa", password: "bbb").save(failOnError: true)
        def response = userService.login("aaa", "bbb")

        then:
        response == ["access_token" : "aaa", "expirationDate" : new Date().toString()]
    }

    void 'forget password recovered'() {
        when:
        User u = new User(username: "aaa", password: "bbb").save(failOnError: true)
        def response = userService.forgotPassword("aaa")

        then:
        response == ["password" : "bbb"]
    }

    void 'trying to recorevy password with an invalid user'() {
        when:
        userService.forgotPassword("aaa")

        then:
        thrown(UnauthorizedException)
    }
}

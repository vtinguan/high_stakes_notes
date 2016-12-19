package br.com.highstakes

import grails.test.mixin.*
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */

@Mock([User, UserToken])
class UserTokenServiceTests extends Specification {

    UserTokenService userTokenService = new UserTokenService()

    void 'creating new login token'() {
        when:
        User u = new User(username: "aaaa", password: "bbbbb").save(failOnError: true)

        then:
        def userToken = userTokenService.createNewLoginToken(u)

        then:
        userToken.user.username == "aaaa"
    }

    void 'getting log token'() {
        when:
        User u = new User(username: "aaaa", password: "bbbbb").save(failOnError: true)

        then:
        def userToken = userTokenService.getOrCreateLastToken(u)

        then:
        userToken.user.username == "aaaa"
    }


    void 'getting valid user token last usage'() {
        when:
        User u = new User(username: "aaaa", password: "bbbbb").save(failOnError: true)
        Date today = new Date();
        Date tomorrow = new Date(today.getTime() + (1000 * 60 * 60 * 24));
        UserToken ut = new UserToken(user: u, created: today, isValid: true, expirationDate: tomorrow, accessToken: "1111111").save(failOnError: true)
        then:
        def userToken = userTokenService.getOrCreateLastToken(u)

        then:
        userToken.accessToken == "1111111"
    }

    void 'logout test case'() {
        when:
        User u = new User(username: "aaaa", password: "bbbbb").save(failOnError: true)
        Date today = new Date();
        Date tomorrow = new Date(today.getTime() + (1000 * 60 * 60 * 24));
        UserToken ut = new UserToken(user: u, created: today, isValid: true, expirationDate: tomorrow, accessToken: "1111111").save(failOnError: true)
        then:
        def userToken = userTokenService.logout("1111111")

        then:
        ut.isValid == false
    }
}

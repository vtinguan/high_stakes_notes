package br.com.highstakes

import br.com.highstakes.exceptions.InternalErrorException
import br.com.highstakes.exceptions.UnauthorizedException
import br.com.highstakes.exceptions.UserAlreadyTakenException
import grails.converters.JSON
import org.codehaus.groovy.grails.web.json.JSONObject

class HighStakesUsersController {

    def userService
    def userTokenService
    def highStakesException

    def signUp() {
        try {
            JSONObject param = request.JSON as JSONObject
            String username = param.username
            String password = param.password
            def response = userService.signUp(username, password)
            render response as JSON
        } catch (UnauthorizedException ue) {
            def response = highStakesException.createResponse(ue)
            response.status = ue.code
            render response as JSON
        } catch (UserAlreadyTakenException uate) {
            def response = highStakesException.createResponse(uate)
            response.status = uate.code
            render response as JSON
        } catch (Exception ignored) {
            InternalErrorException internalErrorException = new InternalErrorException()
            def response = highStakesException.createResponse(internalErrorException)
            render response as JSON
        }
    }

    def login() {
        try {
            JSONObject param = request.JSON as JSONObject
            String username = param.username
            String password = param.password
            def response = userService.login(username, password)
            render response as JSON
        } catch (UnauthorizedException ue) {
            def response = highStakesException.createResponse(ue)
            response.status = ue.code
            render response as JSON
        } catch (Exception ignored) {
            InternalErrorException internalErrorException = new InternalErrorException()
            def response = highStakesException.createResponse(internalErrorException)
            render response as JSON
        }
    }

    def logout() {
        try {
            JSONObject param = request.JSON as JSONObject
            String accessToken = param.access_token
            def response = userTokenService.logout(accessToken)
            render response as JSON
        } catch (UnauthorizedException ue) {
            def response = highStakesException.createResponse(ue)
            response.status = ue.code
            render response as JSON
        } catch (Exception ignored) {
            InternalErrorException internalErrorException = new InternalErrorException()
            def response = highStakesException.createResponse(internalErrorException)
            render response as JSON
        }
    }

    def forgotPassword() {
        try {
            JSONObject param = request.JSON as JSONObject
            String username = param.username
            def response = userService.forgotPassword(username)
            render response as JSON
        } catch (UnauthorizedException ue) {
            def response = highStakesException.createResponse(ue)
            response.status = ue.code
            render response as JSON
        } catch (Exception ignored) {
            InternalErrorException internalErrorException = new InternalErrorException()
            def response = highStakesException.createResponse(internalErrorException)
            render response as JSON
        }
    }
}

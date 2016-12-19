package br.com.highstakes

import br.com.highstakes.exceptions.InternalErrorException
import br.com.highstakes.exceptions.NoContentException
import br.com.highstakes.exceptions.UnauthorizedException
import grails.converters.JSON
import org.codehaus.groovy.grails.web.json.JSONObject

class HighStakesNotesController {

    def noteService
    def highStakesException

    def createNote() {
        try {
            JSONObject param = request.JSON as JSONObject
            String accessToken = param.access_token
            String note = param.note
            def response = noteService.createNote(accessToken, note)
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

    def retrieveNotes() {
        try {
            JSONObject param = request.JSON as JSONObject
            String accessToken = param.access_token
            def response = noteService.retrieveNotes(accessToken)
            render response as JSON
        } catch (UnauthorizedException ue) {
            def response = highStakesException.createResponse(ue)
            response.status = ue.code
            render response as JSON
        } catch (NoContentException nce) {
            def response = highStakesException.createResponse(nce)
            response.status = nce.code
            render response as JSON
        } catch (Exception ignored) {
            InternalErrorException internalErrorException = new InternalErrorException()
            def response = highStakesException.createResponse(internalErrorException)
            render response as JSON
        }
    }


    def editNote() {
        try {
            JSONObject param = request.JSON as JSONObject
            String accessToken = param.access_token
            int id = param.id
            String editedNote = param.editedNote
            def response = noteService.editNote(accessToken, id, editedNote)
            render response as JSON
        } catch (UnauthorizedException ue) {
            def response = highStakesException.createResponse(ue)
            response.status = ue.code
            render response as JSON
        } catch (NoContentException nce) {
            def response = highStakesException.createResponse(nce)
            response.status = nce.code
            render response as JSON
        } catch (Exception ignored) {
            InternalErrorException internalErrorException = new InternalErrorException()
            def response = highStakesException.createResponse(internalErrorException)
            render response as JSON
        }
    }


    def deleteNote() {
        try {
            JSONObject param = request.JSON as JSONObject
            String accessToken = param.access_token
            int id = param.id
            def response = noteService.deleteNote(accessToken, id)
            render response as JSON
        } catch (UnauthorizedException ue) {
            def response = highStakesException.createResponse(ue)
            response.status = ue.code
            render response as JSON
        } catch (NoContentException nce) {
            def response = highStakesException.createResponse(nce)
            response.status = nce.code
            render response as JSON
        } catch (Exception ignored) {
            InternalErrorException internalErrorException = new InternalErrorException()
            def response = highStakesException.createResponse(internalErrorException)
            render response as JSON
        }
    }
}

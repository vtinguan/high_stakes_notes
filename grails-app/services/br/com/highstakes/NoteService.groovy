package br.com.highstakes

import br.com.highstakes.exceptions.NoContentException

class NoteService {

    def userTokenService

    def createNote(String accessToken, String note) {
        UserToken userToken = userTokenService.loginByToken(accessToken)
        Note noteSaved = new Note(user: userToken.user, note: note, created: new Date()).save(failOnError: true)
        return ["id" : noteSaved.id]
    }

    def retrieveNotes(String accessToken) {
        UserToken userToken = userTokenService.loginByToken(accessToken)
        def noteRetrieved = Note.findAllByUser(userToken.user)
        if(!noteRetrieved){
            throw new NoContentException()
        }
        HashMap<String, String> response = new HashMap<>()
        for(Note note : noteRetrieved) {
            response.put("note", note.note)
        }
        return response
    }

    def editNote(String accessToken, int id, String newNote) {
        userTokenService.loginByToken(accessToken)
        Note noteRetrieved = Note.findById(id)
        if(!noteRetrieved){
            throw new NoContentException()
        }
        noteRetrieved.note = newNote
        noteRetrieved.save(failOnError: true)
        return ["" : ""]
    }

    def deleteNote(String accessToken, int id) {
        userTokenService.loginByToken(accessToken)
        Note noteRetrieved = Note.findById(id)
        if(!noteRetrieved){
            throw new NoContentException()
        }
        noteRetrieved.delete()
        return ["" : ""]
    }

}

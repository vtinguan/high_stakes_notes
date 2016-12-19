package br.com.highstakes

import grails.test.mixin.*
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@Mock([User, UserToken, Note])
class NoteServiceTests extends Specification {

    NoteService noteService = new NoteService()

    void 'creating note'() {
        setup:
        noteService.userTokenService = Mock(UserTokenService)
        noteService.userTokenService.loginByToken(_) >> new UserToken(user: _, created: _, expirationDate: _, accessToken: "aaa", isValid: true)

        when:
        def response = noteService.createNote("111", "Nota Teste")

        then:
        response == ["id": 1]
    }

    void 'retrieving two notes'() {
        setup:
        User u = new User(username: "aaa", password: "cccc")
        noteService.userTokenService = Mock(UserTokenService)
        noteService.userTokenService.loginByToken(_) >> new UserToken(user: u, created: _, expirationDate: _, accessToken: "aaa", isValid: true)
        Note n1 = new Note(user: u, created: new Date(), note: "aaaaaaa").save(failOnError: true)
        Note n2 = new Note(user: u, created: new Date(), note: "bbbbbbb").save(failOnError: true)

        when:
        def response = noteService.retrieveNotes("111")

        then:
        response == ["note": "aaaaaaa", "note":"bbbbbbb"]
    }

    void 'editing notes'() {
        setup:
        User u = new User(username: "aaa", password: "cccc")
        noteService.userTokenService = Mock(UserTokenService)
        noteService.userTokenService.loginByToken(_) >> new UserToken(user: u, created: _, expirationDate: _, accessToken: "aaa", isValid: true)
        Note n1 = new Note(user: u, created: new Date(), note: "aaaaaaa").save(failOnError: true)
        Note n2 = new Note(user: u, created: new Date(), note: "bbbbbbb").save(failOnError: true)

        when:
        def response = noteService.editNote("111", 1, "BATATA")

        then:
        "BATATA" == Note.findById(1).note
        response == ["": ""]
    }

    void 'deleting note'() {
        setup:
        User u = new User(username: "aaa", password: "cccc")
        noteService.userTokenService = Mock(UserTokenService)
        noteService.userTokenService.loginByToken(_) >> new UserToken(user: u, created: _, expirationDate: _, accessToken: "aaa", isValid: true)
        Note n1 = new Note(user: u, created: new Date(), note: "aaaaaaa").save(failOnError: true)

        when:
        def response = noteService.deleteNote("111", 1)

        then:
        Note.findAll().size() == 0
        response == ["": ""]
    }
}

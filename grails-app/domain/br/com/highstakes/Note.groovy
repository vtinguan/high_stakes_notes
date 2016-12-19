package br.com.highstakes

class Note {

    User user
    String note
    Date created

    static constraints = {
        user(nullable: false, blank: false)
        note(nullable: false, blank: false)
        created(nullable: false, blank: false)

    }
}

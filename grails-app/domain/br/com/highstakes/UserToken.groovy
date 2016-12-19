package br.com.highstakes

class UserToken {

    User user
    String accessToken
    Date expirationDate
    Date created
    boolean isValid

    static constraints = {
        user(nullable: false, blank: false)
        accessToken(nullable: false, blank: false)
        expirationDate(nullable: false, blank: false)
        created(nullable: false, blank: false)
        isValid(nullable: false, blank: false)
    }
}

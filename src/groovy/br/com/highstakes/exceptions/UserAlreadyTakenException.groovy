package br.com.highstakes.exceptions

/**
 * Created by tinguan on 18/12/16.
 */
class UserAlreadyTakenException extends HighStakesException {
    String code = 422
    String errorMessage = "User Already Taken"

    public UserAlreadyTakenException() {}
}

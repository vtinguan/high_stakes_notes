package br.com.highstakes.exceptions

/**
 * Created by tinguan on 18/12/16.
 */
class InternalErrorException extends HighStakesException {
    String code = 500
    String errorMessage = "Internal Error"

    public InternalErrorException() {}
}

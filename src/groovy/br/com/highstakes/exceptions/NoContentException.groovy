package br.com.highstakes.exceptions

/**
 * Created by tinguan on 19/12/16.
 */
class NoContentException extends HighStakesException {
    String code = 204
    String errorMessage = "No content"

    public NoContentException() {}
}

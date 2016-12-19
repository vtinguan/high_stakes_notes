package br.com.highstakes.exceptions

/**
 * Created by tinguan on 18/12/16.
 */
class UnauthorizedException extends HighStakesException {

    String code = 401
    String errorMessage = "Unauthorized"

    public UnauthorizedException() {}
}

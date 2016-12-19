package br.com.highstakes.exceptions

import org.codehaus.groovy.grails.exceptions.GrailsException
import org.codehaus.groovy.grails.web.json.JSONObject

/**
 * Created by tinguan on 18/12/16.
 */
class HighStakesException extends GrailsException {
    String code
    String errorMessage

    public HighStakesException() {
        super();
    }

    public HighStakesException(String message) {
        super(message);
    }

    public HighStakesException(String message, Throwable cause) {
        super(message, cause);
    }

    public HighStakesException(Throwable e) {
        super(e);
    }

    def createResponse(HighStakesException e) {
        def now = Calendar.instance.time.time
        def response = new JSONObject()
        response.put("status", e.code)
        response.put("errorMessage", e.errorMessage)
        response.put("timestamp", now)
    }
}

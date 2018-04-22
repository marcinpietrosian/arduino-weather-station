package mpietrosian.backend.implementation.exception;

import org.springframework.http.HttpStatus;

public class ApiException extends Exception {

    private final HttpStatus status;

    public ApiException(final String message, final HttpStatus status) {
        super(message);
        this.status = status;
    }

    public ApiException(final Throwable cause) {
        this(cause.getMessage(), cause);
    }

    public ApiException(final String message, final Throwable cause) {
        super(message, cause);
        this.status = HttpStatus.INTERNAL_SERVER_ERROR;
    }

    public ApiException(final String message, final Throwable cause, final HttpStatus status) {
        super(message, cause);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public final static ApiException NOT_IMPLEMENTED = new ApiException("Not implemented in this version",
            HttpStatus.NOT_IMPLEMENTED);
}
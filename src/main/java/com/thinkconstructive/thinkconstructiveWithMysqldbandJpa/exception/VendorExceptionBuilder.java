package com.thinkconstructive.thinkconstructiveWithMysqldbandJpa.exception;

import org.springframework.http.HttpStatus;

public class VendorExceptionBuilder {
    private final Throwable throwable;
    private final HttpStatus httpStatus;
    private final String message;
    public VendorExceptionBuilder(String message, Throwable throwable, HttpStatus httpStatus) {
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
    }



    public String getMessage() {
        return message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }



}

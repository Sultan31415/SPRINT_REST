package com.sultan.spring.rest.exceptoinHandling;

public class NoSuchEmployeeException extends RuntimeException {

    public NoSuchEmployeeException(String message) {

        super(message);
    }
}

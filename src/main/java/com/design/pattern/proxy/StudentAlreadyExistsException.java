package com.design.pattern.proxy;

public class StudentAlreadyExistsException extends RuntimeException {
    public StudentAlreadyExistsException(final String message) {
        super(message);
    }

    public StudentAlreadyExistsException(final StudentAlreadyExistsException exception) {
        super(exception);
    }
}

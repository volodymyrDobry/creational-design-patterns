package com.design.pattern.proxy;

public class StudentNotExistsException extends RuntimeException {
    public StudentNotExistsException(final String message) {
        super(message);
    }
}

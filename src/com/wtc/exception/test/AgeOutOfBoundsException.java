package com.wtc.exception.test;
public class AgeOutOfBoundsException extends RuntimeException {
    public AgeOutOfBoundsException() {
        super();
    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}

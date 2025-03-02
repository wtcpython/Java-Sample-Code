package com.wtc.exception.test;
public class NameFormatException extends RuntimeException {
    public NameFormatException() {
        super();
    }

    public NameFormatException(String message) {
        super(message);
    }
}

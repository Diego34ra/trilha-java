package org.example;

public class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException() {
    }

    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

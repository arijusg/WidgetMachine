package com.interview.engineAssembly;

public class WrongFuelException extends RuntimeException {
    public WrongFuelException() {
    }

    public WrongFuelException(String message) {
        super(message);
    }
}
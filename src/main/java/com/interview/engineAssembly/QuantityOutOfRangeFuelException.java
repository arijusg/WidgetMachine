package com.interview.engineAssembly;

public class QuantityOutOfRangeFuelException extends RuntimeException {
    public QuantityOutOfRangeFuelException() {
    }

    public QuantityOutOfRangeFuelException(String message) {
        super(message);
    }
}
package main.java.com.interview;

public class QuantityOutOfRangeFuelException extends RuntimeException {
    public QuantityOutOfRangeFuelException() {
    }

    public QuantityOutOfRangeFuelException(String message) {
        super(message);
    }
}
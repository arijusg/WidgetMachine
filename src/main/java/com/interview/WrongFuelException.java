package main.java.com.interview;

public class WrongFuelException extends RuntimeException {
    public WrongFuelException() {
    }

    public WrongFuelException(String message) {
        super(message);
    }
}
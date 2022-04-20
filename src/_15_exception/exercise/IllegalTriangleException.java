package _15_exception.exercise;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalTriangleException(String message) {
        super(message);
    }
}

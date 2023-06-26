package ru.skypro.homework_215.exception;

public class ElementnotFoundException extends RuntimeException {
    public ElementnotFoundException() {
    }

    public ElementnotFoundException(String message) {
        super(message);
    }

    public ElementnotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ElementnotFoundException(Throwable cause) {
        super(cause);
    }

    public ElementnotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

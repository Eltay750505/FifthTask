package java.ru.mail.gasimov.task5.exception;

public class CustomThreadException extends Exception {
    public CustomThreadException() {
        super();
    }

    public CustomThreadException(String message) {
        super(message);
    }

    public CustomThreadException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomThreadException(Throwable cause) {
        super(cause);
    }

    protected CustomThreadException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

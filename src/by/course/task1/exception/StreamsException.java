package by.course.task1.exception;


public class StreamsException extends Exception {
    private String text;

    public String getText() {
        return text;
    }

    public StreamsException(String message, String fileName) {
        super(message);
        this.text = fileName;
    }

    public StreamsException() {
        super();
    }

    public StreamsException(String message) {
        super(message);
    }

    public StreamsException(String message, Throwable cause) {
        super(message, cause);
    }

    public StreamsException(Throwable cause) {
        super(cause);
    }
}

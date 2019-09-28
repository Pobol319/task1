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

}

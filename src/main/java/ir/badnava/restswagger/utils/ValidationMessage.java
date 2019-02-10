package ir.badnava.restswagger.utils;

public class ValidationMessage {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ValidationMessage(String message) {
        this.message = message;
    }

    public ValidationMessage(String filedName, String message) {
        this.message = filedName + " " + message;
    }

}

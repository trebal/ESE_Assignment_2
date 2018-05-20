package Builders;

public class BuilderException extends Exception {

    private String message;

    BuilderException(String message) {
        this.message = message;
    }
}

package Builders;

/**
 * An exception class meant to be thrown by <b>DrawingBuilder</b>.
 *
 * @author Ramon de Llano Chamorro
 * @version 1.0
 * @see DrawingBuilder
 */
public class BuilderException extends Exception {
    /**
     * The message to be displayed.
     */
    private String message;

    /**
     * The constructor of the class.
     * @param message The message.
     */
    BuilderException(String message) {
        this.message = message;
    }
}

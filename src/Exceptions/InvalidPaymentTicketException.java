package Exceptions;

public class InvalidPaymentTicketException extends Exception {
    public InvalidPaymentTicketException(String message) {
        super(message);
    }
}

package Payment;

public interface PaymentMethod {
     void pay(double paymentSum) throws PaymentException;
}

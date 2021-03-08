package Payment;

public class CashPayment implements PaymentMethod {
    String payerName;
    String currency;
    CashPayment(String payerName, String currency){
        this.payerName=payerName;
        this.currency=currency;
    }
    public void pay(double paymentSum) throws PaymentException{
        System.out.printf("%s paid %f%s using cash%n", this.payerName, paymentSum,this.currency);
    }
}

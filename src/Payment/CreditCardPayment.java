package Payment;

public class CreditCardPayment implements PaymentMethod{
    private String creditCardCompany;
    private int creditCardNum;
    private String expDate;
    private String ownerName;
    private String currency;

    CreditCardPayment(String creditCardCompany, int creditCardNum, String expDate, String ownerName, String currency){
        this.creditCardCompany=creditCardCompany;
        this.creditCardNum=creditCardNum;
        this.expDate=expDate;
        this.ownerName=ownerName;
        this.currency=currency;
    }

    public void pay(double paymentSum) throws PaymentException{
        System.out.printf("%s paid %f%s using %s credit card number %d with expiration date %s%n", this.ownerName, paymentSum, this.currency, this.creditCardCompany, this.creditCardNum, this.expDate);
    }
}

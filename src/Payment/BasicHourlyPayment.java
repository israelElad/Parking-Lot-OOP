package Payment;

import java.util.Date;

public class BasicHourlyPayment implements PaymentCalculation {
    private double dollarsPerHour;

    public BasicHourlyPayment(double dollarsPerHour) {
        this.dollarsPerHour = dollarsPerHour;
    }

    @Override
    public double calculatePaymentSum(ParkingTicket parkingTicket) {
        int parkingDurationInHours =
                new Date().getHours() - parkingTicket.getParkingTime().getHours();
        return dollarsPerHour * parkingDurationInHours;
    }
}

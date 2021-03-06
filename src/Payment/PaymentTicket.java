package Payment;

import Parking.ParkingSpot;

import java.util.Date;

public class PaymentTicket {
    private int vehicleID;
    private ParkingSpot parkingSpot;
    private Date parkingTime;
    private Date unparkingTime;
    private double paymentSum;

    public PaymentTicket(int vehicleID, ParkingSpot parkingSpot,
                         Date parkingTime, Date unparkingTime,
                         double paymentSum) {
        this.vehicleID = vehicleID;
        this.parkingSpot = parkingSpot;
        this.parkingTime = parkingTime;
        this.unparkingTime = unparkingTime;
        this.paymentSum = paymentSum;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public Date getParkingTime() {
        return parkingTime;
    }

    public Date getUnparkingTime() {
        return unparkingTime;
    }

    public double getPaymentSum() {
        return paymentSum;
    }
}

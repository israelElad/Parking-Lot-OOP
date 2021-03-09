package Users;

import Parking.InvalidParkingTicketException;
import Parking.ParkingLot;
import Parking.ParkingLotIsFullException;
import Payment.ParkingTicket;
import Payment.PaymentMethod;
import Payment.PaymentTicket;
import Payment.InvalidPaymentTicketException;
import Vehicles.Vehicle;

import java.util.concurrent.TimeUnit;

public class CarOwner {
    String name;
    Vehicle vehicle;
    ParkingTicket parkingTicket;
    PaymentTicket paymentTicket;

    public CarOwner(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
        this.parkingTicket = null;
        this.paymentTicket = null;
    }

    public ParkingTicket parkVehicle(ParkingLot parkingLot) {
        int numOfTries = 5;
        while (numOfTries > 0) {
            try {
                this.parkingTicket = parkingLot.parkVehicle(vehicle);
            } catch (ParkingLotIsFullException parkingLotIsFullException) {
                handleFullParkingLotException(parkingLotIsFullException);
            }
            numOfTries--;
        }
        return this.parkingTicket;
    }

    private void handleFullParkingLotException(ParkingLotIsFullException parkingLotIsFullException) {
        parkingLotIsFullException.printStackTrace();
        try {
            TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public PaymentTicket pay(ParkingLot parkingLot, PaymentMethod paymentMethod) {

        try {
            this.paymentTicket = parkingLot.pay(this.parkingTicket, paymentMethod);
        } catch (InvalidParkingTicketException e) {
            e.printStackTrace();
        }
        return this.paymentTicket;
    }

    public void unparkVehicle(ParkingLot parkingLot) {
        try {
            parkingLot.unparkVehicle(this.vehicle, this.paymentTicket);
        }
        catch (InvalidPaymentTicketException e) {
            e.printStackTrace();
        }
    }


}

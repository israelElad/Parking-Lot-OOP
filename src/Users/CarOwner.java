package Users;

import Exceptions.InvalidParkingTicketException;
import Exceptions.ParkingLotIsFullException;
import Parking.ParkingLotFacade;
import Payment.ParkingTicket;
import Payment.PaymentMethod;
import Payment.PaymentTicket;
import Exceptions.InvalidPaymentTicketException;
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

    public ParkingTicket parkVehicle(ParkingLotFacade parkingLot) {
        int numOfTries = 5;
        while (numOfTries > 0) {
            try {
                this.parkingTicket = parkingLot.parkVehicle(vehicle);
                break;
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

    public PaymentTicket pay(ParkingLotFacade parkingLot, PaymentMethod paymentMethod) {

        try {
            this.paymentTicket = parkingLot.pay(this.parkingTicket, paymentMethod);
        } catch (InvalidParkingTicketException e) {
            e.printStackTrace();
        }
        return this.paymentTicket;
    }

    public void unparkVehicle(ParkingLotFacade parkingLot) {
        try {
            parkingLot.unparkVehicle(this.vehicle, this.paymentTicket);
        }
        catch (InvalidPaymentTicketException e) {
            e.printStackTrace();
        }
    }


}

package Users;

import Parking.ParkingLot;
import Parking.ParkingLotIsFullException;
import Payment.ParkingTicket;
import Payment.PaymentMethod;
import Payment.PaymentTicket;
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
        System.out.println(parkingLotIsFullException.getMessage());
        try {
            TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public PaymentTicket pay(ParkingLot parkingLot, PaymentMethod paymentMethod) {
        if (this.parkingTicket == null) {
            //todo: throw exception
        }
        this.paymentTicket = parkingLot.pay(this.parkingTicket, paymentMethod);
        return this.paymentTicket;
    }

    public void unparkVehicle(ParkingLot parkingLot) throws Exception {
        if (this.paymentTicket == null) {
            //todo: throw exception
        }
        parkingLot.unparkVehicle(this.vehicle, this.paymentTicket);
    }


}

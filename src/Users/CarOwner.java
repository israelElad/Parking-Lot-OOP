package Users;

import Parking.ParkingLot;
import Payment.ParkingTicket;
import Payment.PaymentMethod;
import Payment.PaymentTicket;
import Vehicles.Vehicle;

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

    public ParkingTicket parkVehicle(ParkingLot parkingLot) throws Exception {
        this.parkingTicket = parkingLot.parkVehicle(vehicle);//todo: handle exception
        return this.parkingTicket;
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

package Parking;

import Payment.ParkingTicket;
import Vehicles.Vehicle;

import java.util.Iterator;

public interface ParkingLevel {

    ParkingTicket parkVehicle(
            Vehicle vehicle);
    void unparkVehicle(Vehicle vehicle);

    Iterator<ParkingSpot> getParkingSpotsIterator();

}

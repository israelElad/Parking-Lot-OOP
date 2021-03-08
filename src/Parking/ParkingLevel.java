package Parking;

import Payment.ParkingTicket;
import Vehicles.Vehicle;

import java.util.Iterator;

public interface ParkingLevel {

    int getNumOfVacantSpotsOfType(ParkingSpotType parkingSpotType);

    int getTotalNumOfVacantSpots();


    ParkingSpot parkVehicle(Vehicle vehicle);

    void unparkVehicle(Vehicle vehicle);

    Iterable<ParkingSpot> getParkingSpotsIterator(ParkingSpotType parkingSpotType);

    void addSpot(ParkingSpot parkingSpot);
    void removeSpot(ParkingSpot parkingSpot);

    void setParkingAssignmentPolicy(ParkingAssignmentPolicy parkingAssignmentPolicy);
}

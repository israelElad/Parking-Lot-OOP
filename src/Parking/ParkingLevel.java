package Parking;

import Payment.ParkingTicket;
import Payment.PaymentException;
import Payment.PaymentTicket;
import Vehicles.Vehicle;

import java.util.Iterator;

public interface ParkingLevel {

    int getNumOfVacantSpotsOfType(ParkingSpotType parkingSpotType);

    int getTotalNumOfVacantSpots();


    ParkingSpot parkVehicle(Vehicle vehicle);

    public void unparkVehicle(Vehicle vehicle, PaymentTicket paymentTicket);

    void addSpot(ParkingSpot parkingSpot);
    void removeSpot(ParkingSpot parkingSpot);

    void setParkingAssignmentPolicy(ParkingAssignmentPolicy parkingAssignmentPolicy);
}

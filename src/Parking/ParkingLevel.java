package Parking;

import Payment.PaymentTicket;
import Vehicles.Vehicle;

public interface ParkingLevel {

    int getID();

    int getNumOfVacantSpotsOfType(ParkingSpotType parkingSpotType);

    int getTotalNumOfVacantSpots();


    ParkingSpot parkVehicle(Vehicle vehicle, ParkingAssignmentPolicy parkingAssignmentPolicy);

    public void unparkVehicle(Vehicle vehicle, PaymentTicket paymentTicket);

    void addSpot(ParkingSpot parkingSpot);
    void removeSpot(ParkingSpot parkingSpot);

    void setParkingAssignmentPolicy(ParkingAssignmentPolicy parkingAssignmentPolicy);
}

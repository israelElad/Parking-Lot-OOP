package Parking;

import Vehicles.Vehicle;

public interface ParkingAssignmentPolicy {
    ParkingSpot assignSpot(ParkingLevel parkingLevel, Vehicle vehicle);
}

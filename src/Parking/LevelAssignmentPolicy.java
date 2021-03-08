package Parking;

import Vehicles.Vehicle;

public interface LevelAssignmentPolicy {
    ParkingLevel assignLevel
            (ParkingLevelsCollection levels, Vehicle vehicle);
}

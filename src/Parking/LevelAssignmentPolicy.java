package Parking;

import Vehicles.Vehicle;

public interface LevelAssignmentPolicy {
    ParkingLevel assignLevel
            (ParkingLevelsCollection nonFullLevels, Vehicle vehicle);
}

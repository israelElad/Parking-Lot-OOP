package Parking.Policies;

import Parking.ParkingLevel;
import Parking.ParkingLevelsCollection;
import Vehicles.Vehicle;

public interface LevelAssignmentPolicy {
    ParkingLevel assignLevel
            (ParkingLevelsCollection levels, Vehicle vehicle);
}

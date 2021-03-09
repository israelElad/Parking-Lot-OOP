package Parking.Policies;

import Parking.ParkingLevel;
import Parking.ParkingLevelsCollection;
import Vehicles.Vehicle;

public interface LevelAssignmentPolicy {
    ParkingLevel assignLevel
            (Iterable<ParkingLevel> levels, Vehicle vehicle);
}

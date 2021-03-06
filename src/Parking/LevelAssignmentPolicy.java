package Parking;

import Vehicles.Vehicle;

import java.util.Collection;

public interface LevelAssignmentPolicy {
    ParkingLevel assignLevel
            (Collection<ParkingLevel> nonFullLevels, Vehicle vehicle);
}

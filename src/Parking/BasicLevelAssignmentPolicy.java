package Parking;

import Vehicles.Vehicle;

public class BasicLevelAssignmentPolicy implements LevelAssignmentPolicy{
    @Override
    public ParkingLevel assignLevel(ParkingLevelsCollection levels, Vehicle vehicle) {
        return levels.iterator().next();
    }
}

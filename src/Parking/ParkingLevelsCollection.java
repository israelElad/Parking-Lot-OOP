package Parking;

import java.util.Collection;

public interface ParkingLevelsCollection extends Collection<ParkingLevel> {
    ParkingLevel getParkingLevel(int parkingLevelID);
}
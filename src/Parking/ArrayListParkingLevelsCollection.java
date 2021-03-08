package Parking;

import java.util.ArrayList;

public class ArrayListParkingLevelsCollection extends ArrayList<ParkingLevel> implements ParkingLevelsCollection {
    @Override
    public ParkingLevel getParkingLevel(int parkingLevelID) {
        for (ParkingLevel parkingLevel : this) {
            if (parkingLevel.getID() == parkingLevelID) {
                return parkingLevel;
            }
        }
        return null;
    }
}

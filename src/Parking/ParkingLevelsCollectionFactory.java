package Parking;

import java.util.Collection;
import java.util.Map;

public class ParkingLevelsCollectionFactory {
    public static ParkingLevelsCollection createParkingLevelsCollection() {
        ParkingLevelsCollection collection =
                new ArrayListParkingLevelsCollection();
        int id=0;
        Map<ParkingSpotType, Collection<ParkingSpot>> allSpotsForLevel;
        VehicleToParkingSpotTypeMapper possibleSpots;
        return null; // to be continued
    }
}

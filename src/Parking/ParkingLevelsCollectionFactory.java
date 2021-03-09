package Parking;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class ParkingLevelsCollectionFactory {
    public static ParkingLevelsCollection createParkingLevelsCollection() {
        ParkingLevelsCollection collection =
                new ArrayListParkingLevelsCollection();
        int parkingSpotID = 0;
        int parkingLevelID = 0;
        int numOfParkingSpotTypes = ParkingSpotType.values().length;
        ArrayList<ParkingSpot>
        for (int i=0; i<100; i++) {

        }
        ParkingSpot parkingSpot = new ParkingSpot(parkingSpotID,
                parkingLevelID, )
        Map<ParkingSpotType, Collection<ParkingSpot>> allSpotsForLevel;
        VehicleToParkingSpotTypeMapper possibleSpots;
        ParkingLevel parkingLevel = new CParkingLevel(id, allSpotsForLevel,
                possibleSpots);
        return null; // to be continued
    }
}

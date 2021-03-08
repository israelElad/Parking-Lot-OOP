package DisplayBoard;

import Parking.ParkingLevel;
import Parking.ParkingLevelsCollection;
import Parking.ParkingSpotType;

public class ConsoleDisplayBoard implements IDisplayBoard{
    public void displayNumOfVacantSpotsForEachLevel(ParkingLevelsCollection levels){
        System.out.println("Vacant spots on each level:");
        for(ParkingLevel level:levels){
            System.out.println("Level " + level.getLevelNum()+ ":");
            System.out.println("Total: " +level.getTotalNumOfVacantSpots());
            for(ParkingSpotType parkingSpotType: ParkingSpotType.values()) {
                System.out.println(parkingSpotType+": " + level.getNumOfVacantSpotsOfType(parkingSpotType));
            }
            System.out.println("____________________________________");
        }
    }
}

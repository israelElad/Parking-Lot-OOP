package Parking;

import Vehicles.Vehicle;

import java.util.Collection;
import java.util.Map;

public class BasicParkingAssignmentPolicy implements ParkingAssignmentPolicy {
    @Override
    public ParkingSpot assignSpot(Map<ParkingSpotType,
            Collection<ParkingSpot>> vacantSpots, Collection<ParkingSpotType> possibleParkingSpotTypes) {
        ParkingSpotType parkingSpotType =
                possibleParkingSpotTypes.iterator().next();
        return vacantSpots.get(parkingSpotType).iterator().next();
    }
}

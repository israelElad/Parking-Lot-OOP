package Parking.Policies;

import Parking.ParkingSpot;
import Parking.ParkingSpotType;
import Vehicles.Vehicle;

import java.util.Collection;
import java.util.Map;

public interface ParkingAssignmentPolicy {
    ParkingSpot assignSpot(Map<ParkingSpotType,
            Collection<ParkingSpot>> vacantSpots, Collection<ParkingSpotType> possibleParkingSpotTypes);
}

package Parking;

import java.util.Collection;

public interface ParkingSpotsCollection extends Collection<ParkingSpot> {
    int getNumOfSpots();
}

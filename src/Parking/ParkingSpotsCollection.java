package Parking;

import java.util.Iterator;

public interface ParkingSpotsCollection extends Iterator<ParkingSpot>{
    int getNumOfSpots();
    boolean contains(ParkingSpot parkingSpot);
    void add(ParkingSpot parkingSpot);
    void remove(ParkingSpot parkingSpot);
}

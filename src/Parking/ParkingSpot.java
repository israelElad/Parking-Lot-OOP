package Parking;

public class ParkingSpot {

    private int parkingSpotID;
    private int parkingLevelID;
    private ParkingSpotType parkingSpotType;

    public ParkingSpot(int parkingSpotID, int parkingLevelID, ParkingSpotType parkingSpotType) {
        this.parkingSpotID = parkingSpotID;
        this.parkingLevelID = parkingLevelID;
        this.parkingSpotType = parkingSpotType;
    }

    public int getParkingSpotID() {
        return parkingSpotID;
    }

    public int getParkingLevelID() {
        return parkingLevelID;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }
}

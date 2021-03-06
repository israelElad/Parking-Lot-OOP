package Parking;

public class ParkingSpot {

    private int parkingSpotID;
    private ParkingLevel parkingLevel;
    private ParkingSpotType parkingSpotType;

    public ParkingSpot(int parkingSpotID, ParkingLevel parkingLevel, ParkingSpotType parkingSpotType) {
        this.parkingSpotID = parkingSpotID;
        this.parkingLevel = parkingLevel;
        this.parkingSpotType = parkingSpotType;
    }

    public int getParkingSpotID() {
        return parkingSpotID;
    }

    public ParkingLevel getParkingLevel() {
        return parkingLevel;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }
}

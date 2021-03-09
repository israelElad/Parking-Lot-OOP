package Parking;

public class ParkingLotIsFullException extends Exception{
    public ParkingLotIsFullException(String message) {
        super(message);
    }
}

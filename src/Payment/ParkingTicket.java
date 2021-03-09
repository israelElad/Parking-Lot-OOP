package Payment;

import Parking.ParkingSpot;

import java.util.Date;

public class ParkingTicket {


    private int vehicleID;
    private ParkingSpot parkingSpot;
    private Date parkingTime;


    public ParkingTicket(int vehicleID, ParkingSpot parkingSpot, Date parkingTime) {
        this.vehicleID = vehicleID;
        this.parkingSpot = parkingSpot;
        this.parkingTime = parkingTime;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public Date getParkingTime() {
        return parkingTime;
    }

    @Override
    public String toString() {
        return "Parking ticket:\n" +
                "vehicleID=" + vehicleID + "\n" +
                "parkingSpot=" + parkingSpot.getParkingSpotID() + " on level " + parkingSpot.getParkingLevelID()+ "\n" +
                "parkingTime=" + parkingTime + "\n";
    }
}

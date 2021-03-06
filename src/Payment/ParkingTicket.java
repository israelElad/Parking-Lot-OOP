package Payment;

import Parking.ParkingLevel;
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
}

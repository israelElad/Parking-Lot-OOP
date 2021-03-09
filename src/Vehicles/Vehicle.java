package Vehicles;

public class Vehicle {

    private int ID;
    private VehicleType vehicleType;

    public Vehicle(int ID, VehicleType vehicleType) {
        this.ID = ID;
        this.vehicleType = vehicleType;
    }

    public int getID() {
        return this.ID;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }
}

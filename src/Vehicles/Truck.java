package Vehicles;

public class Truck implements Vehicle {

    int ID;
    VehicleType vehicleType;

    public Truck(int ID) {
        this.ID = ID;
        this.vehicleType = VehicleType.TRUCK;
    }

    @Override
    public int getID() {
        return this.ID;
    }

    @Override
    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

}

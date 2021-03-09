package Vehicles;

public class Motorcycle implements Vehicle{
    int ID;
    VehicleType vehicleType;

    public Motorcycle(int ID) {
        this.ID = ID;
        this.vehicleType = VehicleType.MOTORCYCLE;
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

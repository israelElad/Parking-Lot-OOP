package Vehicles;

public class Car implements Vehicle {

    int ID;
    VehicleType vehicleType;

    public Car(int ID) {
        this.ID = ID;
        this.vehicleType = VehicleType.CAR;
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

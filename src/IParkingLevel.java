public interface IParkingLevel {

    //todo:  Ticket?  IVehicle?
    Ticket parkVehicle(IVehicle v, IParkingAssignment a);

    //todo: ParkingSpot?
    Iterator<ParkingSpot> getParkingSpotsIterator();

}

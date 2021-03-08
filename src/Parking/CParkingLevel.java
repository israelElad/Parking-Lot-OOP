package Parking;

import Payment.ParkingTicket;
import Vehicles.Vehicle;

import java.util.Iterator;
import java.util.Map;

public class CParkingLevel implements ParkingLevel {

    private Map<ParkingSpotType, ParkingSpotsCollection> vacantSpots;
    private Map<ParkingSpotType, ParkingSpotsCollection> takenSpots;
    private int totalNumOfVacantSpots;
    private ParkingAssignmentPolicy parkingAssignmentPolicy;

    CParkingLevel(Map<ParkingSpotType, ParkingSpotsCollection> allSpotsForLevel) {
        this.vacantSpots = allSpotsForLevel;
        this.totalNumOfVacantSpots =
                allSpotsForLevel.values().stream().
                        mapToInt(ParkingSpotsCollection::getNumOfSpots).sum();
    }

    @Override
    public int getNumOfVacantSpotsOfType(ParkingSpotType parkingSpotType) {
        return vacantSpots.get(parkingSpotType).getNumOfSpots();
    }

    @Override
    public int getTotalNumOfVacantSpots() {
        return totalNumOfVacantSpots;
    }

    @Override
    public Iterable<ParkingSpot> getParkingSpotsIterator(
            ParkingSpotType parkingSpotType) {
        return vacantSpots.get(parkingSpotType);
    }

    @Override
    public void addSpot(ParkingSpot parkingSpot) {
        vacantSpots.get(parkingSpot.getParkingSpotType()).add(parkingSpot);
        totalNumOfVacantSpots++;
    }

    @Override
    public void removeSpot(ParkingSpot parkingSpot) {
        ParkingSpotsCollection vacantSpotsOfType =
                vacantSpots.get(parkingSpot.getParkingSpotType());
        if(vacantSpotsOfType.contains(parkingSpot)) {
            vacantSpotsOfType.remove(parkingSpot);
            totalNumOfVacantSpots--;
            return;
        }
        takenSpots.get(parkingSpot.getParkingSpotType()).remove(parkingSpot);
    }

    @Override
    public void setParkingAssignmentPolicy(ParkingAssignmentPolicy parkingAssignmentPolicy) {
        this.parkingAssignmentPolicy = parkingAssignmentPolicy;
    }

    @Override
    public ParkingSpot parkVehicle(Vehicle vehicle) { //TODO: move from vacant to taken?
        ParkingSpot assignedParkingSpot =
                parkingAssignmentPolicy.assignSpot(this, vehicle);
        totalNumOfVacantSpots--;
        return assignedParkingSpot;
    }

    @Override
    public void unparkVehicle(Vehicle vehicle) {
        totalNumOfVacantSpots++;
    } //TODO: move from taken to vacant?
}

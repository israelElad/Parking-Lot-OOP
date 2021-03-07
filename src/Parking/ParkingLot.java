package Parking;

import Payment.*;
import Vehicles.Vehicle;

import java.util.Collection;

public class ParkingLot {
    private ParkingLevelsCollection fullLevels;
    private ParkingLevelsCollection nonFullLevels;
    private LevelAssignmentPolicy levelAssignmentPolicy;
    private PaymentCalculation paymentCalculation;

    public ParkingTicket parkVehicle(Vehicle vehicle) throws Exception {
        ParkingLevel assignedParkingLevel =
                levelAssignmentPolicy.assignLevel(nonFullLevels,
                        vehicle);
        ParkingSpot assignedParkingSpot =
                assignedParkingLevel.parkVehicle(vehicle);

        if (assignedParkingLevel.getTotalNumOfVacantSpots()==0) {
            nonFullLevels.remove(assignedParkingLevel);
            fullLevels.add(assignedParkingLevel);
        }
        return parkingTicket;
    }

    public PaymentTicket pay(ParkingTicket parkingTicket, PaymentMethod paymentMethod) {
        double paymentSum =
                paymentCalculation.calculatePaymentSum(parkingTicket);
        try {
            paymentMethod.pay(paymentSum);
        } catch (PaymentException paymentException) {
            System.out.println("A payment exception occured with the " +
                    "following details: " + paymentException.getMessage());
        }
        return generatePaymentTicket(parkingTicket, paymentSum);
    }

    public void unparkVehicle(Vehicle vehicle, PaymentTicket paymentTicket) {
        paymentTicket.getParkingSpot().getParkingLevel().unparkVehicle(vehicle);
    }

    private ParkingTicket generateParkingTicket() {

    }
    private PaymentTicket generatePaymentTicket(ParkingTicket parkingTicket, double paymentSum) {
        return new PaymentTicket(parkingTicket.getVehicleID(),
                parkingTicket.getParkingSpot(),
                parkingTicket.getParkingTime(),
                java.util.Calendar.getInstance().getTime(),
                paymentSum);
    }


    //admin

    public void setLevelSelectionPolicy(LevelAssignmentPolicy levelAssignmentPolicy) {
        this.levelAssignmentPolicy = levelAssignmentPolicy;
    }

    public void setPaymentPolicy(PaymentCalculation paymentCalculation) {
        this.paymentCalculation = paymentCalculation;
    }

    public ParkingLevel getLevel(int parkingLevelID) {
        ParkingLevel parkingLevel = fullLevels.getParkingLevel(parkingLevelID);
        if (parkingLevel!=null) {
            return parkingLevel;
        }
        return nonFullLevels.getParkingLevel((parkingLevelID));
    }
    public void addLevel(ParkingLevel parkingLevel) {
        nonFullLevels.add(parkingLevel);
    }

    public void removeLevel(ParkingLevel parkingLevel) {
        fullLevels.remove(parkingLevel);
        nonFullLevels.remove(parkingLevel);
    }
}
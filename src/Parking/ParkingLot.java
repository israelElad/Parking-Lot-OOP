package Parking;

import Payment.*;
import Vehicles.Vehicle;

import java.util.Collection;

public class ParkingLot {
    private Collection<ParkingLevel> fullLevels;
    private Collection<ParkingLevel> nonFullLevels;
    private LevelAssignmentPolicy levelAssignmentPolicy;
    private PaymentCalculation paymentCalculation;

    public ParkingTicket parkVehicle(Vehicle vehicle) throws Exception {
        ParkingLevel assignedParkingLevel =
                levelAssignmentPolicy.assignLevel(nonFullLevels,
                        vehicle);
        ParkingTicket parkingTicket = assignedParkingLevel.parkVehicle(vehicle);
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

    void addLevel(ParkingLevel parkingLevel) {
    }

    void removeLevel(ParkingLevel parkingLevel) {
    }
}

package Parking;

import Payment.BasicHourlyPayment;
import Payment.PaymentCalculation;

public class ParkingLotFactory {
    private static final double DOLLARS_PER_HOUR = 5;

    public static ParkingLot createNewParkingLot() {
        ParkingLevelsCollection parkingLevels =
                ParkingLevelsCollectionFactory.createParkingLevelsCollection();
        LevelAssignmentPolicy levelAssignmentPolicy = new BasicLevelAssignmentPolicy();
        ParkingAssignmentPolicy parkingAssignmentPolicy =
                new BasicParkingAssignmentPolicy();
        PaymentCalculation paymentCalculation = new BasicHourlyPayment(DOLLARS_PER_HOUR);
        return new ParkingLot(parkingLevels, levelAssignmentPolicy,
                parkingAssignmentPolicy, paymentCalculation);
    }
}

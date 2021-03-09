import Parking.*;
import Payment.ParkingTicket;
import Users.CarOwner;
import Vehicles.Vehicle;
import Vehicles.VehicleType;

import java.util.*;

public class Main {
    private static final String ADMIN_PASS = "123456";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ParkingLot parkingLot = ParkingLotFactory.createNewParkingLot();

        while (true) {
            System.out.println("Welcome to our parking lot.\nEnter 1 if you're a car owner, 2 for admin's panel:");
            int userType = scanner.nextInt();

            if (userType == 2) {   //admin
                handleAdmin(scanner, parkingLot);
            } else if (userType == 1) {   //car owner
                handleCarOwner(scanner, parkingLot);
            }
        }
    }

    static void handleAdmin(Scanner scanner, ParkingLot parkingLot) {

        System.out.println("Password:");
        String password = scanner.next();
        if (!password.equals(ADMIN_PASS)) {
            System.out.println("Wrong password!");
            return;
        }
        System.out.println("Welcome Admin. What would you like to do?");
        System.out.println("Press 1 to close the parking lot.");
        System.out.println("Press 2 to add level");
        System.out.println("Press 3 to remove level");
        System.out.println("Press 4 to set level selection policy");
        System.out.println("Press 5 to set payment policy");
        System.out.println("Press 0 to finish");
        int adminsChoice = scanner.nextInt();
        switch (adminsChoice) {
            case 1:
                System.exit(0);
                break;
            case 0:
                return;
            default:
                System.out.println("invalid or not implemented choice.");
                break;
        }
    }

    static void handleCarOwner(Scanner scanner, ParkingLot parkingLot) {
        System.out.println("Welcome, Please enter your name:");
        String carOwnerName = scanner.next();

        System.out.println("Please enter your vehicle's ID:");
        int carID = scanner.nextInt();

        System.out.print("Please enter your vehicle's type:\n"+
                "0 for motorcycle\n" +
                "1 for car\n" +
                "2 for truck\n");
        VehicleType vehicleType = VehicleType.values()[scanner.nextInt()];

        Vehicle vehicle = new Vehicle(carID, vehicleType);

        CarOwner carOwner = new CarOwner(carOwnerName, vehicle);

        System.out.println("Press 1 to park, 2 to unpark:");
        int carOwnersChoice = scanner.nextInt();
        switch (carOwnersChoice) {
            case 1: //park
                ParkingTicket parkingTicket = carOwner.parkVehicle(parkingLot);
                System.out.println(parkingTicket);
                break;
            default:
                System.out.println("invalid or not implemented choice.");
                break;
        }
    }
}

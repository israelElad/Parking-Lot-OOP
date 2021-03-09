package Parking;

import Exceptions.InvalidParkingTicketException;
import Exceptions.InvalidPaymentTicketException;
import Exceptions.ParkingLotIsFullException;
import Payment.ParkingTicket;
import Payment.PaymentMethod;
import Payment.PaymentTicket;
import Vehicles.Vehicle;

public interface ParkingLotFacade {
    ParkingTicket parkVehicle(Vehicle vehicle) throws ParkingLotIsFullException;
    void unparkVehicle(Vehicle vehicle, PaymentTicket paymentTicket) throws InvalidPaymentTicketException;
    PaymentTicket pay(ParkingTicket parkingTicket,
                      PaymentMethod paymentMethod) throws InvalidParkingTicketException;
}

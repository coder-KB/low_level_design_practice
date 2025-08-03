import CommonEnums.DurationType;
import ParkingFeesStrategy.ConcreateClasses.BasicHourlyRateStrategy;
import ParkingFeesStrategy.ConcreateClasses.PremiumRateStrategy;
import ParkingFeesStrategy.ParkingFeeStrategy;
import ParkingLotController.ParkingLot;
import ParkingSpots.ConcreateClasses.BikeParkingSpot;
import ParkingSpots.ConcreateClasses.CarParkingSpot;
import ParkingSpots.ParkingSpot;
import PaymentStrategy.ConcreateClasses.CashPaymentStrategy;
import PaymentStrategy.ConcreateClasses.CreditCardPaymentStrategy;
import PaymentStrategy.PaymentStrategy;
import VehicleFactory.Vehicle;
import VehicleFactory.VehicleFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParkingLotMain {
    public static void main(String[] args) {
        // Initialize parking spots
        List<ParkingSpot> parkingSpots = new ArrayList<>();
        parkingSpots.add(new CarParkingSpot(1, "car"));
        parkingSpots.add(new CarParkingSpot(2, "car"));
        parkingSpots.add(new BikeParkingSpot(3, "bike"));
        parkingSpots.add(new BikeParkingSpot(4, "bike"));
        // Initialize parking lot
        ParkingLot parkingLot = new ParkingLot(parkingSpots);
        // Create fee strategies
        ParkingFeeStrategy basicHourlyRateStrategy = new BasicHourlyRateStrategy();
        ParkingFeeStrategy premiumRateStrategy = new PremiumRateStrategy();
        // Create vehicles using Factory Pattern with fee strategies
        Vehicle car1 = VehicleFactory.createVehicle("Car", "CAR123", basicHourlyRateStrategy);
        Vehicle car2 = VehicleFactory.createVehicle("Car", "CAR345", basicHourlyRateStrategy);

        Vehicle bike1 = VehicleFactory.createVehicle("Bike", "BIKE456", premiumRateStrategy);
        Vehicle bike2 = VehicleFactory.createVehicle("Bike", "BIKE123", premiumRateStrategy);

        // Park vehicles
        ParkingSpot carSpot = parkingLot.parkVehicle(car1);
        ParkingSpot bikeSpot = parkingLot.parkVehicle(bike1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select payment method for your vehicle:");
        System.out.println("1. Credit Card");
        System.out.println("2. Cash");
        int paymentMethod = scanner.nextInt();
        // Process payments using Strategy Patterns
        if (carSpot != null) {
            // Calculate fee using the specific strategy for the vehicle
            double carFee = car1.calculateFee(2, DurationType.HOURS);
            PaymentStrategy carPaymentStrategy =
                    getPaymentStrategy(paymentMethod, carFee);
            carPaymentStrategy.processPayment(carFee);
            parkingLot.vacateSpot(carSpot, car1);
        }
        if (bikeSpot != null) {
            // Calculate fee using the specific strategy for the vehicle
            double bikeFee = bike1.calculateFee(3, DurationType.HOURS);
            PaymentStrategy bikePaymentStrategy =
                    getPaymentStrategy(paymentMethod, bikeFee);
            bikePaymentStrategy.processPayment(bikeFee);
            parkingLot.vacateSpot(bikeSpot, bike1);
        }
        scanner.close();
    }
    private static PaymentStrategy getPaymentStrategy(
            int paymentMethod, double fee) {
        switch (paymentMethod) {
            case 1:
                return new CreditCardPaymentStrategy(fee);
            case 2:
                return new CashPaymentStrategy(fee);
            default:
                System.out.println("Invalid choice! Default to Credit card payment.");
                return new CreditCardPaymentStrategy(fee);
        }
    }
}

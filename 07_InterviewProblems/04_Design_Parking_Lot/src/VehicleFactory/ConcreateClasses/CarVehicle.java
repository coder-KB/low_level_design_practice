package VehicleFactory.ConcreateClasses;

import ParkingFeesStrategy.ParkingFeeStrategy;
import VehicleFactory.Vehicle;

public class CarVehicle extends Vehicle {
    public CarVehicle(String licensePlate, ParkingFeeStrategy feeStrategy) {
        super(licensePlate, "car", feeStrategy);
    }
}

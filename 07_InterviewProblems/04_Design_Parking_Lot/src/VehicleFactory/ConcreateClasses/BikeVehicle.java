package VehicleFactory.ConcreateClasses;

import ParkingFeesStrategy.ParkingFeeStrategy;
import VehicleFactory.Vehicle;

public class BikeVehicle extends Vehicle {
    public BikeVehicle(String licensePlate, ParkingFeeStrategy feeStrategy) {
        super(licensePlate, "bike", feeStrategy);
    }
}

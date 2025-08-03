package VehicleFactory;

import ParkingFeesStrategy.ParkingFeeStrategy;
import VehicleFactory.ConcreateClasses.BikeVehicle;
import VehicleFactory.ConcreateClasses.CarVehicle;

public class VehicleFactory {
    public static Vehicle createVehicle(String vehicleType, String licensePlate, ParkingFeeStrategy feeStrategy) {
        return switch (vehicleType.toLowerCase()) {
            case "car" -> new CarVehicle(licensePlate, feeStrategy);
            case "bike" -> new BikeVehicle(licensePlate, feeStrategy);
            default -> throw new UnsupportedOperationException("Invalid Vehicle Type");
        };
    }
}

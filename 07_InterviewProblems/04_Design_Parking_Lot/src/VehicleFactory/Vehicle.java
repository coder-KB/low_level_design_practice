package VehicleFactory;

import CommonEnums.DurationType;
import ParkingFeesStrategy.ParkingFeeStrategy;

public abstract class Vehicle {
    private String licensePlate;
    private String vehicleType;
    private ParkingFeeStrategy feeStrategy;

    public Vehicle(String licensePlate, String vehicleType, ParkingFeeStrategy feeStrategy) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
        this.feeStrategy = feeStrategy;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public double calculateFee(int duration, DurationType durationType) {
        return feeStrategy.calculateFee(vehicleType, duration, durationType);
    }
}

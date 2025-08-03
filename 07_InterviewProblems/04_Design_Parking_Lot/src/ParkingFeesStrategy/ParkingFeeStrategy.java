package ParkingFeesStrategy;

import CommonEnums.DurationType;

public interface ParkingFeeStrategy {
    double calculateFee(String vehicleType, int duration, DurationType durationType);
}

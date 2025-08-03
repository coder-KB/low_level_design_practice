package ParkingFeesStrategy.ConcreateClasses;

import CommonEnums.DurationType;
import ParkingFeesStrategy.ParkingFeeStrategy;

public class BasicHourlyRateStrategy implements ParkingFeeStrategy {

    @Override
    public double calculateFee(String vehicleType, int duration, DurationType durationType) {
        return switch (vehicleType.toLowerCase()) {
            case "car" -> durationType == DurationType.HOURS ?
                    duration * 10.0 :
                    duration * 10.0 * 24;
            case "bike" -> durationType == DurationType.HOURS ?
                    duration * 8.0 :
                    duration * 8.0 * 24;
            default -> durationType == DurationType.HOURS ?
                    duration * 12.0 :
                    duration * 12.0 * 24;
        };
    }
}

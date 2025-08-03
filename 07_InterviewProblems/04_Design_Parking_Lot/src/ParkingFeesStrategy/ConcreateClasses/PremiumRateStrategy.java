package ParkingFeesStrategy.ConcreateClasses;

import CommonEnums.DurationType;
import ParkingFeesStrategy.ParkingFeeStrategy;

public class PremiumRateStrategy implements ParkingFeeStrategy {

    @Override
    public double calculateFee(String vehicleType, int duration, DurationType durationType) {
        return switch (vehicleType.toLowerCase()) {
            case "car" -> durationType == DurationType.HOURS ?
                    duration * 20.0 :
                    duration * 20.0 * 24;
            case "bike" -> durationType == DurationType.HOURS ?
                    duration * 18.0 :
                    duration * 18.0 * 24;
            default -> durationType == DurationType.HOURS ?
                    duration * 22.0 :
                    duration * 22.0 * 24;
        };
    }
}

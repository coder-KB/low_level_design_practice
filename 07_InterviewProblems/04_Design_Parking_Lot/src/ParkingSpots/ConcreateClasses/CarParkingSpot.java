package ParkingSpots.ConcreateClasses;

import ParkingSpots.ParkingSpot;
import VehicleFactory.Vehicle;

public class CarParkingSpot extends ParkingSpot {
    public CarParkingSpot(int slotNumber, String slotType) {
        super(slotNumber, slotType);
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return vehicle.getVehicleType().equalsIgnoreCase("car");
    }
}

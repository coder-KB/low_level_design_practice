package ParkingSpots.ConcreateClasses;

import ParkingSpots.ParkingSpot;
import VehicleFactory.Vehicle;

public class BikeParkingSpot extends ParkingSpot {
    public BikeParkingSpot(int slotNumber, String slotType) {
        super(slotNumber, slotType);
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return vehicle.getVehicleType().equalsIgnoreCase("bike");
    }
}

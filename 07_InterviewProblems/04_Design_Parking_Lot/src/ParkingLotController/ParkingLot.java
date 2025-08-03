package ParkingLotController;

import ParkingSpots.ParkingSpot;
import VehicleFactory.Vehicle;

import java.util.List;

public class ParkingLot {
    private List<ParkingSpot> parkingSpots;

    public ParkingLot(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    private ParkingSpot findAvailableSpot(String vehicleType) {
        for(ParkingSpot spot: parkingSpots) {
            if(!spot.isOccupied() && spot.getSlotType().equals(vehicleType)) {
                return spot;
            }
        }
        return null;
    }

    public ParkingSpot parkVehicle(Vehicle vehicle) {
        ParkingSpot parkingSpot = findAvailableSpot(vehicle.getVehicleType());
        if(parkingSpot != null) {
            parkingSpot.parkVehicle(vehicle);
            System.out.println("Vehicle Parked Successfully at " + parkingSpot.getSpotNumber());
            return parkingSpot;
        }

        System.out.println("No Parking Spot Available");
        return null;
    }

    public void vacateSpot(ParkingSpot parkingSpot, Vehicle vehicle) {
        if(parkingSpot != null && parkingSpot.isOccupied() && parkingSpot.getVehicle().equals(vehicle)) {
            parkingSpot.vacate();
            System.out.println(vehicle.getVehicleType() + " vacated the spot: " + parkingSpot.getSpotNumber());
        } else {
            System.out.println("Invalid operation! Either the spot is already vacant "
                    + "or the vehicle does not match.");
        }
    }

    // Method to find a spot by its number
    public ParkingSpot getSpotByNumber(int spotNumber) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.getSpotNumber() == spotNumber) {
                return spot;
            }
        }
        return null; // Spot not found
    }
    // Getter for parking spots
    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }
}

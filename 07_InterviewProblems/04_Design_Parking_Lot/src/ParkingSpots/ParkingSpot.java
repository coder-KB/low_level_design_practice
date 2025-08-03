package ParkingSpots;

import VehicleFactory.Vehicle;

public abstract class ParkingSpot {
    private int spotNumber;
    private boolean isOccupied;
    private Vehicle vehicle;
    private String slotType;

    public ParkingSpot(int spotNumber, String slotType) {
        this.spotNumber = spotNumber;
        this.slotType = slotType;
        this.isOccupied = false;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public abstract boolean canParkVehicle(Vehicle vehicle);

    public void parkVehicle(Vehicle vehicle) {
        if(isOccupied) {
            throw new IllegalStateException("Spot is already occupied");
        }

        if(!canParkVehicle(vehicle)) {
            throw new IllegalArgumentException("This Spot is not suitable for " + vehicle.getVehicleType());
        }

        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    public void vacate() {
        if(!isOccupied) {
            throw new IllegalStateException("Spot is already vacated");
        }

        this.vehicle = null;
        this.isOccupied = false;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getSlotType() {
        return slotType;
    }
}

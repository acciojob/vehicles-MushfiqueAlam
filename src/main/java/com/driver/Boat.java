package com.driver;

public class Boat {
    private String name; // Name of the boat
    private int capacity; // Capacity of the boat

    // Constructor to initialize the boat's name and capacity
    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Implementation of getVehicleName method

    public String getVehicleName() {
        return name;
    }

    // Implementation of getVehicleCapacity method
    public int getVehicleCapacity() {
        return capacity;
    }
}

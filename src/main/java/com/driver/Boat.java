package com.driver;

public class Boat implements WaterVehicle{
   private String vehicleName;
   private int vehicleCapacity;

    public Boat(String vehicleName, int vehicleCapacity) {
        this.vehicleName = vehicleName;
        this.vehicleCapacity = vehicleCapacity;
    }
    public String getVehicleName() {
        return vehicleName;
    }
    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public int getVehicleCapacity() {
        return vehicleCapacity;
    }

    public void setVehicleCapacity(int vehicleCapacity) {
        this.vehicleCapacity = vehicleCapacity;
    }

}

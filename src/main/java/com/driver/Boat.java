<<<<<<< HEAD
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
=======
package com.driver;

public class Boat implements WaterVehicle{
    private String name;
    private int capacity;
    public Boat(String name,int capacity){
        this.name=name;
        this.capacity=capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        return getName();
    }

    @Override
    public int getVehicleCapacity() {
        return getCapacity();
    }
}
>>>>>>> 82b8802c68a276f1c2daa5539f24c0b45ac992ea

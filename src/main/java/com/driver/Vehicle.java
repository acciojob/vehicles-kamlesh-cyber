package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public Vehicle(String name) {
<<<<<<< HEAD
        this.name = name;
        this.currentDirection=0;
        this.currentSpeed=0;
=======
        this.name=name;
        this.currentSpeed=0;
        this.currentDirection=0;
>>>>>>> 82b8802c68a276f1c2daa5539f24c0b45ac992ea

    }

    public void steer(int direction){
        //direction is in degrees, add it to the current direction
<<<<<<< HEAD

        this.currentDirection += direction;

=======
        currentDirection+=direction;
>>>>>>> 82b8802c68a276f1c2daa5539f24c0b45ac992ea
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection
<<<<<<< HEAD
        this.currentSpeed=speed;
        this.currentDirection=direction;
=======
        currentSpeed=speed;
        currentDirection=direction;
>>>>>>> 82b8802c68a276f1c2daa5539f24c0b45ac992ea
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop(){
<<<<<<< HEAD
        this.currentSpeed = 0;
        System.out.println("stop method called - The vehicle is stopped");
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
=======
        this.currentSpeed=0;

        System.out.println("stop method called - The vehicle is stopped");
    }

}
>>>>>>> 82b8802c68a276f1c2daa5539f24c0b45ac992ea

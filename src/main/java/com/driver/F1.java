package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name,4,2,6,isManual,name,1);
        //Use arbitrary values for parameters which are not mentioned
        super(name, 4, 4, 2,isManual,"",5);


    }
    public void accelerate(int rate){
<<<<<<< HEAD
                int newSpeed = getCurrentSpeed()+rate; //set the value of new speed by using currentSpeed and rate
=======
        int newSpeed = 0;
        //set the value of new speed by using currentSpeed and rate
        newSpeed=getCurrentSpeed()+rate;
>>>>>>> 82b8802c68a276f1c2daa5539f24c0b45ac992ea
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
<<<<<<< HEAD
            changeGear(1);
        }
        //for all other cases, change the gear accordingly
        else if (newSpeed>0 && newSpeed<=50) {
            changeGear(1);
        }
        else if(newSpeed>50 && newSpeed<=100){
            changeGear(2);
        }
        else if(newSpeed >100 && newSpeed<=150){
            changeGear(3);
        }
        else if(newSpeed>150 && newSpeed<=200){
            changeGear(4);
        }
        else if(newSpeed>200 && newSpeed<=250){
            changeGear(5);
        }
        else {
            changeGear(6);
        }
=======
            super.stop();
            setCurrentGear(1);

        }
        else if(newSpeed>=1 && newSpeed<=50){
            setCurrentSpeed(newSpeed);
            setCurrentGear(1);
        }
        else if(newSpeed>=51 && newSpeed<=100){
            setCurrentSpeed(newSpeed);
            setCurrentGear(2);
        }
        else if(newSpeed>=101 && newSpeed<=150){
            setCurrentSpeed(newSpeed);
            setCurrentGear(3);
        }
        else if(newSpeed>=151 && newSpeed<=200){
            setCurrentSpeed(newSpeed);
            setCurrentGear(4);
        }
        else if(newSpeed>=201 && newSpeed<=250){
            setCurrentSpeed(newSpeed);
            setCurrentGear(5);
        }
        else if(newSpeed>250){
            setCurrentSpeed(newSpeed);
            setCurrentGear(6);
        }
>>>>>>> 82b8802c68a276f1c2daa5539f24c0b45ac992ea

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }


}
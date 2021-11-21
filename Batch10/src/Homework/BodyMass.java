package Homework;

public class BodyMass {

    public static void main (String []args){

// you can get the meter value of height by dividing it with 100.
        float myHeight=1.695f, myWeight=57.5f;                  // variables start with small letters and
        float bodyMassIndex = myWeight/(myHeight*myHeight);    // continue with camel caps in java etiquette.
        System.out.println("BMI is  " +bodyMassIndex);


    }
}

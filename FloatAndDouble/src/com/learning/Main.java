package com.learning;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 5/3; //myIntValue = 1
        //float myFloatValue1 = (float) 5.4;
        //float myFloatValue2 = 5.4f;
        float myFloatValue = 5f/3f;//myFloatValue = 1.6666666

        //double myDoubleValue2 = 5.25d;
        //double myDoubleValue3 = 5.25;
        double myDoubleValue = 5d/3f; //myDoubleValue = 1.6666666666666667

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //We can use underscores to make the variable cleaner
        int Number = 300_000_000;
        System.out.println(Number);

        //challenge1
        //convert a given number of pounds to kilograms
        double pounds = 200d;
        double kilograms = (pounds*0.45359237d);
        System.out.println(kilograms);

    }
}

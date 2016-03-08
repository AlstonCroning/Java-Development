package com.learning;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B","Dell","250",dimensions);

        Monitor themonitor = new Monitor("21Inch Beast", "Acer",21,new Resolution(1920,1080));

        Motherboard theMotherboard = new Motherboard("BJ-G36","Asus",4,6,"v2.44");

//        solution1
//        PC thePC = new PC(theCase,themonitor,theMotherboard);
//        thePC.getMonitor().drawPixelAt(1500,500,"blue");
//        thePC.getMotherboard().loadProgram("windows 1.0");
//        thePC.getTheCase().pressPowerButton();

        PC thePC = new PC(theCase,themonitor,theMotherboard);
        thePC.powerUp();

    }
}

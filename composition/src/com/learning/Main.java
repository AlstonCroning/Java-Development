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

        //Challenge Question
        Dimensions dimensions1 = new Dimensions(1500,2000,1500);
        BookRack bookRack = new BookRack();
        Bed bed = new Bed(2,2,1);
        Bedroom bedroom = new Bedroom(false,false,dimensions1,bookRack,bed);


        System.out.println("Width = " + bedroom.getDimensions().getWidth());
        System.out.println("Height = " +bedroom.getDimensions().getHeight());
        System.out.println("Depth = " +bedroom.getDimensions().getDepth());
        bedroom.doorStatus(true);
        System.out.println(bedroom.isDoors());
        bedroom.doorStatus(false);
        System.out.println(bedroom.isDoors());
        bedroom.lightStatus(true);
        System.out.println(bedroom.isLights());
        bedroom.lightStatus(false);
        System.out.println(bedroom.isLights());

        bedroom.getBookRack().chooseBook(1);
        System.out.println(bedroom.getBookRack().getBook1());
        bedroom.getBookRack().chooseBook(2);
        System.out.println(bedroom.getBookRack().getBook2());
        bedroom.getBookRack().chooseBook(3);
        System.out.println(bedroom.getBookRack().getBook3());
        bedroom.getBookRack().chooseBook(4);
        System.out.println(bedroom.getBookRack().getBook4());

        bedroom.getBed().sleep();
        bedroom.getBed().wakeUp();


    }
}

package com.learning;

public class Main {

    public static void main(String[] args) {


        Car holden = new Car(); //we've created an object called holden based on the template car
        Car porsche = new Car(); //we've created an object called porsche based on the template car

        System.out.println(porsche.getModel()); //returns null
        porsche.setModel("Carrera");
        System.out.println(porsche.getModel()); //returns Carrera
        porsche.setModel("911");
        System.out.println(porsche.getModel()); //returns unknown
    }
}

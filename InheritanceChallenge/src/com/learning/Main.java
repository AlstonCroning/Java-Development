package com.learning;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        //vehicle.move(50,'f');

        Car car = new Car(5,4);
        //car.move(70,'r');

        Benz benzCar = new Benz("Benz","blue",6,4,"Manual");
        benzCar.move(40,'f');
        benzCar.changeGears(1);
        System.out.println("Name: " + benzCar.getName());
        System.out.println("Color: " + benzCar.getColor());
        System.out.println("Engine: " + benzCar.getEngine());
        System.out.println("Transmission: " + benzCar.getTransmission());
        System.out.println("Steering Wheel: " + benzCar.getSteeringWheel());
        System.out.println("\n");

        benzCar.move(40, 'r');
        benzCar.changeGears(2);

        benzCar.move(40,'r');
        benzCar.changeGears(2);

        benzCar.turnLeft();
    }
}

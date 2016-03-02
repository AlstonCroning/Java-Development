package com.learning;

public class Vehicle {
    private int body;
    private int seats;
    private int brakes;
    private int wheels;

    //default constructor
    public Vehicle() {
        this(0,0,0,0);
    }

    //main constructor
    public Vehicle(int body, int seats, int brakes, int wheels) {
        this.body = body;
        this.seats = seats;
        this.brakes = brakes;
        this.wheels = wheels;
    }

    //move action
    public void move(int speed, char drive) {

        if(drive == 'f'){
            System.out.println("Vehicle is going Forward at " + speed + "km/h");
        }else if(drive == 'r') {
            System.out.println("Vehicle is Reversing");
        }else if(drive == 'L'){
            System.out.println("Vehicle is Turning Left");
        }else if(drive == 'R'){
            System.out.println("Vehicle is Turning Right");
        }else{
            System.out.println("Vehicle Not Driving!!!!");
        }
    }

    //Common functionalities of all Vehicles
    public void turnLeft() {
        System.out.println("Vehicle is Turning Left");
    }

    public void turnRight() {
        System.out.println("Vehicle is Turning Right");
    }

    public void reverse() {
        System.out.println("Vehicle is reversing");
    }

    public void forward() {
        System.out.println("Vehicle is going forward");
    }


    //changing gears
    public void changeGears(int gears) {
        System.out.println("Vehicle is changing gears to " + gears);
    }


}

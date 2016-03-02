package com.learning;

public class Car extends Vehicle{

    //Constructor
    public Car(int seats, int wheels) {
        super(1, seats, 1, wheels);//calling super constructor
    }

    //overriding functionalities
    @Override
    public void move(int speed, char drive) {
        super.move(speed, drive);
    }

    @Override
    public void turnLeft() {
        super.turnLeft();
    }

    @Override
    public void turnRight() {
        super.turnRight();
    }

    @Override
    public void reverse() {
        super.reverse();
    }

    @Override
    public void forward() {
        super.forward();
    }

    @Override
    public void changeGears(int gears) {
        super.changeGears(gears);
    }
}

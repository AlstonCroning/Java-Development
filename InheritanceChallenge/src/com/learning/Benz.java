package com.learning;

public class Benz extends Car{

    private String color;
    private String name;
    private String transmission;
    private int engine;
    private int steeringWheel;

    //constructor
    public Benz(String name, String color, int seats, int wheels, String transmission) {
        super(seats, wheels);
        this.name = name;
        this.color = color;
        this.engine = 1;
        this.steeringWheel = 1;
        this.transmission = transmission;
    }


    //getters
    public String getName() {
        return name;
    }

    public String getTransmission() {
        return transmission;
    }

    public int getEngine() {
        return engine;
    }

    public int getSteeringWheel() {
        return steeringWheel;
    }

    public String getColor() {
        return color;
    }
}

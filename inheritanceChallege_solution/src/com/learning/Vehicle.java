package com.learning;

public class Vehicle {
    private String name;
    private String size;

    private int countVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.countVelocity = 0;
        this.currentDirection = 0;
    }
}

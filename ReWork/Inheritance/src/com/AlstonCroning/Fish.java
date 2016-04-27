package com.AlstonCroning;

public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void rest() {
        System.out.println("fish.rest() called");
    }

    public void moveMuscles() {
        System.out.println("fish.moveMuscles() called");
    }

    public void moveBackFin() {
        System.out.println("fish.moveBackFin() called");
    }

    public void swim(int speed) {
        System.out.println("fish.swim() called");
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}

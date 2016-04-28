package com.AlstonCroning;

public class Lexus extends Car{

    private String model;

    public Lexus(String name, String model, String engine, String paint, int wheels,
                 int seats, int doors, int gears, boolean transmission) {
        super(name, paint, engine, wheels, seats, doors, gears, transmission);
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

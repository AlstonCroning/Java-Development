package com.AlstonCroning;

public class Car extends Vehicle{

    private String engine;
    private int gears;
    private boolean transmission;

    public Car(String name, String paint, String engine, int wheels, int seats,
               int doors, int gears, boolean transmission) {
        super(name, paint, 1, wheels, seats, doors);
        this.engine = engine;
        this.gears = gears;
        this.transmission = transmission;
    }

    public void changeGear(int gears) {
        if(!transmission){
            switch (gears) {
                case 1:
                    System.out.println("Car is changing to Gear 1");
                    break;
                case 2:
                    System.out.println("Car is changing to Gear 2");
                    break;
                case 3:
                    System.out.println("Car is changing to Gear 3");
                    break;
                case 4:
                    System.out.println("Car is changing to Gear 4");
                    break;
                default:
                    System.out.println("Incorrect Gear");
                    break;
            }
        } else {
            System.out.println("Changes gears Automatically");
        }
    }

    public String getEngine() {
        return engine;
    }

    public int getGears() {
        return gears;
    }

    public boolean isTransmission() {
        return transmission;
    }
}

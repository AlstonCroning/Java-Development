package com.AlstonCroning;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Default Car",0);
        System.out.println("Car Name: " + car.getName());
        System.out.println("Cylinders: " + car.getCylinders());
        car.startEngine();
        car.accelerate();
        car.brake();
        car.autoCruiseMode();
        System.out.println();

        Benz benz = new Benz("Benz CLK-500",5);
        System.out.println("Car Name: " + benz.getName());
        System.out.println("Cylinders: " + benz.getCylinders());
        benz.startEngine();
        benz.accelerate();
        benz.brake();
        benz.autoCruiseMode();
        System.out.println();


        Toyota toyota = new Toyota("Toyota Camry",1);
        System.out.println("Car Name: " + toyota.getName());
        System.out.println("Cylinders: " + toyota.getCylinders());
        toyota.startEngine();
        toyota.accelerate();
        toyota.brake();
        toyota.autoCruiseMode();
        System.out.println();

        Volvo volvo = new Volvo("Volvo Gmz",3);
        System.out.println("Car Name: " + volvo.getName());
        System.out.println("Cylinders: " + volvo.getCylinders());
        volvo.startEngine();
        volvo.accelerate();
        volvo.brake();
        volvo.autoCruiseMode();
        System.out.println();

    }

}

class Car {
    private String name;
    private int wheels;
    private int cylinders;
    private boolean engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    //methods
    public void startEngine() {
        System.out.println("Car Started");
    }

    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    public void brake() {
        System.out.println("Car is slowing");
    }

    public void autoCruiseMode() {
        System.out.println("No Auto Cruise Mode");
    }


    //getters
    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Benz extends Car{
    public Benz(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Started Benz Car");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating Benz");
    }

    @Override
    public void brake() {
        System.out.println("Slowing Benz");
    }

    @Override
    public void autoCruiseMode() {
        System.out.println("Turned On AutoCruise Mode for " + getName());
    }
}

class Toyota extends Car {
    public Toyota(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Started Toyota Car");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating Toyota");
    }

    @Override
    public void brake() {
        System.out.println("Slowing Toyota");
    }

    @Override
    public void autoCruiseMode() {
        System.out.println("Turned On AutoCruise Mode for " + getName());
    }
}

class Volvo extends Car {
    public Volvo(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Starting Volvo Car");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating Volvo");
    }

    @Override
    public void brake() {
        System.out.println("Slowing Volvo");
    }

    //No AutoCruise Method
}
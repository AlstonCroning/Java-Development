package com.AlstonCroning;

public class Vehicle {

    private String name;
    private String paint;
    private int body;
    private int wheels;
    private int seats;
    private int doors;

    public Vehicle(String name, String paint, int body, int wheels, int seats, int doors) {
        this.name = name;
        this.paint = paint;
        this.body = body;
        this.wheels = wheels;
        this.seats = seats;
        this.doors = doors;
    }

    public void move(int speed) {
        System.out.println("Vehicle.Move() called. Vehicle is moving at " + speed);
    }

    public void stop() {
        brake();
        System.out.println("Vehicle.Stop() called. Vehicle has stopped");
    }

    public void brake() {
        System.out.println("Vehicle.Brake() called. Vehicle is Slowing Down");
    }

    public void handleSteering(String direction) {
        switch (direction.toLowerCase()) {
            case "forward":
                System.out.println("Vehicle is steering forward");
                break;
            case "left":
                System.out.println("Vehicle is steering left");
                break;
            case "right":
                System.out.println("Vehicle is steering right");
                break;
            case "reverse":
                System.out.println("Vehicle is steering reverse");
                break;
            default:
                System.out.println("Unknown direction");
                break;
        }
    }

    public String getName() {
        return name;
    }

    public int getBody() {
        return body;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public int getDoors() {
        return doors;
    }

    public String getPaint() {
        return paint;
    }
}

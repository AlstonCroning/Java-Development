package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Vehicle","NoColor",0,0,0,0);

        Car car = new Car("Car","None","Default",0,0,0,0,true);

        Lexus lexus = new Lexus("Lexus","MDZ","V6","Yellow",4,4,4,6,false);
        lexus.handleSteering("left");
        lexus.move(20);
        lexus.changeGear(1);
        lexus.brake();
        lexus.stop();
    }
}

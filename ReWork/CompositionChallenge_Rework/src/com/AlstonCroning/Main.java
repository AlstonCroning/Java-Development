package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {

        Bed bed = new Bed(2,1,1);
        Lamp lamp = new Lamp(1,false);
        Door door = new Door(false);
        Window window = new Window(2);
        Paint paint = new Paint("Yellow");
        Wall1 wall1 = new Wall1("North",paint);
        Wall2 wall2 = new Wall2("South",paint);
        Wall3 wall3 = new Wall3("East",paint);
        Wall4 wall4 = new Wall4("West",paint);

        Dimensions dimensions = new Dimensions(1400,5000,2000);
        Bedroom bedroom = new Bedroom("Dishan's Room",dimensions,bed,lamp,door,
                window,wall1,wall2, wall3,wall4);
        bedroom.useDoor(true);
        bedroom.getLamp().useSwitch(true);
    }
}

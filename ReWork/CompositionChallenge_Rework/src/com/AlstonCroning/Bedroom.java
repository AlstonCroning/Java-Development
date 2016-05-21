package com.AlstonCroning;

public class Bedroom {
    private String name;
    private Dimensions dimensions;
    private Bed bed;
    private Lamp lamp;
    private Door door;
    private Window window;
    private Wall1 wall1;
    private Wall2 wall2;
    private Wall3 wall3;
    private Wall4 wall4;

    public Bedroom(String name, Dimensions dimensions, Bed bed, Lamp lamp, Door door, Window window,
                   Wall1 wall1, Wall2 wall2, Wall3 wall3, Wall4 wall4) {
        this.name = name;
        this.dimensions = dimensions;
        this.bed = bed;
        this.lamp = lamp;
        this.door = door;
        this.window = window;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
    }

    public void useDoor(boolean openClose) {
        door.useDoor(openClose);
    }

    public Lamp getLamp() {
        return lamp;
    }
}

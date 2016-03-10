package com.learning;

public class Bedroom {
    private boolean lights;
    private boolean doors;
    private Dimensions dimensions;
    private BookRack bookRack;
    private Bed bed;

    //constructor
    public Bedroom(boolean lights, boolean doors, Dimensions dimensions,BookRack bookRack,Bed bed) {
        this.lights = lights;
        this.doors = doors;
        this.dimensions = dimensions;
        this.bookRack = bookRack;
        this.bed = bed;
    }

    //methods
    public void doorStatus(boolean openOrClose) {
        if(openOrClose){
            System.out.println("Door Opened");
        } else {
            System.out.println("Door Closed");
        }
        setDoors(openOrClose);
    }

    public void lightStatus(boolean onOrOff) {
        if(onOrOff){
            System.out.println("Lights On");
        } else {
            System.out.println("Lights off");
        }
        setLights(onOrOff);
    }

    //setters
    private void setLights(boolean lights) {
        this.lights = lights;
    }

    private void setDoors(boolean doors) {
        this.doors = doors;
    }

    //getters
    public boolean isLights() {
        return lights;
    }

    public boolean isDoors() {
        return doors;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public BookRack getBookRack() {
        return bookRack;
    }

    public Bed getBed() {
        return bed;
    }
}

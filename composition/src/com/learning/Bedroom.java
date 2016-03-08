package com.learning;

public class Bedroom {
    private boolean lights;
    private boolean doors;
    private int bed;
    private int computer;
    private int computerTable;
    private int bookRack;
    private int closet;
    private int calenders;

    //constructor
    public Bedroom(boolean lights, boolean doors, int bed, int computer,
                   int computerTable, int bookRack, int closet, int calenders) {
        this.lights = lights;
        this.doors = doors;
        this.bed = bed;
        this.computer = computer;
        this.computerTable = computerTable;
        this.bookRack = bookRack;
        this.closet = closet;
        this.calenders = calenders;
    }

}

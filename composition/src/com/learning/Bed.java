package com.learning;

public class Bed {
    private int pillows;
    private int bedSheets;
    private int quilt;

    public Bed(int pillows, int bedSheets, int quilt) {
        this.pillows = pillows;
        this.bedSheets = bedSheets;
        this.quilt = quilt;
    }

    //methods
    public void sleep() {
        sleepProcedure();
        System.out.println("Going to Sleep..");
    }

    public void wakeUp() {
        wakeUpProcedure();
        System.out.println("Hey I'm awake..");
    }

    private void sleepProcedure() {
        System.out.println("preparing pillows, bedSheet, and quilt");
        System.out.println("pillows: " + getPillows() + "\nbedsheets: " + getBedSheets() +
                "\nquilts: " + getQuilt());
        System.out.println("getting on the bed");
    }

    private void wakeUpProcedure() {
        System.out.println("getting up from the bed and stand up");
        System.out.println("Organize the Bed");
    }

    //getters
    private int getPillows() {
        return pillows;
    }

    private int getBedSheets() {
        return bedSheets;
    }

    private int getQuilt() {
        return quilt;
    }
}

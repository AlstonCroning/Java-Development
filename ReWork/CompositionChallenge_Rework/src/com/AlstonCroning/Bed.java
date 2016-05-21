package com.AlstonCroning;

public class Bed {
    private int pillows;
    private int quilts;
    private int bedSheets;

    public Bed(int pillows, int quilts, int bedSheets) {
        this.pillows = pillows;
        this.quilts = quilts;
        this.bedSheets = bedSheets;
    }

    public void sleep() {
        System.out.println("Sleeping now");
    }

    public int getPillows() {
        return pillows;
    }

    public int getQuilts() {
        return quilts;
    }

    public int getBedSheets() {
        return bedSheets;
    }
}

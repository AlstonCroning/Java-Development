package com.AlstonCroning;

public class Printer {
    private int tonerLevel = 100;
    private int numOfPagesPrinted = 0;
    private boolean isDuplex;

    public Printer(int tonerLevel, int numOfPagesPrinted, boolean isDuplex) {
        if(tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.numOfPagesPrinted = numOfPagesPrinted;
        this.isDuplex = isDuplex;
    }

    public void fillUpToner(int increaseTonerLevel) {
        int tonerDifference = (100 - this.tonerLevel);
         if((increaseTonerLevel <= tonerDifference) && (tonerLevel >= 0 && tonerLevel < 100) ) {
             this.tonerLevel = tonerLevel + increaseTonerLevel;
             System.out.println("Tonner Level is increased by " + increaseTonerLevel + "%");
         } else {
             if(tonerLevel == 100) {
                 System.out.println("Toner is Full");
             } else {
                 System.out.println(increaseTonerLevel + "% is too much. add only " + tonerDifference + "%");
             }
         }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumOfPagesPrinted() {
        return numOfPagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}

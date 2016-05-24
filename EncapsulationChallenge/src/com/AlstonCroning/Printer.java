package com.AlstonCroning;

public class Printer {
    private int tonerLevel;
    private int numOfPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if(tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.numOfPagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public void fillUpToner(int increaseTonerLevel) {
        int tonerDifference = (100 - this.tonerLevel);
         if((increaseTonerLevel <= tonerDifference) && (tonerLevel >= 0 && tonerLevel < 100) ) {
             this.tonerLevel += increaseTonerLevel;
             System.out.println("Tonner Level is increased by " + increaseTonerLevel + "%");
         } else {
             if(tonerLevel == 100) {
                 System.out.println("Toner is Full");
             } else {
                 System.out.println(increaseTonerLevel + "% is too much. add only " + tonerDifference + "%");
             }
         }
    }

    public int print(int pages) {
        int pagesToPrint = pages;
        if(this.isDuplex) {
            System.out.println("Printing in duplex printing mode");
            pagesToPrint /= 2;
        }
        System.out.println("Printing Done");
        this.numOfPagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumOfPagesPrinted() {
        return numOfPagesPrinted;
    }
}

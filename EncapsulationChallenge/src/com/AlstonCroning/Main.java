package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(100,1,true);
        printer.fillUpToner(1);
        System.out.println("Toner Level: " + printer.getTonerLevel() + "%");

//        System.out.println(printer.getTonerLevel());
//        printer.fillUpToner(10);
//        System.out.println(printer.getTonerLevel());
//
//        printer.fillUpToner(10);
//        System.out.println(printer.getTonerLevel());
//
//        printer.fillUpToner(10);
//        System.out.println(printer.getTonerLevel());



    }
}

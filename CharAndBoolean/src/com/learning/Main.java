package com.learning;

public class Main {

    public static void main(String[] args) {

        //width of 16 (2 bytes)
        char myChar = '\u00A9';//example of a unicode charactor
        System.out.println("Unicode output is: " + myChar);

        //examples of boolean data type
        boolean isMale = true;
        boolean isFemale = false;

        //challenge
        //find code for the registered symbol from unicode and display the symbol
        char RegisteredSymbol = '\u00AE';
        System.out.println("Unicode output of Registered symbol is: " + RegisteredSymbol);
    }
}

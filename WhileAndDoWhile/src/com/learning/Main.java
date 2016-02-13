package com.learning;

public class Main {

    public static void main(String[] args) {

        //example of a while loop with a condition statement
        int count = 1;
        while(count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        //same example with an alternative way
        count = 1;
        while(true) {
            if(count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        //using do while statement with the same example
        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);

    }
}

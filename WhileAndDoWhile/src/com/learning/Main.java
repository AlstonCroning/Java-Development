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

        //Finding an Even number Challenge with a help from while loop and a method
        int number = 5;
        int finishNumber = 20;
        int TotalEvenNumbers = 0;
        while(number <= finishNumber) {

            if(!isEvenNumber(number)) {
                number++;
                continue;
            }

            System.out.println("Even number " + number);
            number++;

            TotalEvenNumbers++;
            if(TotalEvenNumbers == 5) {
                break;
            }
        }//end of while

        System.out.println("Even numbers Found are " + TotalEvenNumbers);

    }//end of main

    public static boolean isEvenNumber(int number) {

        if((number % 2) == 0){
            return true;
        } else {
            return false;
        }
    }

}

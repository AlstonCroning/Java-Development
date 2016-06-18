package com.AlstonCroning;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //declaring an array
//        int[] myVariable;
//        myVariable = new int[10];

//        int[] myIntArray = new int[10];
//        myIntArray[5] = 50;
//        myIntArray[0] = 45;
//        myIntArray[1] = 245;


//        double[] myDoubleArray = new double[10];
//        myDoubleArray[5] = 50.5;
//        myDoubleArray[0] = 45.1;
//        myDoubleArray[1] = 245.6;

        //array initialization is not Allowed here
        //So we need to do it at the time the we define the array
        //myIntArray = {1,2,3,4,5,6,7,8,9,10};

        //this tells java how many elements in the array and the elements that
        //should be included in the array
//        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(myIntArray[0]);
//        System.out.println(myIntArray[6]);
//        System.out.println(myIntArray[9]);


//        //3rd way to initialize an array
//        int[] myIntArray = new int[25];
//        for(int i=0;i<myIntArray.length;i++){
//            myIntArray[i] = i*10;
//        }
//        printArray(myIntArray);//display array. Notice array type is not passed. only the array name is.


        int[] myIntegers = getIntegers(5);

        for(int i=0;i<myIntegers.length;i++) {
            System.out.println("Element " + i + ", value is " + myIntegers[i]);
        }
        System.out.println("The average is: " + getAverage(myIntegers));

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0;i<values.length;i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;

        for (int anArray : array) {
            sum += anArray;
        }
        return ((double) sum / (double)array.length);
    }

    public static void printArray(int[] array) {
        for(int i=0;i<array.length;i++){
            System.out.println("Element" + i + ", value is " + array[i]);
        }
    }

}

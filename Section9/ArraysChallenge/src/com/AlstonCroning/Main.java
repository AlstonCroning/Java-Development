package com.AlstonCroning;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = getIntegers(7);
        int[] sortedArray = sortIntegers(array);
        printArray(sortedArray);
    }

    private static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];

        System.out.println("Enter " + capacity + " numbers\r");

        for(int i=0;i<array.length;i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int anArray : array) {
            System.out.println(anArray);
        }
    }

    private static int[] sortIntegers(int[] array) {

        int[] sortedArray = Arrays.copyOf(array,array.length);
        int currentData;
        int nextData;
        boolean flag = true;

        while(flag){
            flag = false;
            for(int j=0;j<sortedArray.length-1;j++){
                currentData = sortedArray[j];
                nextData = sortedArray[j+1];

                if(currentData < nextData) {
                    sortedArray[j] = nextData;
                    sortedArray[j+1] = currentData;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}

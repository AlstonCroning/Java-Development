package com.learning;

public class Main {

    public static void main(String[] args) {
        //Challenge1: Data types
        byte my_byte_var = 10;
        short my_short_var = 20;
        int my_int_var = 50;
        long LongTotal = 50000L + 10L * (my_byte_var + my_short_var + my_int_var);
        short ShortTotal = (short)(50000L + 10L * (my_byte_var + my_short_var + my_int_var));
        System.out.println("LongTotal = " + LongTotal);
        System.out.println("ShortTotal = " + ShortTotal);
    }
}

package com.learning;

public class Main {

    public static void main(String[] args) {

        System.out.println("10,000 at 2% interest = " + caculateInterest(10000.0,2.0));
    }

    //calculate the interest based on the amount of money that's passed from the parameters
    public static double caculateInterest(double amount,double interestRate) {
        return (amount * (interestRate / 100));
    }

}//end of class Main

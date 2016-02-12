package com.learning;

public class Main {

    public static void main(String[] args) {

        //calculating interest with 10000 at 2,3,4,5,6,7,8 interest Rates
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0,3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0,4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0,5.0));

        //an example of a for loop
        for(int i = 0; i < 5; i++){
            System.out.println("Loop " + i + " hello!");
        }

        //calculating interest with 10000 at 2,3,4,5,6,7,8 interest Rates using a for loop
        for(int i = 2; i <= 8; i++){
            double calculatedInterest = calculateInterest(10000.0,i);
            String calcInterestString = String.format("%.2f",calculatedInterest);
            System.out.println("10,000 at " + i + "% interest = " + calcInterestString);
        }


        //calculating interest with 10000 at multiple interest Rates backwards using a for loop
        for(int i = 8; i >= 2; i--){
            double calculatedInterest = calculateInterest(10000.0,i);
            String calcInterestString = String.format("%.2f",calculatedInterest);
            System.out.println("10,000 at " + i + "% interest = " + calcInterestString);
        }

        //finding prime numbers with the aid of 'for loop' and 'isPrime' method created
        int numberOfPrimeNumbers = 0;
        for(int i = 10; i < 50; i++) {

            boolean isNumberPrime = isPrime(i);

            if(isNumberPrime) {
                System.out.println(i + " is a prime number");
                numberOfPrimeNumbers++;

                //number of prime numbers allowed to be counted
                if(numberOfPrimeNumbers == 5) {
                    System.out.println("Number of Prime Numbers are " + numberOfPrimeNumbers);
                    break;
                }
            }
        }


    }//end of 'main' method

    //Checks whether a number is a prime number
    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //calculate the interest based on the amount of money that's passed from the parameters
    public static double calculateInterest(double amount,double interestRate) {
        return (amount * (interestRate / 100));
    }

}//end of class 'Main'

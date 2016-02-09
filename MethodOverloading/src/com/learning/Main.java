package com.learning;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();

        //testing the method using feet and inches parameters
        double centimeters = calcFeetAndInchesToCentimeters(6,-1);

        //validating centimeters
        if(centimeters < 0.0)
        {
            System.out.println("Invalid Parameters");
        }

        //using the method using inches parameter
        calcFeetAndInchesToCentimeters(156);//final result

    }//end of MAIN method


    public static double calcFeetAndInchesToCentimeters(double feet,double inches) {

        //validating feet and inches
        if(feet < 0 || ( (inches < 0) || (inches > 12) ))
        {
            System.out.println("Invalid Feet or Inches Parameters!");
            return -1;
        }

        //calculating cm with feet component
        double centimeters = (feet * 12) * 2.54;
        //calculating cm with inches component and appending previous cm value
        centimeters += inches * 2.54;

        System.out.println(feet + "feet, " + inches + "inches = " + centimeters + "cm");
        return centimeters;
    }


    public static double calcFeetAndInchesToCentimeters(double inches) {

        //validating inches
        if(inches < 0)
        {
            return -1;
        }

        double feet = (int) inches/12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " +remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet,remainingInches);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("player " + playerName + " scored " + score
        + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("unknown player scored " + score
                + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("no player name, no player score.");
        return 0;
    }

}

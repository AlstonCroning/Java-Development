package com.learning;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();

        double centimeters = calcFeetAndInchesToCentimeters(6,-1);

        if(centimeters < 0.0)
        {
            System.out.println("Invalid Parameters");
        }
    }


    public static double calcFeetAndInchesToCentimeters(double feet,double inches) {

        //calculating cm
        if(feet < 0 || ( (inches < 0) || (inches > 12) ))
        {
            System.out.println("Invalid Feet or Inches Parameters!");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + "feet, " + inches + "inches = " + centimeters + "cm");
        return centimeters;
    }


    public static double calcFeetAndInchesToCentimeters(double inches) {

        double cm;
        double feet;

        //calculating feet
        if(inches >= 0)
        {
            cm = inches * 2.54; //converted to cm
            feet = cm * 0.032808;//converted to feet
            return feet;
        }
        else
        {
            return -1;
        }
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

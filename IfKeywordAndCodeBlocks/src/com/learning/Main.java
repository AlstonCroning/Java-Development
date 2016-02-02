package com.learning;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

/*      if(score < 5000 && score > 1000)
        {
            System.out.println("Your Score was less than 5000 but " +
                    "greater than 1000");
        }
        else if(score < 1000)
        {
            System.out.println("Your Score was less than 1000");
        }
        else{
            System.out.println("Got Here");
        }*/

/*      Challenge Question:
        print out the second score on the screen with the following
        score set to 10000
        levelCompleted set to 8
        bonus set to 200
        But make sure the first printout above still displays as well
        */

        if(gameOver == true) //or if(gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);

            score = 10000;
            levelCompleted = 8;
            bonus = 200;

            finalScore = score + (levelCompleted * bonus);
            System.out.println("Your 2nd final score was " + finalScore);
        }
    }
}

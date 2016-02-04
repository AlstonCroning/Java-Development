package com.learning;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        //int highScore = calculateScore(gameOver, 800, levelCompleted, bonus);
        //System.out.println("Your final score was " + highScore);

        //highScore = calculateScore(gameOver, 10000, 8, 200);
        //System.out.println("Your final score was " + highScore);

        int highScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Shehan",highScore);

        highScore = calculateHighScorePosition(900);
        displayHighScorePosition("Calvin",highScore);

        highScore = calculateHighScorePosition(400);
        displayHighScorePosition("Tim",highScore);

        highScore = calculateHighScorePosition(50);
        displayHighScorePosition("Nimal",highScore);

        highScore = calculateHighScorePosition(1000);
        displayHighScorePosition("Shihara",highScore);

        highScore = calculateHighScorePosition(500);
        displayHighScorePosition("Donni",highScore);

        highScore = calculateHighScorePosition(100);
        displayHighScorePosition("Frank",highScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
    {
        if(gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String player, int position)
    {
        System.out.println(player + " managed to get into position "
                + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }

}

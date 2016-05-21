package com.learning;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.health = 20;
//        player.name = "Tim";
//        player.weapon = "Sword";
//
//        player.loseHealth(10);
//        System.out.println(player.healthRemaining());
//
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.println(player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Dishan",200,"Sward");
        System.out.println(enhancedPlayer.getHealth());
    }
}

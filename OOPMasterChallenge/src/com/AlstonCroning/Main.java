package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        Burger burger = new Burger("Italian Bread","Pork",8.99);
//        System.out.println("Burger Price: " + burger.getTotalPrice());
//        burger.addLettus();
//        System.out.println("An Item added -> Total: " + burger.getTotalPrice());
//        burger.addOnions();
//        System.out.println("An Item added -> Total: " + burger.getTotalPrice());
//        burger.addRedPepper();
//        System.out.println("An Item added -> Total: " + burger.getTotalPrice());
//        burger.addTomato();
//        System.out.println("An Item added -> Total: " + burger.getTotalPrice());


        HealthyBurger healthyBurger = new HealthyBurger("Fish",7.99);
//        healthyBurger.addLettus();
//        System.out.println("An Item added -> Total: " + healthyBurger.getTotalPrice());
//        healthyBurger.addOnions();
//        System.out.println("An Item added -> Total: " + healthyBurger.getTotalPrice());
//        healthyBurger.addRedPepper();
//        System.out.println("An Item added -> Total: " + healthyBurger.getTotalPrice());
//        healthyBurger.addTomato();
//        System.out.println("An Item added -> Total: " + healthyBurger.getTotalPrice());
//        healthyBurger.addGreenPepper();
//        System.out.println("An Item added -> Total: " + healthyBurger.getTotalPrice());
//        healthyBurger.addCarrots();
//        System.out.println("An Item added -> Total: " + healthyBurger.getTotalPrice());

        /*
        System.out.println("Tests: Healthy Burger");
        System.out.println("Burger Price: " + healthyBurger.getTotalPrice());//price
        System.out.println(healthyBurger.getBreadRollType());//breadRoll type
        //other additions to the burger
        healthyBurger.addLettus();
        System.out.println(healthyBurger.getLettusPrice() + " -> Total: " + healthyBurger.getTotalPrice());
        //testing healthy burger additions
        healthyBurger.addGreenPepper();
        System.out.println(healthyBurger.getGreenPepperPrice() + " -> Total: " + healthyBurger.getTotalPrice());
        healthyBurger.addCarrots();
        System.out.println(healthyBurger.getCarrotsPrice() + " -> Total: " + healthyBurger.getTotalPrice());
        */

        DeluxBurger deluxBurger = new DeluxBurger("Naan Bread","Pork",15.99);
        deluxBurger.addChips();
        deluxBurger.addDrinks();
        System.out.println("Tests: Deluxe Burger");
        System.out.println(deluxBurger.getBreadRollType());
        System.out.println(deluxBurger.getMeatType());
        System.out.println(deluxBurger.getTotalPrice());
    }
}

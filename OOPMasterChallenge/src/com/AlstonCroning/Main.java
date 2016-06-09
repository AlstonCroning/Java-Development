package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        Burger burger = new Burger("Italian Bread","Pork",8.99);
        System.out.println("Burger Price: " + burger.getTotalPrice());

        burger.addLettus();
        System.out.println("An Item added -> Total: " + burger.getTotalPrice());

        burger.addOnions();
        System.out.println("An Item added -> Total: " + burger.getTotalPrice());

        burger.addRedPepper();
        System.out.println("An Item added -> Total: " + burger.getTotalPrice());

        burger.addTomato();
        System.out.println("An Item added -> Total: " + burger.getTotalPrice());

    }
}

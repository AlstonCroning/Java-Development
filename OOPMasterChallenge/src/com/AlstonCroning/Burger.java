package com.AlstonCroning;

public class Burger {
    private String meatType;
    private String breadRollType;
    private double burgerPrice;
    private double totalPrice;
    private double lettusPrice;
    private double onionsPrice;
    private double tomatoPrice;
    private double redPepperPrice;

    //constructor
    public Burger(String breadRollType, String meatType, double burgerPrice) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.burgerPrice = burgerPrice;
        this.totalPrice = burgerPrice;
        this.lettusPrice = 0.25;
        this.onionsPrice = 0.85;
        this.tomatoPrice = 0.75;
        this.redPepperPrice = 0.50;
    }


    //4 additions for Burgers
    public void addLettus() {
        this.totalPrice += lettusPrice;
    }

    public void addTomato() {
        this.totalPrice += tomatoPrice;
    }

    public void addOnions() {
        this.totalPrice += onionsPrice;
    }

    public void addRedPepper() {
        this.totalPrice += redPepperPrice;
    }

    //getters
    public String getMeatType() {
        return meatType;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public double getBurgerPrice() {
        return burgerPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getLettusPrice() {
        return lettusPrice;
    }

    public double getOnionsPrice() {
        return onionsPrice;
    }

    public double getTomatoPrice() {
        return tomatoPrice;
    }

    public double getRedPepperPrice() {
        return redPepperPrice;
    }
}

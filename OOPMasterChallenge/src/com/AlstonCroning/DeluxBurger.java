package com.AlstonCroning;

public class DeluxBurger extends Burger{
    private double chipsPrice;
    private double drinksPrice;
    private double totalPrice;

    public DeluxBurger(String breadRollType, String meatType, double burgerPrice) {
        super(breadRollType, meatType, burgerPrice);
        this.chipsPrice = 2.75;
        this.drinksPrice = 1.75;
        this.totalPrice = getTotalPrice();
    }


    //only two additions allowed
    private void addChips() {
        this.totalPrice += chipsPrice;
        setTotalPrice(this.totalPrice);
    }

    private void addDrinks() {
        this.totalPrice += drinksPrice;
        setTotalPrice(this.totalPrice);
    }


    //getters
    public double getChipsPrice() {
        return chipsPrice;
    }

    public double getDrinksPrice() {
        return drinksPrice;
    }
}
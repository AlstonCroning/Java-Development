package com.AlstonCroning;

public class HealthyBurger extends Burger{
    private double greenPepperPrice;
    private double carrotsPrice;
    private double totalPrice;

    public HealthyBurger(String meatType, double burgerPrice) {
        super("Brown Rye", meatType, burgerPrice);
        this.greenPepperPrice = 0.40;
        this.carrotsPrice = 0.10;
        this.totalPrice = getTotalPrice();
    }

    //two extra additions for healthy burger only
    public void addGreenPepper() {
        this.totalPrice = getTotalPrice() + greenPepperPrice;
        setTotalPrice(this.totalPrice);
    }

    public void addCarrots() {
        this.totalPrice = getTotalPrice() + carrotsPrice;
        setTotalPrice(this.totalPrice);
    }


    //getters
    public double getGreenPepperPrice() {
        return greenPepperPrice;
    }

    public double getCarrotsPrice() {
        return carrotsPrice;
    }
}

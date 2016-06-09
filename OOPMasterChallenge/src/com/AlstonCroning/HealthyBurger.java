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
    private void addGreenPepper() {
        this.totalPrice += greenPepperPrice;
        setTotalPrice(this.totalPrice);
    }

    private void addCarrots() {
        this.totalPrice += carrotsPrice;
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

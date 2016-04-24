package com.AlstonCroning;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("default name","default email",100);
    }

    public VipCustomer(String name, String emailAddress) {
        this(name,emailAddress,500);
    }

    public VipCustomer(String name, String emailAddress, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    //getters
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

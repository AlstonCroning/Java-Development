package com.learning;

public class VipCustomer {

    //fields
    private String name;
    private double creditLimit;
    private String emailAddress;

    //default constructor
    public VipCustomer () {
        this("DefaultName",100,"defaultEmail");
        System.out.println("Default Constructor Called");
    }

    //Secondary Constructor
    public VipCustomer (String name, String emailAddress) {
        this(name,200,emailAddress);
        System.out.println("Secondary Constructor Called");
    }

    //Main Constructor (updates all fields)
    public VipCustomer (String name, double creditLimit, String emailAddress) {
        System.out.println("Main Constructor Called");
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    /*************Getters*************/
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}//end of VipClass

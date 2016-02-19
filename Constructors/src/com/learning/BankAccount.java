package com.learning;

public class BankAccount {

    private int actNumber;
    private double balence;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        System.out.println("Empty constructor called");
    }


    //Deposit Money
    public void deposit (double deposit) {
        this.balence += deposit;
        System.out.println(
                "Balence = $" + this.balence +
                        ", Money Deposited = $" + deposit
        );
    }

    public double withDraw (double withDraw) {

        if(this.balence < withDraw){
            System.out.println("Insufficient Funds");
            return -1;
        } else {
            this.balence -= withDraw;//deducting balence from the withDraw
            System.out.println(
                    "Balence = $" + this.balence +
                            ", Amount WithDrawn = $" + withDraw);
            return 0;
        }
    }

    //Acount Number (Setter)
    public void setActNumber (int actNumber) {
        this.actNumber = actNumber;
    }
    //Acount Number (getter)
    public int getActNumber () {
        return this.actNumber;
    }


    //Balence (Setter)
    public void setBalence (double balence) {
        this.balence = balence;
    }
    //Balence (getter)
    public double getBalence () {
        return this.balence;
    }


    //CustomerName (setter)
    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }
    //CustomerName (getter)
    public String getCustomerName () {
        return this.customerName;
    }


    //CustomerName (setter)
    public void setEmail (String email) {
        this.email = email;
    }
    //CustomerName (getter)
    public String getEmail () {
        return this.email;
    }


    //CustomerName (setter)
    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    //CustomerName (getter)
    public String getPhoneNumber () {
        return this.phoneNumber;
    }


}//end of BankAccount Class

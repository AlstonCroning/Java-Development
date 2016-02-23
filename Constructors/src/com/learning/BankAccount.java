package com.learning;

public class BankAccount {

    private int actNumber;
    private double balence;
    private String customerName;
    private String email;
    private String phoneNumber;

    //default constructor
    public BankAccount() {
        this(56789,2.50,"Default name","Default Address","Default Phone");
        System.out.println("Empty constructor called");
    }

    //Major Constructor (updates all fields)
    public BankAccount(int actNumber, double balence, String customerName,
                            String email,String phoneNumber) {
        System.out.println("Account Constructor with parameters called");
        this.actNumber = actNumber;
        //setActNumber(actNumber);//alternative way of performing the same task

        this.balence = balence;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(99999,100.55,customerName,email,phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    //Deposit method
    public void deposit (double deposit) {
        this.balence += deposit;
        System.out.println(
                "Balence = $" + this.balence +
                    ", Money Deposited = $" + deposit
        );
    }

    //withdraw method
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

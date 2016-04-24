package com.AlstonCroning;

public class Account {
    private int number;
    private double balence;
    private String customer;
    private String email;
    private String phone;

    public Account() {
        this(56789,2.50,"Default name","Default email","default phone");
        System.out.println("Empty Constructor Called");
    }

    public Account(int number,double balence, String customer,String email, String phone) {
        System.out.println("Account Constructor with parameters called");
        this.number = number;
        this.balence = balence;
        this.customer = customer;
        this.email = email;
        this.phone = phone;
    }

    public Account(String customer, String email, String phone) {
        this(99999,100.55,customer,email,phone);
    }

    //methods
    public void depositFunds(double funds) {
        this.balence = this.balence + funds;
    }

    public void withdrawFunds(double funds) {
        if(funds > this.balence) {
            System.out.println("Insufficient Funds");
            System.out.println("Balance: $" + this.balence);
        } else {
            this.balence = this.balence - funds;
            System.out.println("withdrawn: $" + funds);
            System.out.println("Balance: $" + this.balence);
        }
    }

    //setters
    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalence(double balence) {
        this.balence = balence;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //getters
    public int getNumber() {
        return number;
    }

    public double getBalence() {
        return balence;
    }

    public String getCustomer() {
        return customer;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}

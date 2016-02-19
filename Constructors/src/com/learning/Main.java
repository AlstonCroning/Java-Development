package com.learning;

public class Main {

    public static void main(String[] args) {
        BankAccount TD = new BankAccount();

        //AcountNumber
        TD.setActNumber(4562);
        System.out.println("Acount #: " + TD.getActNumber());

        //Balence
        TD.setBalence(5000);
        System.out.println("Balence = $" + TD.getBalence());

        //CustomerName
        TD.setCustomerName("Dishan");
        System.out.println("CustomerName: " + TD.getCustomerName());

        //Email
        TD.setEmail("abc@email.com");
        System.out.println("Email: " + TD.getEmail());

        //PhoneNumber
        TD.setPhoneNumber("555555555");
        System.out.println("Phone #: " + TD.getPhoneNumber());

        //Deposit and Withdraw
        TD.deposit(200);//money deposited test
        TD.withDraw(100);//money withDrown test
        TD.withDraw(5101);//insufficient funds test

    }
}

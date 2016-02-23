package com.learning;

public class Main {

    public static void main(String[] args) {
//      BankAccount TD = new BankAccount(4562,5000,"Dishan","abc@email.com","555555555");

        BankAccount TD = new BankAccount();//calling the constructor

        //displaying information set by the constructor using getters
        System.out.println(TD.getActNumber());
        System.out.println(TD.getBalence());
        System.out.println(TD.getCustomerName());
        System.out.println(TD.getEmail());
        System.out.println(TD.getPhoneNumber());

        //Deposit and Withdraw
        TD.deposit(200);//money deposited test
        TD.withDraw(100);//money withDrown test
        //TD.withDraw(102.5);//all money withDrown test
        TD.withDraw(5101);//insufficient funds test




        BankAccount CIBC = new BankAccount("Tim","tim@email.com","12345");
        System.out.println(CIBC.getActNumber() + " name " + CIBC.getCustomerName());

        System.out.println("\n*********Challenge Question************\n");

        //Default Constructor called
        VipCustomer vipDishan = new VipCustomer();
        System.out.println("Name: " + vipDishan.getName());
        System.out.println("Email: " + vipDishan.getEmailAddress());
        System.out.println("Credit Limit = $" + vipDishan.getCreditLimit() + "\n");

        //Secondary Constructor Called
        VipCustomer vipTim = new VipCustomer("Tim","tim@email.com");
        System.out.println("Name: " + vipTim.getName());
        System.out.println("Email: " + vipTim.getEmailAddress());
        System.out.println("Credit Limit = $" + vipTim.getCreditLimit() + "\n");

        //Main Constructor Called
        VipCustomer vipNirosh = new VipCustomer("Nirosh",500,"nirosh@email.com");
        System.out.println("Name: " + vipNirosh.getName());
        System.out.println("Email: " + vipNirosh.getEmailAddress());
        System.out.println("Credit Limit = $" + vipNirosh.getCreditLimit() + "\n");




/*      //Using Setters and Getters without a constructor

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

*/

    }
}

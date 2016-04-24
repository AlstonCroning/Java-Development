package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {

/*
        //without a constructor we would have to type up a lot of things
        Account DishanAct = new Account();
        DishanAct.setNumber(12345);
        DishanAct.setCustomer("Dishan");
        DishanAct.setEmail("email@email.com");
        DishanAct.setPhone("555-555-5555");
        DishanAct.setBalence(5000);

        //using getters to access data
        System.out.println(DishanAct.getBalence());
        System.out.println(DishanAct.getCustomer());
        System.out.println(DishanAct.getEmail());
        System.out.println(DishanAct.getNumber());
        System.out.println(DishanAct.getPhone());

        //depositing funds and checking balance
        DishanAct.depositFunds(100);
        System.out.println(DishanAct.getBalence());
*/

        //using constructors
        Account DishanAct = new Account(12345,5000,"Dishan Croning","email@email.com","555-555-5555");
        DishanAct.withdrawFunds(500);
        System.out.println(DishanAct.getNumber());
        System.out.println(DishanAct.getBalence());

        Account TimsAccount = new Account("Tim","tim@email.com","000-550-0555");
        System.out.println("Account Number: " + TimsAccount.getNumber() +
                "\nCustomer Name: " + TimsAccount.getCustomer());


        //Challenge exercise
        VipCustomer noAccountCustomer = new VipCustomer();
        System.out.println(noAccountCustomer.getName());
        System.out.println(noAccountCustomer.getEmailAddress());
        System.out.println(noAccountCustomer.getCreditLimit());

        VipCustomer customer = new VipCustomer("Alston","alston@email.com");
        System.out.println("\n" + customer.getName());
        System.out.println(customer.getEmailAddress());
        System.out.println(customer.getCreditLimit());

        VipCustomer newCustomer = new VipCustomer("Tim","tim@email.com",1000);
        System.out.println("\n" + newCustomer.getName());
        System.out.println(newCustomer.getEmailAddress());
        System.out.println(newCustomer.getCreditLimit());
    }
}

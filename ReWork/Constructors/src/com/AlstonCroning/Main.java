package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {

/*
        Account DishanAct = new Account();
        //without a constructor we would have to type up a lot of things
        DishanAct.setNumber(12345);
        DishanAct.setCustomer("Dishan");
        DishanAct.setEmail("email@email.com");
        DishanAct.setPhone("555-555-5555");
        DishanAct.setBalence(5000);
*/

        Account DishanAct = new Account(12345,5000,"Dishan Croning","email@email.com","555-555-5555");

        DishanAct.withdrawFunds(500);





/*
        System.out.println(DishanAct.getBalence());
        System.out.println(DishanAct.getCustomer());
        System.out.println(DishanAct.getEmail());
        System.out.println(DishanAct.getNumber());
        System.out.println(DishanAct.getPhone());

        DishanAct.depositFunds(100);
        System.out.println(DishanAct.getBalence());
*/
    }
}

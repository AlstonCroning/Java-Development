package com.learning;

public class Main {

    public static void main(String[] args) {

        //using if statement to compare a switch statement
        int value = 2;
        if(value == 1) {
            System.out.println("Value was 1");
        } else if(value == 2){
            System.out.println("value was 2");
        }else {
            System.out.println("was not 1 or 2");
        }


        //using integer primitive type in a switch statement
        int switchValue = 6;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:case 4:case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was case " + switchValue);
                break;

            default:
                System.out.println("was not 1,2,3,4 or 5");
                break;
        }


        //using char primitive type in a switch statement
        char switchCharValue = 'A';

        switch (switchCharValue) {
            case 'A':
                System.out.println("It is Case " + switchCharValue);
                break;

            case 'B':
                System.out.println("It is Case " + switchCharValue);
                break;

            case 'C':case 'D': case 'E':
                System.out.println("It is Case " + switchCharValue);
                break;

            default:
                System.out.println("A,B,C,D or E Not found");
                break;
        }

        //Using Strings with the switch statement
        String month = "June";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");
                break;
        }

    }
}

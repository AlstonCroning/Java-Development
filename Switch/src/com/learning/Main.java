package com.learning;

public class Main {

    public static void main(String[] args) {
        int value = 2;
        if(value == 1) {
            System.out.println("Value was 1");
        } else if(value == 2){
            System.out.println("value was 2");
        }else {
            System.out.println("was not 1 or 2");
        }

        int switchValue = 1;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
        }


    }
}

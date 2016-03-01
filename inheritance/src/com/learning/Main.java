package com.learning;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,5,5);//definition for a base Animal

        Dog dog = new Dog("Yorkie",8,20,2,4,1,20,"long silky");//initializing a Dog
        dog.eat();
        dog.walk();
        dog.run();

    }
}

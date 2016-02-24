package com.learning;

public class Dog extends Animal{

    //unique characteristics relating to a dog, in addition to other animals out there
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;//fur

    //base characteristics of all animals (initializing base characteristics to the dog)
    public Dog(String name, int size, int weight, int eyes,
               int legs,int tail,int teeth, String coat) {

        //super(name, brain, body, size, weight);
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
}

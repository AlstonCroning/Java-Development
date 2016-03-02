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

    //unique to Dogs (how dogs eat)
    private void chew() {
        System.out.println("Dog.chew() called");
    }

    //we're overiding a method that is in the super class 'Animal'
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    //unique to Dogs (how dogs walk)
    public void walk() {
        System.out.println("dog.walk() called");
        //move(5);
        super.move(5);
    }

    //unique to Dogs (how dogs run)
    public void run() {
        System.out.println("dog.run() called");
        move(10);
    }

    //unique to dogs (how dogs moveLegs)
    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }

    //overriding move method
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}

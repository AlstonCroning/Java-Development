package com.learning;

public class Car {

    //class or member variables or most commonly known as fields
    //These are the State components for a Car or Characteristics
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }

    public String getModel() {
        return this.model;
    }


}

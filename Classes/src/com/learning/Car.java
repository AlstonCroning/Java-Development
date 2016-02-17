package com.learning;

public class Car {

    //fields or class or member variables
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    //setting the model (setter)
    public void setModel (String model) {

        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    //getting the model (getter)
    public String getModel() {
        return this.model;
    }
}

package com.example.learnkotlin;

public abstract class ShippingMethod {

    protected String destination;
    protected double weight;

    // Constructor
    public ShippingMethod(String destination, double weight) {
        this.destination = destination;
        this.weight = weight;
    }

    // Abstract methods jinhein child classes implement karein gi
    public abstract double calculateCost();
    public abstract String getDetails();
}
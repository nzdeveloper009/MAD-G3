package com.example.learnkotlin;

public class StandardShipping extends ShippingMethod {

    // Constructor ka order exact "String destination, double weight" hona chahiye
    public StandardShipping(String destination, double weight) {
        super(destination, weight);
    }

    @Override
    public double calculateCost() {
        return weight * 10;
    }

    @Override
    public String getDetails() {
        return "Standard Shipping to " + destination + " for weight " + weight + " kg";
    }
}
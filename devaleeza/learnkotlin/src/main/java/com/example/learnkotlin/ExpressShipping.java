package com.example.learnkotlin;

public class ExpressShipping extends ShippingMethod {

    public ExpressShipping(String destination, double weight) {
        super(destination, weight);
    }

    @Override
    public double calculateCost() {
        return weight * 30; // Rs. 30 per kg
    }

    @Override
    public String getDetails() {
        return "Express Shipping to " + destination + " for weight " + weight + " kg";
    }
}
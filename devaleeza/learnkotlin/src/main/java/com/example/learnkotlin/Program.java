package com.example.learnkotlin;

// Yeh line add karne se ShipmentService ka error khatam ho jaye g
import com.example.learnkotlin.ShipmentService;

public class Program {

    public static void main(String[] args) {
        StandardShipping s1 = new StandardShipping("Delhi", 12);
        StandardShipping s2 = new StandardShipping("Bangalore", 7);
        StandardShipping s3 = new StandardShipping("Noida", 4);

        ShipmentService service = new ShipmentService();
        service.addShipment(s1);
        service.addShipment(s2);
        service.addShipment(s3);

        service.displayAllShipments();
        System.out.println(service.calculateTotalShippingCost());
    }
}
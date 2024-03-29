package com.tns.inheritance;

public class Car  extends Vehicle{
	String model;
    double price;

    Car(String manufacturer, int year, String model, double price) {
        super(manufacturer, year);
        this.model = model;
        this.price = price;
    }

    void drive() {
        System.out.println("Driving the " + manufacturer + " " + model);
    }

	

}

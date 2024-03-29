package com.tns.inheritance;

public class SportsCar extends Car {
	int maxSpeed;

    SportsCar(String manufacturer, int year, String model, double price, int maxSpeed) {
        super(manufacturer, year, model, price);
        this.maxSpeed = maxSpeed;
    }

    void displaySportsCarDetails() {
        displayDetails();
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("Max Speed: " + maxSpeed + " mph");
    }

    void race() {
        System.out.println("Racing the " + manufacturer + " " + model + " at " + maxSpeed + " mph!");
    }

}

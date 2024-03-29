package com.tns.inheritance;

public class Vehicle {
	String manufacturer;
    int year;

    Vehicle(String manufacturer, int year) {
        this.manufacturer = manufacturer;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Year: " + year);
    }

}

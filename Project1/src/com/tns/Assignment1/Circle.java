package com.tns.Assignment1;

public class Circle {
	private double radius;
	private String color;
	
	
	 public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double calculateArea()
	 {
		 return Math.PI*radius*radius;
	 }
	
}

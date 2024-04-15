package com.tns.Abstraction;

public class Rectangle extends Shape {
	private float l=0.3f;
	private float b=0.5f;
	public Rectangle() {
		super();
	}
	public Rectangle(float l, float b) {
		super();
		this.l = l;
		this.b = b;
	}
	@Override
	void calArea() {
		area=l*b;
		
	}
	@Override
	public String toString() {
		return "Rectangle [l=" + l + ", b=" + b + "]";
	}
	
	

}

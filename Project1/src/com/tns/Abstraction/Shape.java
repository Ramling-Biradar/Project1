package com.tns.Abstraction;
//program to demonstrate abstract
public abstract  class Shape {
	protected float area;
	abstract void calArea(); //abstract method
	void show()
	{
		System.out.println("The Area of the shape is "+area);
		
	}
	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shape(float area) {
		super();
		this.area = area;
	}
	
}

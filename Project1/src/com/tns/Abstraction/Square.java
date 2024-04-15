package com.tns.Abstraction;

public class Square extends Shape {
	private float side;
	public Square()
	{
		super();
		side=0.2f;
	}
	
	public Square(float side) {
		super();
		this.side = side;
	}

	public float getSide() {
		return side;
	}
	public void setSide(float side) {
		this.side = side;
	}
	
	
	
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	@Override
	void calArea() {
		area=side*side;
		
		
	}
	
	
	
	


}

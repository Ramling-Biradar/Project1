package com.tns.Polymorphism;
//constructer Overloading 
public class Point {
	float x,y;
	public Point()
	{
		this.x=0.0f;
		this.y=0.0f;
	}
	public Point(float value)
	{
		this.x=value;
		this.y=value;
		
	}
	public Point(float value1,float value2)
	{
		this.x=value1;
		this.y=value2;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	

}

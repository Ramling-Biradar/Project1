package com.tns.Polymorphism;

public class PointdDemo {
	public static void main(String args[])
	{
		
		Point p1;
		p1=new Point();
		System.out.println(p1);
		p1=new Point(8.0f);
		System.out.println(p1);
		p1=new Point(8.0f,15.0f);
		System.out.println(p1);
	}

}

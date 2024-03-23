package com.tns.Assignment1;
import java.util.*;
public class CircleDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Circle c=new Circle();
		System.out.println("Enter The radius of the circle");
		
		double r=sc.nextDouble();
		c.setRadius(r);
		System.out.println("The are of the circle is :"+c.calculateArea());

	}

}

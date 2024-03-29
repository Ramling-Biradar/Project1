package com.tns.staticexamples;
//program to demonstrate static block and methods

public class StaticMethod {
	private  int section;
	private static  int srNo;
	static
	{
		System.out.println("static block");
		srNo=100;
	}
	
	StaticMethod()
	{
		System.out.println("constructer");
		srNo++;
		section++;
		
	}
	static void display()
	{
		System.out.println("static method");
		System.out.println("serial No :"+srNo);
		
	}

}


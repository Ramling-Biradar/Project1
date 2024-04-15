package com.tns.ExceptionExamples;

public class ThrowProgram {
	
	public static void validate(int age)
	{
		if(age<18)
		{
		throw new ArithmeticException ("invlid age");
		}
		else
		{
			System.out.println("valid age");
		}
	}
	public static void main(String[] args) {
		validate(16);
	}
	
}

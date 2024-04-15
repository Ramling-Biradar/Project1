package com.tns.ExceptionExamples;

import java.util.Scanner;

public class UserDefined {
	static void validate() throws Age
	
	{
		int ag;
		
		Scanner sc=new Scanner(System.in);
		ag=sc.nextInt();
		if(ag<18)
		{
		throw new Age("invalid age");
		}
		else
		{
			System.out.println("valid");
		}
		
	}


}

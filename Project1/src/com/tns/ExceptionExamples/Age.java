package com.tns.ExceptionExamples;

public class Age extends Exception{
	
	Age()
	{
		super("Under Age ");
	}
	Age(String message)
	{
			super(message);
	}

}

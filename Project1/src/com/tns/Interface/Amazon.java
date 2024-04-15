package com.tns.Interface;
//program to demonstrate interface
public interface Amazon {
	
	void welcome();
	void subscribe();
	default void serviceCharge()
	{
		int amt=100;
		System.out.println("Service Charge is :"+amt);
	}
	static void aboutUs()
	{
		System.out.println("It ia E-Commerce Website");
	}
	
	
	

}

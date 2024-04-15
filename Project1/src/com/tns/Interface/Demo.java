package com.tns.Interface;

public class Demo {

	public static void main(String[] args) {
		
		Amazon a;
		a=new Prime();
		a.welcome();
		a.subscribe();
		a=new NonPrime();
		a.welcome();
		a.subscribe();
		a.serviceCharge();
		Amazon.aboutUs();
		
	}

}

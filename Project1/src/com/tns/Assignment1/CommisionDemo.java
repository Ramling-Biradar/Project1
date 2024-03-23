package com.tns.Assignment1;
import java.util.Scanner;
public class CommisionDemo {

	public static void main(String[] args) {
		Commision c=new Commision();
		String name,address;
		long phone;
		double Sales_Amt;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Name ");
		name=sc.nextLine();
		System.out.println("Enter The Address");
		address=sc.nextLine();
		System.out.println("Enter phone number");
		phone=sc.nextLong();
		System.out.println("Enter Sales Amount");
		Sales_Amt=sc.nextDouble();
		c.setName(name);
		c.setAddress(address);
		c.setPhone(phone);
		c.setSales_Amount(Sales_Amt);
		double commision=c.calculatecommision();
		System.out.println("The Commision for "+Sales_Amt+" is :"+commision);
	
	}

}

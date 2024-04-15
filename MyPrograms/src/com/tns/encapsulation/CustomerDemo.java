package com.tns.encapsulation;
import java.util.Scanner;
public class CustomerDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		String city;
		int id;
		
		System.out.println("Enter id");
		id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter name and city ");
		name=sc.nextLine();
		
		city=sc.nextLine();
		
		System.out.println(id);
		System.out.println("Name :"+name);
		System.out.println("city :"+city);
		
		Customer c=new Customer();
		
		c.setCity("h");
		c.setCust_id(55);
		System.out.println(c);
		
		
		
		
		

	}

	

}

package com.tns.staticexamples;
import java.util.Scanner;
public class FlightBookingApp {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to Flight Booking System!");
	        while (true) {
	            System.out.println("Available Tickets: " + FlightBokking.noOfTickets);
	            System.out.println("1. Book Ticket");
	            System.out.println("2. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = sc.nextInt();
	            switch (choice) {
	                case 1:
	                	 FlightBokking.bookTicket();
	                    break;
	                case 2:
	                    System.out.println("Exiting...");
	                    sc.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice! Please enter again.");
	            }

	}
	}
}




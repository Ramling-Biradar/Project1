package com.tns.staticexamples;
import java.util.*;
public class FlightBokking {
	static int noOfTickets=10;
	static String name;
	
 static void bookTicket() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = sc.nextLine();
    if (noOfTickets > 0) {
        noOfTickets--;
        System.out.println("Congratulations, " + name + "! Ticket booked successfully.");
        System.out.println("HAppy Journey "+name);
        
    } else {
        System.out.println("Sorry, "+name+" no tickets available. Please try again later.");
    }
}
}
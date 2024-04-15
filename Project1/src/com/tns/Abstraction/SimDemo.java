package com.tns.Abstraction;

public class SimDemo {

	public static void main(String[] args) {
		  Sim s;

	        s = new Jio(636114070);
	        s.call();
	        s.show();

	        s = new Airtel(936744070);
	        s.call();
	        s.show();

	        s = new Bsnl(824578645);
	        s.call();
	        s.show();
	    }
		

	}



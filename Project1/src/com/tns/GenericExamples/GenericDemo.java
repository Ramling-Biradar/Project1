package com.tns.GenericExamples;

import java.util.Iterator;

public class GenericDemo {

	public static void main(String[] args) {
		GenericExample<String> s=new GenericExample<String>();
		s.add("Ramling");
		s.add("Raheem");
		s.add("Raghavendra");
		//Iterator it=s.iterator()
		System.out.println(s.get());
		GenericExample<Integer> i=new GenericExample<Integer>();
		i.add(15);
		System.out.println(i.get());
		

	}

}

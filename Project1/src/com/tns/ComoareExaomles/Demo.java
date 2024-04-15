package com.tns.ComoareExaomles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Laptop> laps=new ArrayList<Laptop>();
		laps.add(new Laptop("dell",209888,6));
		laps.add(new Laptop("asus",56888,15));
		laps.add(new Laptop("nokia",998888,15));
		Collections.sort(laps);
		for(Laptop l:laps)
		{
			System.out.println(l);
		}
		
		
	}

}

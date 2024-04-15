package com.tns.CollectionExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
	 ArrayList<Integer> list=new ArrayList();
	 System.out.println("Empty or Not :"+list.isEmpty());
	 System.out.println("Size is :"+list.size());
	 list.add(22);
	// list.add("Hello");
	 list.add(44);
	 list.add(null);
	 System.out.println(list);
	 System.out.println("Contains Method");
	 
	 System.out.println(list.contains(44));
	 System.out.println("Get Method");
	 System.out.println(list.get(1));
	 list.remove(0);
	 System.out.println(list);
	 Iterator it=list.iterator();
	 while(it.hasNext())
	 {
		 System.out.println(it.next());
	 }
	
	 
	 
	 
	}

}

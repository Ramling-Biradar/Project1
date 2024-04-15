package com.tns.ComoareExaomles;

import java.util.ArrayList;
import java.util.Collections;

public class DemoStudent {
public static void main(String[] args) {
	ArrayList<Student> stu=new ArrayList<Student>();
	stu.add(new Student(2, "Ramling", "Bhalki"));
	stu.add(new Student(1, "Raheem", "Chitguppa"));
	stu.add(new Student(3, "Raghavendra", "Chincholli"));
	System.out.println("Comparing By Roll Numbers");
	SortByRoll sortByRoll = new SortByRoll();
	Collections.sort(stu,sortByRoll);
	for (Student student : stu) {
        System.out.println(student);
        
        
    }
	
	System.out.println("Comparing By  Names");
	SortByName sortname=new SortByName();
	Collections.sort(stu,sortname);
	for (Student student : stu) {
        System.out.println(student);
        
        
    }
	
	
	
	
	
	
	
}
}

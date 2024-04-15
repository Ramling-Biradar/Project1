package com.tns.GenericExamples;

public class GenericMethod {
	public <T> void displayArrayElements(T[] elements)
	{
		for(T ele:elements)
		{
			System.out.println("element is :"+ele);
		}
	}
	public static void main(String[] args) {
		GenericMethod obj=new GenericMethod();
		Integer[] intarry= {10,20,30,40};
		obj.displayArrayElements(intarry);
		String[] stringArray= {"Ramling ","Raheem","Ragha"};
		obj.displayArrayElements(stringArray);
		
		
	}

}

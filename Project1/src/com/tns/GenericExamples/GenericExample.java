package com.tns.GenericExamples;



public class GenericExample <T>{
	T obj;//object of generic class
	
	void add(T obj)
	{
		this.obj=obj;
	}
	T get()
	{
		return obj;
	}

}

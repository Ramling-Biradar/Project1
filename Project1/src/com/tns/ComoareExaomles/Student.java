package com.tns.ComoareExaomles;

public class Student {
	int rollNo;
	String name,add;
	public Student(int rollNo, String name, String add) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.add = add;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + add + "]";
	}
	
}

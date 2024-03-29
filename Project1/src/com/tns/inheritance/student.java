package com.tns.inheritance;

public class student extends citizen{
	
	private int rollNo;

	private String collegeName;
	
	

	public student(int rollNo, String collegeName,String name, String adhar, long phoneno) {
		super(name,adhar,phoneno);
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}

	public student() {
		// TODO Auto-generated constructor stub
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getRollNo()=" + getRollNo()
				+ ", getCollegeName()=" + getCollegeName() + ", getName()=" + getName() + ", getAdhar()=" + getAdhar()
				+ ", getPhoneno()=" + getPhoneno() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	
	
	
	
	
	
	

}

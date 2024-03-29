package com.tns.inheritance;

public class citizen {
	private String name;
	private String adhar;
	private long phoneno;
	
	//default
	public citizen() {
		
	}
		//parameterized constructer
	public citizen(String name, String adhar, long phoneno) {
		this.name = name;
		this.adhar = adhar;
		this.phoneno = phoneno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdhar() {
		return adhar;
	}
	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "citizen [name=" + name + ", adhar=" + adhar + ", phoneno=" + phoneno + "]";
	}
	
	
	

}

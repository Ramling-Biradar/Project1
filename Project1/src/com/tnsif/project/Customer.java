package com.tnsif.project;


public class Customer {
	
	private String customerName,city;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private int cust_id;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", city=" + city + ", cust_id=" + cust_id + "]";
	}
	

}

package com.tns.Assignment1;

public class Commision {
	private String Name;
	private String Address;
	private long Phone;
	private double Sales_Amount;
	
	
	public void setName(String name) {
		Name = name;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
	

	public void setPhone(long phone) {
		Phone = phone;
	}

	
	
	
	public void setSales_Amount(double sales_Amount) {
		Sales_Amount = sales_Amount;
	}

	public double calculatecommision()
	{
		double commision;
		if(Sales_Amount>=100000)
		{
			commision=Sales_Amount*10/100;
		}
		else if(Sales_Amount>=50000 && Sales_Amount<100000)
		{
			commision=Sales_Amount*5/100;
		}
		else if(Sales_Amount>=30000 && Sales_Amount<50000)
		{
			commision=Sales_Amount*3/100;
		}
		else
		{
			commision=0;
		}
		return commision;
	}

	
	

}

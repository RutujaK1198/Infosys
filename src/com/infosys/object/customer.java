package com.infosys.object;

public class customer {

	String customerName;
	
	String getCustomerName()
	{
		return customerName;
	}
	
	
	void setCustomerName(String name)
	{
		this.customerName= customerName;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     customer Customer= new customer();
     Customer.customerName="Ron";
     System.out.println("Hello "+Customer.getCustomerName());
    	
     Customer.setCustomerName("Jack");
     System.out.println("Hello "+Customer.getCustomerName());
    

	}
		
	}

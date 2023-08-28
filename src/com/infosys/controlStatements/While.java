package com.infosys.controlStatements;

public class While {

	public static void main(String[] args) {
		String foodItem="Pizza";
		int totalCost=100;
		String willingToBuy="No";
		
		
		do
		{
			int quantity=2;
			int totalPrice=totalCost+(quantity*2);
			System.out.println("Order has been placed successfully");
			System.out.println("Total price of an item is " +totalPrice);
			
		}
		while(willingToBuy=="Yes");
	
		
		
		
	}

}

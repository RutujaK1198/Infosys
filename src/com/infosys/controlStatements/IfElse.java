package com.infosys.controlStatements;

public class IfElse {

	public static void main(String[] args) {
		int foodQuantity=1;
		String foodItem="Pizza";
		int unitPrice=100;
		float totalPrice= foodQuantity*unitPrice;
		String custType="Regular";
		
		
		if(custType=="Regular")
		{
			System.out.println(totalPrice=totalPrice-(totalPrice*5/100));
		}
		else
		{
			System.out.println(totalPrice=totalPrice+5);
		}

	}

}

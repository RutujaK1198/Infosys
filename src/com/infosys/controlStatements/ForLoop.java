package com.infosys.controlStatements;

public class ForLoop {

	public static void main(String[] args) {
		int totalCost=0;
		int unitPrice=10;
		int noOfItem=5;
		int quantity=10;
		
		for(int i=1; i<=noOfItem; i++)
		{
			System.out.println(i);
			System.out.println(totalCost=totalCost+(unitPrice*quantity));
		}

	}

}
package com.infosys.controlStatements;

public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=1, b=4, c=6;
		
		int d= (b*b)-(4*1*c);
		System.out.println("Value of discriminant is "+d);
		int root1=(-b+d)/(2*a);
		int root2=(-b-d)/(2*a);
		
		if(d>0)
		{
		    System.out.println(root1);
		    System.out.println(root2);
		}
		
		if(d==0)
		{
		    root1=root2;
		    System.out.println(root1);
		}
		
		if(d<0)
		{
		    System.out.println("No real roots");
		}
	}

}

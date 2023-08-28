package com.infosys.PolyMorphism;

public class Test_Shape_OL {

	public static void main(String[] args) {
		Shape_OL s= new Shape_OL();
		float ciclearea=s.CalculateArea(5);
		float rectanglearea=s.CalculateArea(5, 10);
		
		
		System.out.println("Circle's Area "+ciclearea);
		System.out.println("Rectangle's Area "+rectanglearea);

	}

}

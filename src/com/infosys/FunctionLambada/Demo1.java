package com.infosys.FunctionLambada;

import java.util.function.Function;

public class Demo1 {

	public static void main(String[] args) {
		Function<Integer,Integer>f=n->n*n;
		
		System.out.println(f.apply(5));
		System.out.println(f.apply(10));
		System.out.println(f.apply(3));

		
		//String length
		
		Function<String,Integer>f1=s->s.length();
		
		System.out.println("Lenght of string");
		System.out.println("Length of word Welcome is "+f1.apply("Welcome"));
		System.out.println("Length of word Rutu is "+f1.apply("Rutu"));
	}
 
}

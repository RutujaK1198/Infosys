package com.infosys.PredicateLambda;

import java.util.function.Predicate;

public class Demo1 {

	public static void main(String[] args) {
		
		//Ex.1
		Predicate<Integer>p=i-> (i>10);
		System.out.println(p.test(20)); //test is predefined method in Predicate
		System.out.println(p.test(5));
		
		//Ex.2---> check the length of string whether greater than 4 or not
		
		Predicate<String>St=s->(s.length()>4);
		System.out.println(St.test("Rutuja"));;
		System.out.println(St.test("Aai"));;
		
		//Ex.3---> Print array element whose size is >4 from arrays
		
		String names[]= {"Rutuja", "Dhanu","Praju","Raj"};
		
		for(String name:names)
		{
			/*if (St.test(name))   //used st predicate	//Raj will not print as length is 3
			{
				System.out.println(name);
			}*/
		
			if (name.length()>4)
			{
				System.out.println(name); //same output diff method
			}
		}
	}

}

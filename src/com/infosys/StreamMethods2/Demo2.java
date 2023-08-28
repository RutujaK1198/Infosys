package com.infosys.StreamMethods2;

import java.util.HashSet;
import java.util.Set;

//anyMatch()
//noneMatch()
//AllMatch()
//All these three will take predicate as a parameter
public class Demo2 {

	public static void main(String[] args) {

		Set<String>fruites=new HashSet<String>();
		
		fruites.add("One Apple");
		fruites.add("One Mango");
		fruites.add("Two Banana");
		fruites.add("One Guavas");
		
	//Anymatch
		boolean result=	fruites.stream().anyMatch(value->{return value.startsWith("One");});//at least one value
		System.out.println(result);
		
	//AllMatch
		boolean result1=	fruites.stream().allMatch(value->{return value.startsWith("One");}); //all should match
		System.out.println(result1);
		
		boolean result2=	fruites.stream().noneMatch(value->{return value.startsWith("One");}); 
		System.out.println(result2);
	}

}

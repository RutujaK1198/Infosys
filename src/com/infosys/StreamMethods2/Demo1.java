package com.infosys.StreamMethods2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(2,4,8,7,3,6,1,9,5);
		
		List<Integer>sorted=list1.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);
 
	    List<Integer>reverseOrder=list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()); //Comparator to import
	    System.out.println(reverseOrder);
	    
	    //String
	    List<String>list2=Arrays.asList("Raju","Shubham","Dhanu","Rutuja","Akash","Gobu");
	    
	    List<String>sorted2= list2.stream().sorted().collect(Collectors.toList());
	    System.out.println(sorted2);
	    
	    List<String>reverseOrder2=list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	    System.out.println(reverseOrder2);
	
	}

}


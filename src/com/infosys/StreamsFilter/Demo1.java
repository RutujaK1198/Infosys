package com.infosys.StreamsFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		
		/*ArrayList<Integer> a= new ArrayList<Integer>();
		
		a.add(10);
		a.add(15);
		a.add(20);
		a.add(25);
		a.add(30);*/
		
		//Simply we can write by using Arrays.aslist
		List <Integer> numberlist= Arrays.asList(10,15,20,25,30);
		List <Integer> evennumberlist= new ArrayList();
		
		//Without using STREAM we have to use for each loop and then have to put if else condition
		
		//With Streams
		
		System.out.println("Filtering data by using another list");
	evennumberlist=numberlist.stream().filter(n->n%2==0).collect(Collectors.toList());   //Predicate inside bracket
		System.out.println(evennumberlist);  
		
		//If do not want to take another Arraylist
		System.out.println("Filtering data by using same list #ForEachloop");
		numberlist.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
		System.out.println("Passing to println");
		numberlist.stream().filter(n->n%2==0).forEach(System.out::println);
		
		
		
	}

}

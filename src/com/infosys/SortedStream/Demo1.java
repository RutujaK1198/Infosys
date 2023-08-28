package com.infosys.SortedStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(2,4,8,9,5,3,1,6,7);
		List<Integer> a= l.stream().sorted().collect(Collectors.toList());
		
		System.out.println("By ascending order");
		System.out.println(a); //by default ascending
		
		List<Integer>r=l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println("By descending order");
		System.out.println(l);
		
		List<String>s=Arrays.asList("Amar","Anamika","Rajul","Sanika");
		List<String>s2=s.stream().sorted().collect(Collectors.toList());
		
		System.out.println(s2);
		
		List<String>s3=s.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(s3);
	}

}

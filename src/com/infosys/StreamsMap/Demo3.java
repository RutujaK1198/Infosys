package com.infosys.StreamsMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {

	public static void main(String[] args) {

		List<Integer> l=Arrays.asList(2,3,4,5);
		List<Integer>m= new ArrayList();
		
		System.out.println("without using MAP Stream. Multiply each value by 3");
		for(int r:l)
		{
			System.out.print(r*3+",");
			/*OR*/ m.add(r*3);
		}
		System.out.println();  
		System.out.print(m+","); //printing statement of line 18
		
		System.out.println();
		
		System.out.println("with using MAP Stream. Multiply each value by 3");
		
		m=l.stream().map(num->num*3).collect(Collectors.toList());
		System.out.print(m+",");

	}

}

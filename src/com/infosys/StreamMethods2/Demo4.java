package com.infosys.StreamMethods2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo4 {

	public static void main(String[] args) {
		List<String>birds=Arrays.asList("Peacock","cock","sparrow","Crow");
		List<String>animals=Arrays.asList("Elephant","Cow","Dog");
		
		Stream <String>stream1=birds.stream();
		Stream <String>stream2=animals.stream();
		
		List<String>Finallist=Stream.concat(stream1, stream2).collect(Collectors.toList());
		System.out.println(Finallist);  //will print all in a[]

		for(String item:Finallist)
		{
			System.out.println(item);   //will print one by one
		}
	}

}

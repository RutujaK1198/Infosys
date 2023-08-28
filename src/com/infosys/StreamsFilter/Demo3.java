package com.infosys.StreamsFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {

	public static void main(String[] args) {
		
		List<String> words=Arrays.asList("Raj", null , "Kiran", "Pooja", null, "Komal");
		List<String>result= new ArrayList<String>();
		
		result=words.stream().filter(s->s!=null).collect(Collectors.toList());
		System.out.println(result);

	}

}

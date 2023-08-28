package com.infosys.StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
//reduce method will combine the string
public class Demo3 {

	public static void main(String[] args) {
	
		List<String>l=Arrays.asList("A","B","C","1","2","3");
		
		Optional reduced=l.stream().reduce((value,combinedValue)->{
			return value+combinedValue;
		});
		
		System.out.println(reduced.get());
		}

	}



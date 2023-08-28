package com.infosys.StreamsFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		
		List<String>names= Arrays.asList("Sydney", "America","Australia","Russia");
		List<String>LongName=new ArrayList<String>();
		
		
		System.out.println("By storing value in diff variable i.e. LongName");
		LongName=names.stream().filter(str->str.length()>2 && str.length()<8).collect(Collectors.toList());
        System.out.println(LongName);
        

        System.out.println("Without using another variable and by using for each loop");
		names.stream().filter(str->str.length()>2 && str.length()<8).forEach(str->System.out.println(str));
	}
	

}

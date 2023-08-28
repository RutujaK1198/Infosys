package com.infosys.StreamMethods2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//findAny
//findFirst

public class Demo3 {

	public static void main(String[] args) {
		List<String> stringlist=Arrays.asList("two","three","one");
		
		//findAny
		Optional <String> ele=stringlist.stream().findAny();
		System.out.println(ele); //it will show optional word too
		System.out.println(ele.get());
		
		Optional <String> ele2=stringlist.stream().findFirst();
		System.out.println(ele);
		System.out.println(ele.get());
		

	}

}

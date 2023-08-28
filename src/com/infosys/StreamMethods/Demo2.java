package com.infosys.StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo2 {

	public static void main(String[] args) {
		
		List<Integer>noList=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		long noCount=noList.stream().filter(f->f%2==0).count();
        System.out.println(noCount);
        
        //MIN
             Optional <Integer>min=noList.stream().min((val1,val2)->{return val1.compareTo(val2);});
            	 
             System.out.println(min.get());
             
         //MAX
             Optional <Integer>max=noList.stream().max((val1,val2)->{return val1.compareTo(val2);});
        	 
             System.out.println(max.get());
             
             }
	}

	

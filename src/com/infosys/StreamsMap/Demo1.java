package com.infosys.StreamsMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		
		List<String>names= Arrays.asList("bus","car", "jeep","Truck","Bicycle");
		List<String>namesUpperCase=new ArrayList();
		
		System.out.println("Without using stream concept");
		for(String vehicle:names)
		{
			namesUpperCase.add(vehicle.toUpperCase());
		}
            System.out.println(namesUpperCase);
            
            System.out.println("With using Map Stream");
            
            namesUpperCase=names.stream().map(vehicle->vehicle.toUpperCase()).collect(Collectors.toList());
            System.out.println(namesUpperCase);
	}

}

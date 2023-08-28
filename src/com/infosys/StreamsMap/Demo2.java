package com.infosys.StreamsMap;

import java.util.Arrays;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>names= Arrays.asList("bus","car", "jeep","Truck","Bicycle");
		
		System.out.println("Printing lenght of list without using stream ");
		
		for(String vehicle:names)
		{
			System.out.print(vehicle.length()+",");
		}
		System.out.println();
		
		System.out.println("Printing lenght by using MAP stream");
		
		names.stream().map(vehicle->vehicle.length()).forEach(len->System.out.print(len+","));
		
		System.out.println("Printing length by using :: operation");
		names.stream().map(vehicle->vehicle.length()).forEach(System.out::print);
		
	}

}

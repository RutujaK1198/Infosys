package com.infosys.StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> vehicles=Arrays.asList("Car","Jeep","Car","Cycle","MotorCycle","Jeep");
List<String>DistinctVehicles=vehicles.stream().distinct().collect(Collectors.toList());

System.out.println(DistinctVehicles);

//OR

vehicles.stream().distinct().forEach(v->System.out.print(v+","));

System.out.println();

//COUNT method
long l=vehicles.stream().distinct().count();
System.out.println("Count is "+l);

//LIMIT
List<String>s=vehicles.stream().limit(3).collect(Collectors.toList());
System.out.println("Limited count "+s);

	}

}

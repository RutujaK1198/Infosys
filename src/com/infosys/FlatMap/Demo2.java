package com.infosys.FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		List<String> team1=Arrays.asList("Dravid","Sehwag","Jadeja");
		List<String> team2=Arrays.asList("Ganguli","Raina","Dhoni");
		List<String> team3=Arrays.asList("Sachin","Ishan","Hardik");
		
		List<List<String>> WorldCupTeam= new ArrayList<List<String>>();
		WorldCupTeam.add(team1);
		WorldCupTeam.add(team2);
		WorldCupTeam.add(team3);
		
		//Before java 8
		
		for(List<String>team:WorldCupTeam)
		{
			for(String name:team)
			{
				System.out.println(name);
			}
		}
		
		//using stream Flatmap()
		System.out.println("Using flatmap");
		List<String>newteam=WorldCupTeam.stream().flatMap(plist->plist.stream()).collect(Collectors.toList());
		System.out.println(newteam);
		
		
		
		
	}

}

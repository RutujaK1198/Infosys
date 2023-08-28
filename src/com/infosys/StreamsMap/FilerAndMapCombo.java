package com.infosys.StreamsMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
	int empId;
	String ename;
	int sal;
	
	Employee(int empId,String ename,int sal)
	{
		this.empId=empId;
		this.ename=ename;
		this.sal=sal;	
	}	
}
public class FilerAndMapCombo {

	public static void main(String[] args) {
	
/*List<Employee>l=new ArrayList<Employee>();
l.add(new Employee(1,"Alex",50000));*/
		
List<Employee>l=Arrays.asList(
new Employee (101,"Alex",50000),
new Employee (102,"Charls",20000),
new Employee (103,"Ross",30000),
new Employee (104,"Joe",10000)
	);	

//Find sal>20000(filter) and and that data in another collection(MAP)

List<Integer> EmployeeSalList=l.stream().filter(e->e.sal>20000).map(e->e.sal).collect(Collectors.toList());

 System.out.println(EmployeeSalList);
	}

}

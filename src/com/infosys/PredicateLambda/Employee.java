package com.infosys.PredicateLambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {

	
		String ename;
		int salary;
		int experience;
		
		Employee(String name, int sal, int exp)
		{
//			this.ename= name;
//			this.experience=exp;
//			this.salary=sal;
			ename=name;
			salary=sal;
			experience=exp;
				
		}
	
	public static void main(String[] args) {
		
		Employee emp= new Employee("Rutuja", 50000, 5);
		
		Predicate <Employee>Em= e->e.salary>30000 && e.experience>3;
		System.out.println(Em.test(emp)); //will return true

		ArrayList<Employee> al= new ArrayList <Employee>();
		al.add(new Employee ("John",20000,2));
		al.add(new Employee ("Rakesh",30000,5));
		al.add(new Employee ("John",60000,6));
		al.add(new Employee ("Jack",80000,7));
		al.add(new Employee ("John",10000,2));
		
		for(Employee e:al)
		{
			if (Em.test(e))   //refer line no 28
			{
				System.out.println(e.ename+ " "+e.salary+ " "+e.experience);  //will print name who satisfies conditions
			}
		}
	}

}

package com.infosys.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
	String ename;
	int salary;
	String Gender;
	
	Employee(String name, int sal, String gender)
	{
	   ename=name;
	   sal=salary;
	   Gender=gender;   
	}
}

public class Demo2 {

	public static void main(String[] args) {
		
     ArrayList <Employee>emplist= new ArrayList<Employee>();
     
    emplist.add(new Employee("David",50000,"Male"));
    emplist.add(new Employee("Mary",40000,"Female"));
    emplist.add(new Employee("Scott",60000,"Male"));
    emplist.add(new Employee("Monika",70000,"Female"));
     
    //To find bonus of employee
    Function<Employee,Integer>f=emp->(emp.salary*10)/100;
    
    //To check bonus>5000
    Predicate<Integer>p=b->b>5000;
    
    Consumer<Employee>c=emp->   //Will just print the data
    {
       System.out.println(emp.ename);
       System.out.println(emp.salary);
       System.out.println(emp.Gender);
    };
    
    for(Employee e:emplist)  //want to print all employees details with the help of emplist data
    {
    	//we want data bonus>5000
    	int bonus=f.apply(e);   //calculate bounus
    	//to check b>5000, will call predicate function
    	
    	if(p.test(bonus))
    	{
    		c.accept(e);
    		System.out.println("Employee bonus "+bonus);
    	}
    	
    	
    }
	} 
	}



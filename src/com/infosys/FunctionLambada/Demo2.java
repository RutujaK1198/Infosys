package com.infosys.FunctionLambada;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

// In this example, we will pass object as an argument.
// Output want is Bonus of the employee
class Employee{
	String ename;
	int salary;
	
	Employee(String ename, int salary)
	{
		this.ename=ename;
		this.salary=salary;
	}
	
}

public class Demo2 {

	public static void main(String[] args) {
		
		ArrayList<Employee> emp= new ArrayList<Employee>();
		
      emp.add(new Employee("Rachel", 11000));
      emp.add(new Employee("Joe",22000));
      emp.add(new Employee("Ross",40000));
      
      Function<Employee,Integer>Fl=e->{
    	  int sal=e.salary; //storing sal in the e object's salary
    	  
    	  if(sal>=10000 && sal<=20000)
    		  return sal=sal*10/100;
    	  
    	  else if (sal>20000 && sal<=30000)
    		  return sal=sal*20/100;
    	  
    	  else 
    		  return sal=sal*40/100;
    	  
      };
      
      //If we only want to print the vale where bonus>5000
      Predicate<Integer>p=b->b>5000;
      
      for (Employee empl:emp)
      {
    	 int bonus= Fl.apply(empl);   //Function Lambada
    	// System.out.println(bonus);
    	 //Line 55 & 56 print same below this line. It will print all the data 
    	if( p.test(bonus)) //Predicate Lamdba---This will print b>5000
    	{
    	  System.out.println(empl.ename+" "+empl.salary); 
    	 System.out.println("Bonus is "+bonus);
    	}
      }
}
	}
	

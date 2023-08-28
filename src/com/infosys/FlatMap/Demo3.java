package com.infosys.FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	String name;
	int std;
	char grade;
	
	Student(String sname, int stnd,char grd)
	{
//		this.name=sname;
//		this.grade=grd;
//		this.std=stnd;
		name=sname;
		std=stnd;
		grade=grd;
	}
	
}
public class Demo3 {

	public static void main(String[] args) {
    
		List<Student>studentlist1= new ArrayList<Student>();  //why <Student> = cause we want to hold student objects 
			studentlist1.add(new Student("Dravid", 101, 'A'));
			studentlist1.add(new Student("Mary", 102, 'B'));
			studentlist1.add(new Student("Alex", 103, 'C'));
			
		List<Student>studentlist2= new ArrayList<Student>();	
		studentlist2.add(new Student("Madrid", 104, 'A'));
		studentlist2.add(new Student("Maria", 105, 'B'));
		studentlist2.add(new Student("Alexander", 106, 'C'));
		
		// We have to add student1 and student2 list in one list. 
		List<List<Student>>studentList=Arrays.asList(studentlist1,studentlist2);
		
		System.out.println("By using for loop");
		for(List<Student>s:studentList)  //we are taking all objects from list<students> stored in studentList
		{
			for(Student stud:s)  //in this we are retreiving individual names
			{
				System.out.println(stud.name);
			}
		}
		
		List<String>r=studentList.stream().flatMap(stuList->stuList.stream()).map(k->k.name).collect(Collectors.toList());
		System.out.println(r);
	}

}

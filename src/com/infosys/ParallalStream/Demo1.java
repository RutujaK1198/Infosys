package com.infosys.ParallalStream;

import java.util.Arrays;
import java.util.List;

class Student{
	String name;
	int score;
	
	Student(String name, int score)
	{
		this.name=name;
		this.score=score;
	}
	
	public String getName()
	{
		return this.name;
	}
	public int getScore()
	{
		return this.score;
	}
}
public class Demo1 {

	public static void main(String[] args) {
		
     List<Student> studentList=Arrays.asList(
    		 new Student("David",82),
    		 new Student("Scott",92),
    		 new Student("Eric",72),
    		 new Student("Ajit",50),
    		 new Student("Dock",70)
    		  );
     //Sequencial stream
     studentList.stream().filter(s->s.getScore()>70).limit(2).forEach(stu->System.out.println(stu.getName()+" "+stu.getScore()));
     
     //Parallel Stream
     studentList.parallelStream().filter(s->s.getScore()>70).limit(2).forEach(stu->System.out.println(stu.getName()+" "+stu.getScore()));
     
	}

}

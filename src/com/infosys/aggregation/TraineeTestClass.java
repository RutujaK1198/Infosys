package com.infosys.aggregation;



public class TraineeTestClass {

	public static void main(String[] args) {
		
	
	
	   TraineeAddress a= new TraineeAddress("ABC", "Aurangabad");
		TraineeClass t1= new TraineeClass(101, "Rutuja");
		
 System.out.println(t1.employeeId+" "+t1.employeeName);   //to print this we have to add line no 13&14 from TraineeClass
 //If we don't want to pur this. then print syso(emplyId, emplyName) in traineeclass underconstructor
// System.out.println(a.area+" "+a.city);		
		
        
	}

}


package com.infosys.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationClass {

	public static void main(String[] args) {
		Employee emp= new Employee();
		emp.name="Rutuja Kulkarni";
		emp.address="Aurangabad";
		
		//Now we want to convert emp object into stream of byte
		//i/p o/p stream--recommended to do in try catch block
		
		try
		{
			FileOutputStream fileout= new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\RK.txt");
			ObjectOutputStream out= new ObjectOutputStream(fileout); //we are copying emp data into file thats why using objectoutputstream
			out.writeObject(emp);
			out.close();
			fileout.close();
			System.out.println("Serialization data is saved in RK.txt file");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}

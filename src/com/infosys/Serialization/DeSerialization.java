package com.infosys.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee emp=null;
		try
		{
			FileInputStream fileIn = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\RK.txt");
			ObjectInputStream in= new ObjectInputStream(fileIn);
			emp=(Employee) in.readObject();
			in.close();
			fileIn.close();
		}
		finally
		{
			System.out.println("Deserializing Employee");
			System.out.println("First Name of Employee "+emp.name);
			System.out.println("Last Name of Employee "+emp.address);
		}

	}

}

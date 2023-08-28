package com.infosys.Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException  //instead of try catch we can write throws IOException before { of main method
	{
	
		File f= new File("C:\\Users\\Lenovo\\Desktop\\RK.txt");
		try
		{
			if(f.createNewFile())
		    {
			System.out.println("File Successfully created");
		    }
		else
		    {
			System.out.println("File already exists...!");
		    }
		}
		catch(IOException i)
		{
			System.out.println("Exception handled");
		}
	}

}

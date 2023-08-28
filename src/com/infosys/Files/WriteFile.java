package com.infosys.Files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		try{
		FileWriter MyFile= new FileWriter("RK.txt");
		MyFile.write("This is the first line of file");
		MyFile.close();
		System.out.println("Successfully wrote");
		}
		catch(IOException e)
		{
			System.out.println("An error occured");
		}

	}

}

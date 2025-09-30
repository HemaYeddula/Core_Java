package com.corejava.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filereader {

	public static void main(String[] args) 
	{
		String path = "C:\\Users\\nanip\\OneDrive\\Desktop\\TAP Academy\\2. Core Java + Programming\\data.txt";
		FileReader reader = null;
		char ar[] = new char[20];
		try 
		{
			reader = new FileReader(path);
			//gives the ASCII value of 1st character in the file
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			// by using char, it gives character
			System.out.println(reader.read(ar));
			System.out.println(ar);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}

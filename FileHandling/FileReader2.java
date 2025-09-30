package com.corejava.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader2 {

	public static void main(String[] args) 
	{
		String path = "C:\\Users\\nanip\\OneDrive\\Desktop\\TAP Academy\\2. Core Java + Programming\\data.txt";
		FileReader reader = null;
		
		try 
		{
			reader = new FileReader(path);
			int c = reader.read();
			while(c != -1)
			{
				System.out.print((char)c);
				c = reader.read();
			}
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

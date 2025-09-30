package com.corejava.FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) 
	{
		String path = "C:\\Users\\nanip\\OneDrive\\Desktop\\TAP Academy\\2. Core Java + Programming\\data.txt";
		FileReader reader = null;
		
		//reads faster than filereader
		BufferedReader reader2 = null;
		
		//to find no.of lines
		int count = 0;
		
		//to find no.of characters
		int sum = 0;
		
		try 
		{
			reader = new FileReader(path);
			reader2 = new BufferedReader(reader);
			//reads line by line, not char by char
			String line = reader2.readLine();
			while (line != null)
			{
				System.out.println(line);
				
				//to find no.of characters
				int l = line.length();
				sum += l;
				
				line = reader2.readLine();
				count++;
			}
			System.out.println();
			System.out.println("No.of lines : "+count);
			System.out.println("No.of characters : "+sum);
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

package com.corejava.FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeFiles {

	public static void main(String[] args) 
	{
		String path1 = "C:\\Users\\nanip\\OneDrive\\Desktop\\TAP Academy\\2. Core Java + Programming\\Names.txt";
		String path2 = "C:\\Users\\nanip\\OneDrive\\Desktop\\TAP Academy\\2. Core Java + Programming\\PhoneNumbers.txt";
		String path3 = "C:\\Users\\nanip\\OneDrive\\Desktop\\TAP Academy\\2. Core Java + Programming\\PhoneBook.txt";

		FileReader fr1 = null;
		BufferedReader br1 = null;
		
		FileReader fr2 = null;
		BufferedReader br2 = null;
		
		FileWriter writer = null;
		try 
		{
			fr1 = new FileReader(path1);
			br1 = new BufferedReader(fr1);
			
			fr2 = new FileReader(path2);
			br2 = new BufferedReader(fr2);
			
			//write two files data into other file
			writer = new FileWriter(path3);
			
			String name = br1.readLine();
			String phoneNo = br2.readLine();
			
			while (name != null)
			{
				System.out.println(name + " : " + phoneNo);
				writer.write(name + " : " + phoneNo + "\n");
				name = br1.readLine();
				phoneNo = br2.readLine();
			}
			writer.flush();
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

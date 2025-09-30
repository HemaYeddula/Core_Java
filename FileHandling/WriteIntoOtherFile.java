package com.corejava.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoOtherFile {

	public static void main(String[] args) 
	{
		String path = "C:\\Users\\nanip\\OneDrive\\Desktop\\TAP Academy\\2. Core Java + Programming\\data.txt";
		String path2 = "C:\\Users\\nanip\\OneDrive\\Desktop\\TAP Academy\\2. Core Java + Programming\\newData.txt";

		FileReader reader = null;
		FileWriter writer = null;
		
		try 
		{
			reader = new FileReader(path);
			writer = new FileWriter(path2);
			int c = reader.read();
			while(c != -1)
			{
				//System.out.print((char)c);
				writer.write(c);
				c = reader.read();
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

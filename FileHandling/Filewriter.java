package com.corejava.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filewriter {

	public static void main(String[] args) 
	{
		String path = "C:\\Users\\nanip\\OneDrive\\Desktop\\TAP Academy\\2. Core Java + Programming\\data.txt";
		//File file = new File(path);
		Scanner scan = new Scanner(System.in);
		FileWriter writer = null;
		try 
		{
			System.out.println("Type 3 strings");
			String s1 = scan.next();
			String s2 = scan.next();
			String s3 = scan.next();
			writer = new FileWriter(path,true);
			writer.write("Hello World");
			writer.write(s1);
			writer.write(s2);
			writer.write(s3);
			writer.flush();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			scan.close();
			try {
				writer.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}

}

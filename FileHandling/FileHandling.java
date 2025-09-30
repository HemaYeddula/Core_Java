package com.corejava.FileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandling 
{
	public static void main(String args[])
	{
		String path = "C:\\Users\\nanip\\OneDrive\\Desktop\\TAP Academy\\2. Core Java + Programming\\data.txt";
		File file = new File(path);
		System.out.println(file.exists());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getAbsolutePath());  //type string
		System.out.println(file.getAbsoluteFile());   //type file
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		
		String path1 = "C:\\Users\\nanip\\OneDrive\\Desktop\\TAP Academy\\2. Core Java + Programming\\bbbb.txt";
		File file1 = new File(path1);
		
		try 
		{
			file1.createNewFile();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println(file1.exists());
		
		String path2 = "C:\\Users\\nanip\\OneDrive\\Desktop\\TAP Academy\\2. Core Java + Programming\\file";
		File file2 = new File(path2);
		
		file2.mkdir();
		
		String path3 = "C:\\Users\\nanip\\OneDrive\\Desktop\\TAP Academy\\2. Core Java + Programming";
		File file3 = new File(path3);
		
		String[] myFiles = file3.list();
		for (String myFile : myFiles)
		{
			System.out.println(myFile);
		}
	}
}

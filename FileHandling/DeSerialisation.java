package com.corejava.FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialisation {

	public static void main(String[] args) 
	{
		String path = "C:\\Users\\nanip\\OneDrive\\Desktop\\TAP Academy\\2. Core Java + Programming\\Objects.txt";
		FileInputStream fis;
		try 
		{
			fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Customer customer = (Customer) ois.readObject();
			System.out.println(customer.getName());
			System.out.println(customer.getCrn());
			System.out.println(customer.getBalance());

		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}

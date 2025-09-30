package com.corejava.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//POJO Class
class Customer implements Serializable
{
	//it is used when we do serialization & deserialization in different systems
	private static final long serialVersionUID = 8154163948128720413L;
	private String name;
	private long crn;
	transient private float balance;
	public Customer(String name, long crn, float balance) 
	{
		super();
		this.name = name;
		this.crn = crn;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getCrn() {
		return crn;
	}
	public void setCrn(long crn) {
		this.crn = crn;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	
}

public class Serialisation {

	public static void main(String[] args) 
	{
		Customer customer= new Customer("Hema",12345678l,20000);
		String path = "C:\\Users\\nanip\\OneDrive\\Desktop\\TAP Academy\\2. Core Java + Programming\\Objects.txt";
		try 
		{
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(customer);
			oos.flush();
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

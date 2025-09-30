package com.Core;

import java.util.Scanner;

class SingleRun implements Runnable
{
	@override
	public void run()
	{
		Thread t = Thread.currentThread();
		
		String name = t.getName();
		
		if (name.equals("ADD"))
		{
			add();
		}
		else if (name.equals("CHAR"))
		{
			printChar();
		}
		else if (name.equals("NUM"))
		{
			printNum();
		}
		
	}
	
	void add()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd number: ");
		int b = sc.nextInt();
		System.out.println(a+b);
	}
	
	void printChar()
	{
		for (int i=65;i<=75;i++)
		{
			System.out.println((char)i);
			try {
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	void printNum()
	{
		for (int i=1;i<=10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}




public class MultiRunnable {

	public static void main(String[] args) 
	{
		SingleRun sr = new SingleRun();
		
		Thread t1 = new Thread(sr);
		Thread t2 = new Thread(sr);
		Thread t3 = new Thread(sr);
		
		t1.setName("ADD");
		t2.setName("CHAR");
		t3.setName("NUM");
		
		t1.start();
		t2.start();
		t3.start();

	}

}

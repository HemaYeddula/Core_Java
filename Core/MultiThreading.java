package com.Core;

import java.util.Scanner;

class Demo1 extends Thread
{
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd number: ");
		int b = sc.nextInt();
		System.out.println(a+b);
	}
}

class Demo2 extends Thread
{
	public void run()
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
}

class Demo3 extends Thread
{
	public void run()
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

public class MultiThreading {

	public static void main(String[] args) 
	{
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		d1.start();
		d2.start();
		d3.start();
	}

}

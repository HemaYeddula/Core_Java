package com.Core;

class A extends Thread
{
	public void run()
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println("User Thread");
		}
	}
}

public class UsingJoin {

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Main thread started executing...");
		
		A t = new A();
		t.start();
		
		System.out.println(t.isAlive());
		
		t.join(); //after t completes then next lines executes

		System.out.println(t.isAlive());
		
		System.out.println("Main thread finished execution...");
	}

}

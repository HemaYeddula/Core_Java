package com.Core;

class Family1 implements Runnable
{
	String resource1 = "Playstation";
	String resource2 = "Controller";
	
	public void run()
	{
		String name = Thread.currentThread().getName();
		if (name.equals("Rohit") == true)
		{
			rohitAccquiredResource();
		}
		else
		{
			vijayAccquiredResource();
		}
	}
	
	void rohitAccquiredResource()
	{
		synchronized(resource1)
		{
			try 
			{
				System.out.println("Rohit accquired Playstation");
				Thread.sleep(1000);
				
				synchronized (resource2)
				{
					System.out.println("Rohit accquired Controller");
					Thread.sleep(1000);
				}
			} 
			catch (InterruptedException e) 
			{
				System.out.println("Rohit failed");
			}
		}
	}
	void vijayAccquiredResource()
	{
		synchronized(resource1)
		{
			try 
			{
				System.out.println("Vijay accquired Playstation");
				Thread.sleep(1000);
				
				synchronized (resource2)
				{
					System.out.println("Vijay accquired Controller");
					Thread.sleep(1000);
				}
			} 
			catch (InterruptedException e) 
			{
				System.out.println("Vijay failed");
			}
		}
	}
}


public class NoDeadlock {

	public static void main(String[] args) 
	{
		Family1 f = new Family1();
		
		Thread t1 = new Thread(f);
		Thread t2 = new Thread(f);
		
		t1.setName("Rohit");
		t2.setName("Vijay");
		
		t1.start();
		t2.start();

	}

}

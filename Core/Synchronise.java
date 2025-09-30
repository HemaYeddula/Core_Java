package com.Core;

class Printer implements Runnable
{
	@override
	public void run()
	{
		String name = Thread.currentThread().getName();
		try 
		{
			System.out.println(name+ " 1st line printing..");
			Thread.sleep(1000);
			System.out.println(name+ " 2nd line printing..");
			Thread.sleep(1000);
			System.out.println(name+ " 3rd line printing..");
			Thread.sleep(1000);
			System.out.println(name+ " 4th line printing..");
			Thread.sleep(1000);
			System.out.println(name+ " 5th line printing..");
			Thread.sleep(1000);
			
			
			//synchronized is used to execute one thread at a time
			//below is the code for synchronized block
			//synchronized is used to provide lock for the single thread at a time
			
			synchronized(this)   //this is the object reference
			{
				System.out.println(name+ " 6th line printing..");
				Thread.sleep(1000);
				System.out.println(name+ " 7th line printing..");
				Thread.sleep(1000);
				System.out.println(name+ " 8th line printing..");
				Thread.sleep(1000);
				System.out.println(name+ " 9th line printing..");
				Thread.sleep(1000);
				System.out.println(name+ " 10th line printing..");
				Thread.sleep(1000);
			}
			
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}
}

public class Synchronise {

	public static void main(String[] args) 
	{
		Printer p = new Printer();
		
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		Thread t3 = new Thread(p);
		
		t1.setName("GIRL");
		t2.setName("BOY");
		t3.setName("OTHER");
		
		t1.start();
		t2.start();
		t3.start();

	}

}

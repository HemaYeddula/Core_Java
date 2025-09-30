package com.Core;

class Queue1
{
	int x;
	boolean is_data_present = false;
	synchronized void store(int j)
	{
		try
		{
			if (is_data_present == false)
			{
				x = j;
				System.out.println("Producer Produced "+x);
				is_data_present = true;
				notify();
			}
			else
			{
				wait();
			}
		}
		catch(Exception e)
		{
			System.out.println("Some problem ocuured");
		}
	}
	
	synchronized void retrieve()
	{
		try 
		{
			if (is_data_present == true)
			{
				System.out.println("Consumer Consumed "+x);
				is_data_present = false;
				notify();
			}
			else
			{
				wait();
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Some problem ocuured");
		}
		
	}
}

class Producer1 extends Thread
{
	Queue1 a;
	Producer1(Queue1 qu)
	{
		a = qu;
	}
	public void run()
	{
		int i = 1;
		for (;;)
		{
			a.store(i++);
		}
	}
}

class Consumer1 extends Thread
{
	Queue1 b;
	Consumer1(Queue1 qu)
	{
		b = qu;
	}
	public void run()
	{
		for (;;)
		{
			b.retrieve();
		}
	}
}

public class SolvedProducerConsumer {

	public static void main(String[] args) 
	{
		Queue1 qu = new Queue1();
		
		Producer1 p = new Producer1(qu);
		
		Consumer1 c = new Consumer1(qu);
		
		p.start();
		c.start();

	}

}

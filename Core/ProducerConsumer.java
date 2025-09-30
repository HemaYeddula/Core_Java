package com.Core;

class Queue
{
	int x;
	void store(int j)
	{
		x = j;
		try 
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Producer Produced "+x);
	}
	
	void retrieve()
	{
		try 
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Consumer Consumed "+x);
	}
}

class Producer extends Thread
{
	Queue a;
	Producer(Queue q)
	{
		a = q;
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

class Consumer extends Thread
{
	Queue b;
	Consumer(Queue q)
	{
		b = q;
	}
	public void run()
	{
		for (;;)
		{
			b.retrieve();
		}
	}
}

public class ProducerConsumer {

	public static void main(String[] args) 
	{
		Queue q = new Queue();
		
		Producer p = new Producer(q);
		
		Consumer c = new Consumer(q);
		
		p.start();
		c.start();

	}

}

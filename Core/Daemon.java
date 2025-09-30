package com.Core;

class Eclipse implements Runnable
{
	@Override
	public void run() 
	{
		Thread t = Thread.currentThread();
		
		String name = t.getName();
		
		if (name.equals("TYPE"))
		{
			typing();
		}
		else if (name.equals("SAVE"))
		{
			autoSave();
		}
		else if (name.equals("CODE"))
		{
			codeCompilation();
		}
		
		
	}
	
	//USER THREAD
	void typing()
	{
		System.out.println("Typing started");
		
		for (int i=1;i<=5;i++) 
		{
			System.out.println("Typing...");
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
		System.out.println("Typing finished");
	}
	
	//DAEMON THREAD - INFINITE LOOP
	void autoSave()
	{
		System.out.println("AutoSaving started");
		
		for(;;)  
		{
			System.out.println("Saving...");
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	//DAEMON THREAD - INFINITE LOOP
	void codeCompilation()
	{
		System.out.println("Code Compilation Started");
		
		for(;;) 
		{
			System.out.println("Compiling...");
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
}


public class Daemon {

	public static void main(String[] args) 
	{
		Eclipse e = new Eclipse();
		
		Thread t1 = new Thread(e);
		Thread t2 = new Thread(e);
		Thread t3 = new Thread(e);

		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t1.setName("TYPE");
		t2.setName("SAVE");
		t3.setName("CODE");
		
		t1.start();
		t2.start();
		t3.start();
	}

}

package com.Core;

import java.util.Scanner;

interface Calculator
{
	void add(); //interface methods are already surrounded by public and abstract
	void sub();
}

class MyCal1 implements Calculator
{
	// here we have to specify public because inherited methods 
	// should have same access specifier
	// interface methods are default public
	public void add()
	{
		int a = 200;
		int b = 100;
		System.out.println(a+b);	
	}

	@Override
	public void sub() 
	{
		int a = 200;
		int b = 100;
		System.out.println(a-b);
	}
}

class MyCal2 implements Calculator
{
	private Scanner sc;
	private Scanner sc2;

	// here we have to specify public because inherited methods 
	// should have same access specifier
	// interface methods are default public
	public void add()
	{
		sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = sc.nextInt();
		System.out.println("Enter second number : ");
		int b = sc.nextInt();
		System.out.println(a+b);	
	}

	@Override
	public void sub() 
	{
		sc2 = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = sc2.nextInt();
		System.out.println("Enter second number : ");
		int b = sc2.nextInt();
		System.out.println(a-b);
	}
}

class MyCal3 implements Calculator
{
	// here we have to specify public because inherited methods 
	// should have same access specifier
	// interface methods are default public
	public void add()
	{
		System.out.println(200+100);	
	}

	@Override
	public void sub() 
	{
		System.out.println(200-100);
	}
}
public class Interface {

	public static void main(String[] args) {
		MyCal1 c1 = new MyCal1();
		MyCal2 c2 = new MyCal2();
		MyCal3 c3 = new MyCal3();
		
		c1.add();
		c1.sub();
		
		c2.add();
		c2.sub();
		
		c3.add();
		c3.sub();

	}

}

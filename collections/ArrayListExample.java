package com.corejava.collections;

import java.util.ArrayList;

public class ArrayListExample 
{
	public static void main(String args[])
	{
		ArrayList<Object> list = new ArrayList<>();
		
		list.add(10);
		list.add(new String("Hema"));
		list.add(new ArithmeticException());
		list.add(new Thread());
		
		System.out.println(list);
		
		for (int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}
}

package com.corejava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;



class MyCompare2 implements Comparator<Employee1>
{

	@Override
	public int compare(Employee1 e1, Employee1 e2) 
	{
		String name1 = e1.getName();
		String name2 = e2.getName();
		
		int l1 = name1.length();
		int l2 = name2.length();
		
		if (l1 != l2)
		{
			return l1 - l2;
		}
		else
		{
			return name1.compareTo(name2);
		}
	}
	
}



class MyCompare1 implements Comparator<Employee1>
{

	@Override
	public int compare(Employee1 e1, Employee1 e2) 
	{
		String name1 = e1.getName();
		String name2 = e2.getName();
		
		
		if (name1.compareTo(name2) != 0)
		{
			return name1.compareTo(name2);
		}
		else
		{
			return e1.getId() - e2.getId();
		}
	}
	
}


class MyCompare3 implements Comparator<Integer>
{

	@Override
	public int compare(Integer i1, Integer i2) 
	{
		// descending order
		return i2 - i1;
	}
	
}


class ComparatorExample
{
	public static void main(String args[])
	{
		MyCompare3 compare3 = new MyCompare3();
		
		//TreeSet<Integer> set = new TreeSet<>(compare3);
		
		ArrayList<Integer> set = new ArrayList<>();
		
		set.add(100);
		set.add(150);
		set.add(25);
		set.add(50);
		set.add(750);
		set.add(90);
		
		System.out.println(set);
		
		Collections.sort(set);
		System.out.println(set);
		
		Collections.sort(set, compare3); //compare3 object is used to sort in descending order
		System.out.println(set);
	}
}




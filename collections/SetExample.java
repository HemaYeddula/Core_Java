package com.corejava.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) 
	{
		//Insertion is not allowed
		//HashSet<Integer> set = new HashSet<>();
		
		//Insertion order is maintained
		//LinkedHashSet<Integer> set = new LinkedHashSet<>();
		
		//Sorted order is maintained
		TreeSet<Integer> set = new TreeSet<>();
		
		
		// TreeSet don't allow null values
		//set.add(null);
		//set.add(null);
		set.add(100);
		set.add(10);
		set.add(23);
		set.add(200);
		set.add(150);
		set.add(100);
		
		for (Integer x : set)
		{
			System.out.println(x);
		}
	}

}

package com.corejava.collections;

import java.util.Scanner;
import java.util.TreeSet;

public class SetProgram3 {

	public static void main(String[] args) 
	{
		TreeSet<String> set = new TreeSet<>();
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String[] ar = str.split(",");
		
		for (int i=0;i<ar.length;i++)
		{
			set.add(ar[i].trim().toLowerCase());
		}
		
		for (String s : set)
		{
			System.out.println(s);
		}
	
	}

}

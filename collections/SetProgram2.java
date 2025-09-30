package com.corejava.collections;

import java.util.Scanner;
import java.util.TreeSet;

public class SetProgram2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array of strings: ");
		String s = sc.next();
		String[] words = s.split(",");
		
		TreeSet<String> set = new TreeSet<>();
		
		for (String word : words)
		{
			set.add(word);
		}
		System.out.println(set);
	}

}

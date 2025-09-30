package com.corejava.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetProgram1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next();
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		System.out.println(set);
	}

}

package com.corejava.collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class SetProgram5 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		printRepeated(str);

	}

	private static void printRepeated(String str) 
	{

		String[] words = str.split(" ");
		
		HashMap<String,Integer> map = new HashMap<>();
		
		for (String word : words)
		{
			map.put(word, map.getOrDefault(word,0)+1);
		}
		
		Set<Entry<String,Integer>> entrys = map.entrySet();

		for (Entry<String,Integer> e : entrys)
		{
			if (e.getValue() > 3)
			{
				System.out.println(e.getKey());
			}
		}

	}

}

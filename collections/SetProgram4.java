package com.corejava.collections;


import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class SetProgram4 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.next();
		
		System.out.println(rearrange(str));
		System.out.println(rearrangeTotal(str));
		
		System.out.println(printRepeated(str));
		
	}

	private static String rearrange(String str) 
	{
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
		
		for (int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if (map.containsKey(ch))
			{
				map.put(ch, map.getOrDefault(ch, 0)+1);
			}
			else
			{
				map.put(ch,1);
			}
		}
		Set<Entry<Character,Integer>> entrys = map.entrySet();
		
		String t = "";
		for (Entry<Character,Integer> e : entrys)
		{
			t = t + e.getKey() + e.getValue();
		}
		return t;
	}

	private static String rearrangeTotal(String str) 
	{
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
		
		for (int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if (map.containsKey(ch))
			{
				map.put(ch, map.getOrDefault(ch, 0)+1);
			}
			else
			{
				map.put(ch,1);
			}
		}
		int total = 0;
		/*for (char c : map.keySet())
		{
			total += map.get(c);
		}*/
		Set<Entry<Character,Integer>> entrys = map.entrySet();
		
		String t = "";
		for (Entry<Character,Integer> e : entrys)
		{
			t = t + e.getKey();
			total += e.getValue();
		}
		return t+total;
	}
	
	
	private static String printRepeated(String str) 
	{
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
		
		for (int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if (map.containsKey(ch))
			{
				map.put(ch, map.getOrDefault(ch, 0)+1);
			}
			else
			{
				map.put(ch,1);
			}
		}
		
		Set<Entry<Character,Integer>> entrys = map.entrySet();
		String t = "";
		for (Entry<Character,Integer> e : entrys)
		{
			if (e.getValue() > 3)
			{
				t = t + e.getKey();
			}
		}
		return t;
	}
}

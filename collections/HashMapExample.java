package com.corejava.collections;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) 
	{
		/*HashMap map = new HashMap();
		
		map.put("India", 900);
		map.put("China", 900);
		map.put("UK", 900);
		map.put("USA", 900);
		//map.put(0, "Pakistan");
		//map.put(true, false);
		//map.put(3.14, new ArrayList());
		
		*/
		
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("India", 900);
		map.put("China", 900);
		map.put("UK", 900);
		map.put("USA", 900);
		map.put("India", 1900);
		map.put("China", 9100);
		
		System.out.println("Values printed using keySet...");
		Set<String> keys = map.keySet();
		
		for (String key : keys)
		{
			Integer value = map.get(key);
			System.out.println(key + " : " + value);	
		}
		
		System.out.println("\n" + map + "\n");
		
		Set<Entry<String,Integer>> entries = map.entrySet();
		
		for (Entry<String,Integer> e : entries)
		{
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println(e.getKey() + " : " + e.getValue());
			System.out.println();
		}
		
	}

}

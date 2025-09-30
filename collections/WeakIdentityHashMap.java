package com.corejava.collections;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.WeakHashMap;

public class WeakIdentityHashMap {

	public static void main(String[] args) 
	{
		//HashMap<String,Integer> map = new HashMap<>();
		
		//IdentityHashMap<String,Integer> map = new IdentityHashMap<>();
		
		WeakHashMap<String,Integer> map = new WeakHashMap<>();
		
		String s1 = new String("Hema");
		//String s2 = new String("Hema");
		
		String s2 = s1;
		
		//map.put(s1,100);
		map.put(s2,200);
		
		s1 = null;
		s2 = null;
		
		System.gc();
		
		System.out.println(map);
	}

}

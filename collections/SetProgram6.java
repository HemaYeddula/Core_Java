package com.corejava.collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetProgram6 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of elements: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the elements: ");
		int[] arr = new int[n];
		for (int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Total groups: ");
		System.out.println(groupCount(arr));
	}

	private static int groupCount(int[] arr) 
	{
		Set<Integer> set = new HashSet<>();
		int gc = 0;
		for (int i : arr)
		{
			if (set.contains(i))
			{
				gc++;
				set.clear();
			}
			else
			{
				set.add(i);
			}	
		}
		return gc;
	}

	
}

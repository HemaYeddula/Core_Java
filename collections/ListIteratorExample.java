package com.corejava.collections;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ListIteratorExample {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		while (sc.hasNextInt())
		{
			int x = sc.nextInt();
			list.add(x);
		}
		ListIterator<Integer> li = list.listIterator();
		
		while (li.hasNext())
		{
			System.out.print(li.next() + " ");
		}
		System.out.println();
		
		while (li.hasPrevious())
		{
			System.out.print(li.previous() + " ");
		}
	}

}

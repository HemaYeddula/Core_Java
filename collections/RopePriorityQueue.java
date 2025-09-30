package com.corejava.collections;

import java.util.PriorityQueue;
import java.util.Scanner;

public class RopePriorityQueue {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of ropes: ");
		int n = sc.nextInt();
		
		PriorityQueue<Integer> ropes = new PriorityQueue<>();
		System.out.println("Enter the lengths of the ropes: ");
		
		for(int i=0;i<n;i++)
		{
			int length = sc.nextInt();
			ropes.add(length);
		}
		int totalcost = 0, sum;
		
		while (ropes.size()>1)
		{
			// takes the least because we are using PriorityQueue
			int r1 = ropes.poll();
			int r2 = ropes.poll();
			sum = r1+r2;
			totalcost = totalcost + sum;
			ropes.add(sum);
		}
		System.out.println(totalcost);
	}

}

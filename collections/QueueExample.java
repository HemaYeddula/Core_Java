package com.corejava.collections;

import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		queue.offer(50);
		queue.offer(20);
		queue.offer(60);
		queue.offer(10);
		queue.offer(30);
		queue.offer(40);
		queue.offer(70);
		
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue);
		System.out.println(queue.element());
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println("\nIf no elements: ");
		System.out.println(queue.poll());
		System.out.println(queue);
	}

}

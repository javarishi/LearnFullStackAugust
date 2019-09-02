package com.h2kinfosys.learnJava.collections;

import java.util.PriorityQueue;

public class QueueTest {

	public static void main(String[] args) {
		// FIFO
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.add("D");
		queue.add("E");
		
		PriorityQueue<String> emptyQueue = new PriorityQueue<String>();
		
		// element() -  Retrieves, but does not remove, the head of this queue.
		System.out.println("queue.element() :: " + queue.element());
		System.out.println(" queue :: " +  queue);
		// java.util.NoSuchElementException
		//System.out.println("emptyQueue.element() :: " + emptyQueue.element());
		//System.out.println(" emptyQueue :: " +  emptyQueue);
		
		// peek() - Retrieves, but does not remove, the head of this queue,or returns null if this queue is empty.
		System.out.println("queue.peek() :: " + queue.peek());
		System.out.println(" queue :: " +  queue);
		// You get NULL if queue is empty
		System.out.println("emptyQueue.peek() :: " + emptyQueue.peek());
		System.out.println(" emptyQueue :: " +  emptyQueue);
		
		// offer() - Inserts the specified element into this priority queue.
		System.out.println("queue.offer() :: " + queue.offer("X"));
		System.out.println(" queue :: " +  queue);
		
		// remove() - Retrieves and removes the head of this queue
		System.out.println("queue.remove() :: " + queue.remove());
		System.out.println(" queue :: " +  queue);
		// java.util.NoSuchElementException
		//System.out.println("emptyQueue.remove() :: " + emptyQueue.remove());
		//System.out.println(" emptyQueue :: " +  emptyQueue);
		
		// poll() - Retrieves and removes the head of this queue
		System.out.println("queue.poll() :: " + queue.poll());
		System.out.println(" queue :: " +  queue);
		// You get NULL if queue is empty
		System.out.println("emptyQueue.poll() :: " + emptyQueue.poll());
		System.out.println(" emptyQueue :: " +  emptyQueue);
		
	}

}

package com.chainsys.collection;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> arraydeque =new ArrayDeque<String>();
		// use an ArrayDeque like a stack
		arraydeque.push("A");
		arraydeque.push("B");
		arraydeque.push("X");
		arraydeque.push("Z");
		arraydeque.push("D");
		arraydeque.push("X"); // Duplicate value
		arraydeque.push("Z"); // Duplicate value
		arraydeque.push("E");
		arraydeque.push("F");
		
	/*	System.out.println("Before Popping the stack: "+arraydeque.size());
		while (arraydeque.peek() != null)
			System.out.println(arraydeque.pop() + " ");
		System.out.println("After Popping the stack: "+arraydeque.size());  */
		Iterator<String> iterator = arraydeque.iterator();
				while(iterator.hasNext()) {
					System.out.println("\t"+iterator.next());
				}
		Iterator<String> striterator = arraydeque.descendingIterator();
		while(striterator.hasNext())
		{
			System.out.println("\t"+ striterator.next());
		}
		arraydeque.addFirst("H");
		arraydeque.addLast("I");
		iterator = arraydeque.iterator();
		while(iterator.hasNext()) {
			System.out.println("\t"+ iterator.next());
			
		}
		// pollFirst
		// Retrieves and removes the first element of this deque, or 
		// Returns null if this deque is empty
		System.out.println("*********PollFirst: "+arraydeque.pollFirst());
		System.out.println(arraydeque);
		System.out.println("*********PollLast: "+arraydeque.pollLast());
		System.out.println(arraydeque);
		// peekFirst
		//Retrieves, but does not remove, the first element of this deque, or 
		//returns null if this deque is empty
		System.out.println("***PeekFirst: "+arraydeque.peekFirst());
		System.out.println(arraydeque);
		System.out.println("***PeekLast: "+arraydeque.peekLast());
		System.out.println(arraydeque);
		//
		//removeFirst
		//retrieves and removes the first element of this deque.
		// this method differs from pollfirst only in that it throws an exception
		// if this deque is empty
		System.out.println("****removeFirst");
	
	}

}

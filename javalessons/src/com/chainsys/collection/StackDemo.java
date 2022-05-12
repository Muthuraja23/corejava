package com.chainsys.collection;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		System.out.println("Stack: "+ st.size());
		st.push( 42);
		st.push( 66);
		st.push( 99);
		System.out.println("Stac: "+ st.size());
		Iterator<Integer> int_itr = st.iterator();
		while(int_itr.hasNext())
		{
			System.out.println(int_itr.next()+" ");
		}
		System.out.println();
		//Integer a = st.pop();
		Integer a = st.peek();
		System.out.println(a);
		System.out.println("After PEEK stack:" + st.size());
		//System.out.println("After POP stack: "+ st.size());
		a = st.peek();
		//a = st.pop();
		System.out.println(a);
		System.out.println("After PEEK stack:" + st.size());
		//System.out.println("After POP stack: "+ st.size());
		a = st.peek();
		//a = st.pop();
		System.out.println(a);
		System.out.println("After PEEK stack:" + st.size());
		//System.out.println("After POP stack:" + st.size());
		try {
			a = st.peek();
			//a= st.pop();
			System.out.println(a);
		}
		catch(EmptyStackException e)
		{
			System.out.println("Empty stack " + e.getMessage());
			
		}

	}

}

package com.chainsys.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTreeSetDemo {
	public static void main(String args[]) {
		demoA();
	}

	public static void demoA()
	{
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Cut");
		ts.add("Fun");
	//	ts.add("Assam");
		ts.add("Ball");
		ts.add("Dog");
		ts.add("Aag");
		ts.add("AAg");
		//ts.add("Event");
		ts.add("Fan");
		//ts.add(null);
		ts.add("Delhi");
		//ts.add("Carrot");
		ts.add("Ball");
		ts.add("apple");
		ts.add("boy");
		ts.add("egg");
		ts.add("Fool");
		System.out.println("Size "+ ts.size());
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
	}
}



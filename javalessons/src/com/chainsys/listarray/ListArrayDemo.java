package com.chainsys.listarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListArrayDemo {
	public static void usingStringArrayList() {
		ArrayList<String> stringArrayList = new ArrayList<String>();
		System.out.println("Initial sizez of stringArrayList: " + stringArrayList.size());
	try {
		stringArrayList.add("Car");
		stringArrayList.add("Auto");
		stringArrayList.add("Egg");
		stringArrayList.add("Box");
		stringArrayList.add("Doll");
		stringArrayList.add("Fan");
		// will insedrt a new value,
		// pushing the current value of index 1 to the next index
		stringArrayList.add("Animal");
		stringArrayList.add("Girl");
		stringArrayList.add("Fan");
		System.out.println("Size of stringArrayList after addictions: "+ stringArrayList.size());
		System.out.println("Contents of stringArrayList: "+stringArrayList);
		// will replace the value in index 2
		stringArrayList.set(2, "Xenas");
		System.out.println("After set(2): " + stringArrayList.lastIndexOf("Fan"));
		// remove the first instance of 'fan'
		stringArrayList.remove("Fan");
		stringArrayList.remove(2);
		System.out.println("Size after remove(2): " + stringArrayList.size());
		System.out.println("Contents of stringArrayList: "+ stringArrayList);
		// will reduce the capacity
		stringArrayList.trimToSize();
	}
	catch(Exception err) {
		System.out.println(err.getMessage());
		
		
	}
	}


public static void lessonArrayList() {
	ArrayList<Emp> empArrayList = new ArrayList<Emp>(30);
	System.out.println("InitialArrayList size of empArrayList: " + empArrayList.size());//0
	try {
		for (int i=0;i < 5; i++) {
			Emp e1 = new Emp(i, null);
			e1.Name = "Emp"+ i;
			empArrayList.add(e1);
		}
		System.out.println("Size of empArrayList after addition: "+ empArrayList.size());
		Emp e3 = (Emp) empArrayList.get(4);
		empArrayList.add(e3);
		System.out.println("Size of empArrayList after additions: " + empArrayList.size());
		Emp e4 = new Emp (4, null);
		e4.Name= "raj";	
		empArrayList.add(new Emp (4, null));
		System.out.println("Freq of [Emp id-4] in ArrayList-" + Collections.frequency(empArrayList, e3));
		Iterator<Emp> empIterator = empArrayList.iterator();
		while (empIterator.hasNext()) {
			Object element = empIterator.next();// return current object
			Emp e1 = (Emp) element;
			System.out.println("\t" + e1.getID() + " " + e1.Name);
		}
		
	} catch ( Exception err) {
		System.out.println("ERROR!!! "+ err.getMessage());
	}
	}
	
	}



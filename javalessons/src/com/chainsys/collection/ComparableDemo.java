package com.chainsys.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.chainsys.listarray.Emp;

public class ComparableDemo {

	public static void main(String[] args) {
		//compareEmp();
		sortComparableEmp();
	}
	public static <T> void compareEmp() {
		Emp el=new Emp (100, null);
		el.Name="Sam";
		Emp e2=new Emp (200, null);
		e2.Name="Musk";
		Emp e3=new Emp (300, null);
		e3.Name = "Jobs";
		List<Emp> empList =new ArrayList<>();
		empList.add(e2);
		empList.add (e3);
		empList.add(el);
		System.out.println (empList);
	//	Collections.sort(empList);
		System.out.println (empList);

}
	public static void sortComparableEmp() { 
		EmpComparable el=new EmpComparable ();
		el.Name="Sam";
		EmpComparable e2=new EmpComparable ();
		e2.Name= "Musk";
		EmpComparable e3=new EmpComparable ();
		e3.Name = "Jobs";
		List<EmpComparable> empList =new ArrayList<> ();
		empList.add(e2);
		empList.add (e3);
		empList.add (el);
		//System.out.println (empList);
		Iterator<EmpComparable> emp_iterator=empList.iterator ();
		while (emp_iterator.hasNext ())
		{
		System.out.println (emp_iterator.next().getID());
		}
		Collections.sort ( empList);
		System.out.println("----");
		emp_iterator=empList.iterator ();
		while (emp_iterator.hasNext ())
		{
		System.out.println (emp_iterator.next().getID());
		}
	}
}
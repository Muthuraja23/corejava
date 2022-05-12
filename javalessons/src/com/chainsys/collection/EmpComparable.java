package com.chainsys.collection;

public class EmpComparable implements Comparable<EmpComparable> {
	private final int id = 0;
	public String Name;
	//public EmpComparable (int v1) {
	public int getID() {
	return id;
	}

	@Override
	public int compareTo (EmpComparable other)
	{
	int result=0;
	result=Integer.compare (this.getID(), other.getID());
	return result;
	}
}



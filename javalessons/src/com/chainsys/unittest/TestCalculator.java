package com.chainsys.unittest;


import com.chainsys.oops.interfaces.ICalculator;

public class TestCalculator {

	public static void main(String[] args) {
		ICalculator c=new ICalculator();
        System.out.println("Added value "+ c.add(1,99));
        System.out.println("Multiplied value "+ c.multiply(5, 6));
        System.out.println("Divided value "+ c.divide(100,2));
	}

}

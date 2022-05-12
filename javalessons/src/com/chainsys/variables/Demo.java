package com.chainsys.variables;

public class Demo {
	//static global variable
	public static int Dataa;
	 // immutable global variable (not static)
	public static int Datab;
	// constant
	public static int Datac = 300; 

	/*
	 * constructor
	 * Constructor is a special method
	 * The name of the constructor and the name of the class will be same
	 * Contructor don't have return type 
	 * Constructor can take parameters
	*/
	public Demo(int datab) {
		/* Assigning value to the global read-only field (this.Datab*/
		this.Datab = datab;
	}

	public static void sayhello() {
		System.out.println("Hello Developer!");
	}
	
	public void greetuser() {
		System.out.println("Greeting User!");
	}
}

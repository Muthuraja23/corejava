package com.chainsys.variables;

/*
 * @author chainsys-
 * @category to test Demoa class,its fields,methods
 * date:mar 24 2022
 */
// Tester class for global variables[]
public class VariableTester {
//Test static, constant, immutable variables	
	public static void testGlobalVariables()
	{
		System.out.println("Dataa: " + Demo.Dataa);
		//display the value of immutable field
		//this is not possible without an object
		//System.out.println("Datab: " + Demo.Datab);
		//display the value of constant field
		System.out.println("Datac: "+ Demo.Datac);
		//modifying value of the static field Dataa
		Demo.Dataa=2345;
		System.out.println("Dataa: " + Demo.Dataa);
		//modifying value of the static Datac
		//<b>ERROR:</b> The final field Demo.Datac cannot be assigned
		//Demo.Datac=2345
	}
public static void testimmutablevariable()
{
	//cannot make a static reference to the non-static field Demo.Datab*/
	//Demo.Datab = 123;
	/***
	 * First create an for class
	 * pass an int value as an arguement to the constructor
	 * access the immutable instance field using the object reference
	 */
	Demo firstobject=new Demo(123);
	System.out.println(firstobject.Datab);
/**
 * value assigned to the immutable field cannot be changed
 * value for the immutable field can be assigned only through the constructor 
 * **/
	//firstobject.Datab=567;	
}
/**
 * calling static method using class name 
 * without creating an object
 * created on : 25 March 2022 
 */
public static void testStaticMethod() {
	Demo.sayhello();
	
}
}

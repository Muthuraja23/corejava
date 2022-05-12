package com.chainsys.trycatch;

import java.util.Scanner;

public class TryCatchExample {

public static void m4()
{
	
System.out.println("Before Try ");
int x=0,y=0,z=0;
String s1=null,s2=null;
java.util.Scanner sc = new java.util.Scanner(System.in);
try {
	sc=new Scanner(System.in);
	System.out.println("Inside Try");
	System.out.println("Enter value for x ");
	s1=sc.nextLine();
	System.out.println("Enter value for y");
	s2=sc.nextLine();
	x=Integer.parseInt(s1);
	y=Integer.parseInt(s2);
	z=x/y;
	System.out.println("Result "+z);
}
/*catch (Exception err)
 * {
 * System.out.println("Inside catch3" + err.getMessage());
 * System.out.println("ErrorType " + err.getClass().getName());
 }*/
catch(ArithmeticException err)
{
	System.out.println("Inside catch 1 "+ err.getMessage());
	System.out.println("ErrorType "+ err.getClass().getName());
}
catch(NumberFormatException err)
{
	System.out.println("Inside catch 2 "+ err.getMessage());
	System.out.println("ErrorType "+ err.getClass().getName());
}
catch(Exception err)
{
	System.out.println("Inside catch 3 "+ err.getMessage());
	System.out.println("ErrorType "+ err.getClass().getName());
}
finally
{
	System.out.println("Inside Finally ");
}
}

}
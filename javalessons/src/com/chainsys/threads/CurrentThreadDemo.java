package com.chainsys.threads;

public class CurrentThreadDemo {
	public static void main(String arg[])
	{
		 try
		 {
		   Thread t1=Thread.currentThread();
		   System.out.println("MainThread ID: " +t1.getId() );
		   Worker w=new Worker();
		   w.callme();
		   System.out.println("In Main After callme");		   
		 }catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }
	}

}

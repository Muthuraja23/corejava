package com.chainsys.trycatch;

public class DemoTrace {
	public static void m1() {
		try {
			m2();
		} catch (Exception err) {
			System.out.println("getMessage " + err.getMessage());
			err.printStackTrace();
			/*
			 * throwable t1 = err.getCuase(); if (null != t1) { Class c1 = te.getClass();
			 * System.out.println("Cuase " + c1.getName());
			 * 
			 * } else System.out.println("Cause is null");
			 */
		} finally {
			System.out.println("Inside m1 Finally");
		}
	}

	public static void m2() {
		m3();
	}

	public static void m3() {
		// m4();
		try {
			m4();
		} catch (Exception e) {
			System.out.println("Inside Catch" + e.getMessage());
			Throwable t1 = e.getCause();
			System.out.println("Cause " + t1.getMessage());
		}
	}

	/*
	 * public static void m4() { int x=0; int y=0; int z=0; x=100; z=x/y;
	 * System.out.println("Result "+z); }
	 */
	public static void m4() // throws Exception
	{
		Exception e1 = new Exception("Error !");
		// Inner Exception
		// e1 is nested inside e2
		Exception e2 = new Exception("Error 2", e1);
		// throw e2;
	}

	public static void testM4()
	{
		m4();
	}
}

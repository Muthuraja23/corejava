package com.chainsys.unittest;
import com.chainsys.variables.Calculator;

public class CalculatorTest {
		public static void testAddMethod() {
		
		Calculator.add(1, 12);
		System.out.println(Calculator.add(1, 12));
			
	}
		public static void testSubtractMethod() {
			Calculator.subtract(9, 7);
			System.out.println(Calculator.subtract(9, 7));
		}
		public static void testMultiplyMethod() {
			Calculator.multiply(2, 4);
			System.out.println(Calculator.multiply(2, 4));		
		}
		public static void testDivideMethod() {
			Calculator.divide(6, 4)	;
			System.out.println(Calculator.divide(6, 4));
		}
}

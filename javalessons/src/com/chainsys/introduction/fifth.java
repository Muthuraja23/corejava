package com.chainsys.introduction;

public class fifth {

	public static void main(String[] args) {
		//printTriangle();
		//printMatrix();
		//printNumbersOnetoTen();
		//printNumbersTentoOne();
		//printTriangleB();
		
		
	}

	public static void printNumbersOnetoTen() {
		int count = 0;
		for (count = 0; count <= 10; count++) {
			System.out.println(count + " ");
		}
	}

	public static void printNumbersTentoOne() {
		int count = 10;
for(count=10;count>=1;count--)
		{
			System.out.println(count + " ");
		}
	}

	// nested for loop
	public static void printMatrix() {
		for (int countA=1;countA<=10;countA++) {
			for (int countB=1;countB<=10;countB++)
			{
				System.out.print(countB+" ");
			}
			System.out.println();
		}
	}

	// nested for loop
	public static void printTriangle() {
		//int countA = 0;
		for (int countA = 1; countA <= 10; countA++) {
			for (int countB = 1; countB <= 10; countA++) {
				System.out.print(countB + " ");
			}
			System.out.println();
		}
	}

	public static void printTriangleB() {
		int countA = 0;
		for (countA = 1; countA <= 10; countA++) {
			for (int countB = 10; countB > countA; countB--) {
				System.out.print(".");
			}
			for (int countC = countA; countC >= 1; countC--) {
				System.out.print(countC);
			}
			System.out.println();
		}
	}

}

package com.chainsys.introduction;

import java.util.Scanner;

public class sixth {

	public static void main(String[] args) {
		//checkusername();
		findEvenNumbers();
	}

	public static void checkusername() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String username = sc.nextLine();
		sc.close();
		System.out.println("Name is " + username);
		char[] nameascharacters = username.toCharArray();
		int lengthofCharArray = nameascharacters.length;
		System.out.println("Length of your name " + lengthofCharArray);
		if (lengthofCharArray < 3) {
			System.out.println("Name must have atleast 3 characters");
		}
		if (lengthofCharArray > 15) {
			System.out.println("Name should not exceed more than 15 characters");
		}
		// ascii value for alphabets is 65 to 90 for upper case
		String nameinuppercase = username.toUpperCase();
		// removes blank space before and after the name
		nameinuppercase = nameinuppercase.trim();
		char[] uppercasechararray = nameinuppercase.toCharArray();
		System.out.println(uppercasechararray);
		lengthofCharArray = uppercasechararray.length;
		int asciiValue = 0;
		for (int index = 0; index < lengthofCharArray; index++) {
			asciiValue = (int) uppercasechararray[index];
			System.out.println("ASCII : " + asciiValue);
			if (asciiValue < 65 || asciiValue > 90) {
				if (asciiValue != 32)
					System.out.println("Invalid Character in Name:");
				return;
			}
		}
	}

	public static void findEvenNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 10 digit numbers");
		long value = sc.nextLong();
		sc.close();
		long num = value;
		long remainder = 0;
		while (num > 0) {
			remainder = num % 10;
			if (remainder % 2 == 0) {
				System.out.println(remainder);
			}
			num/=10;
		}
	}
}

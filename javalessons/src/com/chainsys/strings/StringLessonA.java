package com.chainsys.strings;

public class StringLessonA {
	
	public static void lessonOne() {
		// String is an array of characters
		String firstString = "Chainsys";
		System.out.println(firstString);
		char dataOne[] = { 'C', 'h', 'a', 'i', 'n' };
		String secondString = new String(dataOne);
		System.out.println(secondString);
		String thirdString = new String(new char[] { 'C', 'h', 'a', 'i', 'n' });
		System.out.println(thirdString);
	}

	public static void lessonTwo() {
		String firstString = "Hello";
		String secondString = "Hello";
		String thirdString = "Hello";
		int firstNumber = 100;
		int secondNumber = 100;
		int thirdNumber = 100;

		System.out.println(firstString);
		System.out.println(secondString);
		firstString = "Welocme";
		System.out.println(firstString);
		System.out.println(secondString);
	}

	public static void creatingStringInaForLoop() {
		for (int count = 0; count < 10; count++) {
			String s1 = "Hello";
		}
	}

	public static void stringToCharArray() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter a WORD");
		String firstString = scanner.nextLine();
		scanner.close();
		int stringlength = firstString.length();
		System.out.println("Length " + stringlength);
		char[] data = firstString.toCharArray();
		int dataarraylength = data.length;
		System.out.println("Length " + dataarraylength);
	}

	public static void stringToUpperLower() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter a WORD");
		String firstString = scanner.nextLine();
		scanner.close();
		System.out.println(firstString);
		String stringInUppercase = firstString.toUpperCase();
		System.out.println("toUpperCase=" + stringInUppercase);
		// String in first is not modified,
		System.out.println("s1=" + firstString);
		String stringInLowercase = firstString.toLowerCase();
		System.out.println("toLowerCase=" + stringInLowercase);
		System.out.println("s1=" + firstString);
		// SubString
		// from the 4th char till end
		String substring = firstString.substring(3);
		System.out.println(substring);
		// from 3rd char to 6th char (i.e excluding 7th char)
		// from index 2 to index 5
		substring = firstString.substring(2, 6);
		System.out.println(substring);
		// replace
		String replacedstring = firstString.replace('a', 'e');
		System.out.println(replacedstring);

		// equals
		boolean flag1 = firstString.equals(stringInUppercase);
		System.out.println(flag1);
		// equalsIgnoreCase
		boolean flag = firstString.equalsIgnoreCase(stringInUppercase); // true
		System.out.println(flag);

	}


	public static void testSplit() {
		String firstString = "	Tom and Jerry are good friends	";
		String trimmedString = firstString.trim();
		String[] data = trimmedString.split(" ");
		int count = data.length;
		System.out.println("Word Count " + count);

	}

	public static void testSplitDays() {
		String weekdays = "Mon-Tue-Wed-Thu-Fri-Sat-Sun";
		String[] data = weekdays.split("-");
		int count = data.length;
		System.out.println("Days Count " + count);
		for (int index = 0; index < count; index++) {
			System.out.println(data[index]);
		}
	}

	public static void reverse() {
        java.util.Scanner scanner=new java.util.Scanner(System.in);
        System.out.println("enter a sentence");
        String sentence=scanner.nextLine();
        char[]a=sentence.toCharArray();
        for(int i=a.length-1;i>=0;i--)
        {
                System.out.print(a[i]);
        
          }
	}
	public static void verifyString(String s1)//verify and print
	{
		if (null==s1)
		{
			System.out.println("String is Null");
			return;
		}
		else
			System.out.println("String is not Null " + s1);
		if (!s1.isEmpty())
				System.out.println("\t Not Empty "+s1);
		
		else
			System.out.println("\t String is Empty");
		
		}
}

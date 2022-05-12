package com.chainsys.exam;

public class JavaFirstTest {

	public static void main(String[] args) {
		// fizzBuzz();
		// evenNumber();
		// stringCountandReverse();
		// triangle();
		// armstrongNumber();
		// rainingAndTemperature();
		//checkAlphabets();
		equation();
		
	}

	public static void fizzBuzz() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print("Fizz");
			}
			if (i % 5 == 0) {
				System.out.print("Buzz");
			} else if (i % 3 == 0 && i % 5 == 0) {
				System.out.print("Fizz Buzz");
			}
			System.out.println(i);
		}
	}

	public static void evenNumber() {
		int num = 1546903, remainder, digit;
		while (num > 0) {
			digit = num % 10;
			num /= 10;
			remainder = digit % 2;
			if (remainder == 0) {
				System.out.println(digit);
			}
		}

	}

	public static void stringCountandReverse() {
		String enteredString = "Tom and jerry are good friends";
		System.out.println(enteredString);
		String trimString = enteredString.trim();
		String data[] = trimString.split(" ");
		int count = data.length;
		System.out.println("Number of words in string = " + count);
		char a[] = enteredString.toCharArray();
		System.out.println("Reversed String is:");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i]);

		}
	}

	public static void triangle() {
		int num = 10;
		for (int countA = 1; countA <= num - 1; countA++) {
			for (int countB = 1; countB <= num - countA; countB++) {
				System.out.print(".");
			}
			for (int countC = countA; countC >= 1; countC--) {
				System.out.print(countC);
			}
			for (int countD = 2; countD <= countA; countD++) {
				System.out.print(countD);
			}
			System.out.println();
		}
	}

	public static void armstrongNumber() {
		int number, originalNumber, remainder;
		double finalNumber = 0;
		System.out.println("Enter number");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		number = sc.nextInt();
		originalNumber = number;
		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			finalNumber = finalNumber + Math.pow(remainder, 3);
			originalNumber = originalNumber / 10;
		}
		if (finalNumber == number) {
			System.out.println(number + "\tis an armstrong number");
		} else {
			System.out.println(number + "\tis not an armstrong number");
		}
	}

	public static void rainingAndTemperature() {
		System.out.println("Is it raining");
		System.out.println("1. YES");
		System.out.println("2. NO");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int a = sc.nextInt();
		if (a == 1) {
			System.out.println("Bring UMBRELLA.");
		} else if (a == 2) {
			System.out.println("No need of UMBRELLA.");
		}
		System.out.println("What is the Temperature ? ");
		int temperature = sc.nextInt();
		if (temperature <= 32) {
			System.out.println("Bring heavy jacket.");
		} else if (temperature > 32 && temperature <= 50) {
			System.out.println("Bring light jacket.");
		} else {
			System.out.println("Not at all.");
		}

	}

    public static void checkAlphabets() {
          
            java.util.Scanner sc = new java.util.Scanner(System.in);
                System.out.println("Enter the Name");
                String userName = sc.nextLine();
                sc.close();
                char nameAsCharacters []= userName.toCharArray();
                int lengthofCharArray=nameAsCharacters.length;
                int ref=0;
                
                if(lengthofCharArray <8)
                {
                        System.out.println("Name must have atleast 8 characters!!!");
                }
                else
                {
                String nameInUppercase = userName.toUpperCase();
                nameInUppercase = nameInUppercase.trim();
                char[] uppercaseCharArray=nameInUppercase.toCharArray();
                lengthofCharArray = uppercaseCharArray.length;
                int asciiValue=0;
                for(int index=0;index<lengthofCharArray;index++)
                {
                        asciiValue =(int) uppercaseCharArray[index];
                        
                        if (asciiValue < 65 ||asciiValue >90) {
                                if (asciiValue != 32) {
                                        System.out.println("Invalid Character in Name : ");
                                        ref++;
                                        break;
                                }
                        }
                        
                }
                if(ref==0) {
                        System.out.println("This name contains only alphabets : "+ userName);
                }
                }

        }

    public static void equation() {
    	System.out.print("Enter X value : ");
    	java.util.Scanner sc = new java.util.Scanner(System.in);
    	int x = sc.nextInt();
    	int result = 2*2 + x + 5; 
    	System.out.println("The result is : "+result);
    }

public static void bank() {
	
}


}

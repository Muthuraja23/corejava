package com.chainsys.introduction;

public class exercise {

	public static void main(String[] args) {
		//triangle();
		//evenNumber();
		dia();
		
		
	}

	public static void triangle() {
		int counta = 0;
		for (counta = 1; counta <= 9; counta++) {
			if(counta<6) {
			for (int countb = 5; countb > counta; countb--) {
				System.out.print(" ");
			}
			for (int countc = counta; countc >= 1; countc--) {
				System.out.print(countc);
			}
			for(int countb=2;countb<=counta;countb++) {
				System.out.print(countb);
			}
			}
			else
			{
				for(int count=0;count < counta-5;count++) {
					System.out.print(" ");
				}
				for(int i=10-counta;i>=1;i--) {
					System.out.print(i);
				}
				for(int j=2;j<=10-counta;j++) {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}

	public static void dia() {
	//int n = 5;
	System.out.println("Enter the n value");
	java.util.Scanner sc=new java.util.Scanner(System.in);
	int n=sc.nextInt();	
    for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                    System.out.print(".");
            }
            for (int k = i; k >= 1; k--) {
                    System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                    System.out.print(l);
            }
            System.out.println();
    }
    for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                    System.out.print(".");
            }
            for (int k = i; k >= 1; k--) {
                    System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                    System.out.print(l);
            }
            System.out.println();
    }
}
public static void evenNumber() {
for(int i=0;i<=100;i++)
	if(i%2==0)
	{
		
		System.out.println(i);
	}
		System.out.println();
}
}
package com.chainsys.introduction;

public class seventh {

	public static void main(String[] args) {
		swapNumbers();
			}
public static void swapNumbers() {
	int x=67;
	int y=92;
	System.out.println("x:"+x+"y:"+y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("x:"+x+"y:"+y);
}
}

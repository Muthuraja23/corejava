package com.chainsys.classandmethods;
/**
 * 
 * @author muth3126
 *
 */
public class Car {
	private final String regNo;
	private int YearOfPurchase;
	private String color;
	private String fuel;
	
	public Car(String rno)
	{
		this.regNo=rno;
	}

	public String getRegNo() {
		return regNo;
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getYearOfPurchase() {
		return YearOfPurchase;
	}

	public void setYearOfPurchase(int YearOfPurchase) {
		this.YearOfPurchase = YearOfPurchase;
	}
	
}

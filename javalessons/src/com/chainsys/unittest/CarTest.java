package com.chainsys.unittest;

import com.chainsys.classandmethods.Car;

/**
 * 
 * @author muth3126
 *
 */
public class CarTest {
public static void testCar() {
	Car firstCar=new Car("TN63 A 6363");
	firstCar.setColor("White");
	firstCar.setFuel("Diesel");
	firstCar.setYearOfPurchase(2010);
	System.out.println(firstCar.getRegNo());
	System.out.println(firstCar.getColor());
	System.out.println(firstCar.getFuel());
	System.out.println(firstCar.getYearOfPurchase());
}
}

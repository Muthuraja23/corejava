package com.chainsys.unittest;

import com.chainsys.oops.interfaces.IVehicle;
import com.chainsys.oops.interfaces.VehicleCar;
import com.chainsys.oops.interfaces.VehicleShip;

public class testVehicle {
	{
	IVehicle v1;//=new IVehicle();
	v1=new VehicleCar();
	v1.echo();
	v1.start();
	v1.stop();
	//v1.park();
	// type cast the Object to the Car class
	VehicleCar c1=(VehicleCar)v1;			
	c1.park();
	v1 = new VehicleShip();
	v1.echo();
	v1.start();
	v1.stop();
}

}
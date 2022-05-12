package com.chainsys.finals;

public class Phone {
	public void makeACall()
	{
		System.out.println("Call made...");
	}
	public final void sendSMS()
	{
		System.out.println("SMS send...");
	}
}
class Nokia extends Phone
{
	
	public void makeACall()
{
	System.out.println("Call made from Nokia");
}
	
	//@override
	//public void sendSMS()
	//{
	//System.out,println("SMS send...");
	//}
	
}

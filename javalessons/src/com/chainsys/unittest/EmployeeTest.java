package com.chainsys.unittest;
import com.chainsys.classandmethods.Employee;
public class EmployeeTest {
	public static void testEmpName() {
		Employee fe=new Employee(1234);	
		fe.setName("Muthuraja");
		System.out.println(fe.getName());
	}

	public static void testCity() {
		Employee fe=new Employee(1234);
		fe.setCity("Sivagangai");
		System.out.println(fe.getCity());	
	}
	public static void testSalary() {
		Employee fe=new Employee(1234);
		fe.setSalary(12000);
		System.out.println(fe.getSalary());
	}
	
}

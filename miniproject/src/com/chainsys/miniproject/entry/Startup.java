package com.chainsys.miniproject.entry;

import java.util.Scanner;


import com.chainsys.miniproject.ui.AppointmentUi;
import com.chainsys.miniproject.ui.DoctorUi;
import com.chainsys.miniproject.ui.EmployeeUi;

public class Startup {

	public static void main(String[] args) {
	
			loadMenu();
		}

		private static void loadMenu() {
			System.out.println("Enter Menu : 1.EmployeeMenu, 2.Doctor Menu, 3.Appointment Menu ");
			java.util.Scanner sc = new java.util.Scanner(System.in);
	      try {
			int call = sc.nextInt();
			switch (call) {
	
			case 1:
				loadEmployeeMenu();
				break;
			case 2:
				loadDoctorMenu();
				break;
			case 3:
				loadAppointmentMenu();
				break;
			}
	      }finally {
	    	  sc.close();
	      }
		}

		private static void loadEmployeeMenu() {
			System.out.println("Enter Employee Method :\n 1=addEmployee,\n 2=getEmployeeById ,\n 3=upadateEmployee ,"
					+ " \n 4=updateEmployeeFirstName,\n 5=updateEmployeeSalary,\n 6=deleteEmployee,"
					+ "\n 7=getAllEmployeeDetails");
			java.util.Scanner sc = new java.util.Scanner(System.in);
			try {
			int call = sc.nextInt();
			
			switch (call) {
			case 1:
				EmployeeUi.addNewEmployee();
				break;

			case 2:
				EmployeeUi.getEmployeeById();
				break;
			case 3:
				EmployeeUi.updateEmployee();
				break;
			case 4:
				EmployeeUi.updateEmployeeFirstName();
				break;
			case 5:
				EmployeeUi.updateEmployeeSalary();
				break;
			case 6:
				EmployeeUi.deleteEmployee();
				break;
			case 7:
				EmployeeUi.getAllEmployeesDetails();
				break;
			}
			}finally {
				sc.close();
			}
		}

		private static void loadDoctorMenu() {
			System.out.println(
					"Enter Doctor Method : 1.addNewDoctor() ,2.deleteDoctordetails() ,3.updateDoctorDetails() ,"
					+ " \n 4.updateDoctorName() , 5.updateStandardFees() ,6.ViewAllDoctorDetails() ,"
					+ "\n 7.viewDoctorDetailsById() ");
			java.util.Scanner sc = new java.util.Scanner(System.in);
			try {
			int call = sc.nextInt();
			switch (call) {
			case 1:
				DoctorUi.addNewDoctor();
				break;
			case 2:
				DoctorUi.deleteDoctordetails();
				break;
			case 3:
				DoctorUi.updateDoctorDetails();
				break;
			case 4:
				DoctorUi.updateDoctorName();
				break;
			case 5:
				DoctorUi.updateStandardFees();
				break;
			case 6:
				DoctorUi.ViewAllDoctorDetails();
				break;
			case 7:
				DoctorUi.viewDoctorDetailsById();
				break;
			}
			}finally {
				sc.close();
			}
		}

		private static void loadAppointmentMenu() {
			System.out.println(
					"Enter Method : 1.addNewAppointments() ,2.deleteAppointmentDetails() ,3.updateAppDetails() "
					+ "\n 4.updateCollectedfees() ,5.updatePatientName() ,6.ViewAllAppointmentDetails() "
					+ "\n 7.viewAppointmentDetailsById() ");
			java.util.Scanner sc = new java.util.Scanner(System.in);
			try {
			int call = sc.nextInt();
			switch (call) {
			case 1:
				AppointmentUi.addNewAppointments();
				break;
			case 2:
				AppointmentUi.deleteAppointmentDetails();
				break;
			case 3:
				AppointmentUi.updateAppDetails();
				break;
			case 4:
				AppointmentUi.updateCollectedfees();
				break;
			case 5:
				AppointmentUi.updatePatientName();
				break;
			case 6:
				AppointmentUi.ViewAllAppointmentDetails();
				break;
			case 7:
				AppointmentUi.viewAppointmentDetailsById();
				break;
			}
			}
			finally {
				sc.close();
			}
		}

}	
		
		
		

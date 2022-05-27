package com.chainsys.miniproject.pojo;

import java.util.Date;

public class Doctor {
	private int doctor_id;
	private String doctor_name;
	private Date dob;
	private String speciality;
	private String city;
	private long phone_no;
	private Float standard_fees; 
	
	
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getDoctor_name() {
		return doctor_name;
	}
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	public Float getStandard_fees() {
		return standard_fees;
	}
	public void setStandard_fees(Float std_fees) {
		this.standard_fees = std_fees;
	}


}

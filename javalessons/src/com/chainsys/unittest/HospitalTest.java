package com.chainsys.unittest;

import com.chainsys.introduction.Hospital;

/**
 * 
 * @author muth3126
 *
 */
public class HospitalTest {
public static void testHospital() {
	Hospital patient=new Hospital();
	patient.setsNo(1);
	patient.setName("abc");
	patient.setWardNum(15);
	patient.setDisease("covid19");
    System.out.println("S.no:"+patient.getsNo());
    System.out.println("Name:"+patient.getName());
    System.out.println("Ward no:"+patient.getWardNum());
    System.out.println("Disease:"+patient.getDisease());
	
}
}

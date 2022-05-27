package com.chainsys.miniproject.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Employee;

public class TestEmployeeDao {
public static void  testGetAllEmployees() {
    List<Employee> allEmployees =EmployeeDao.getAllEmployees();
     Iterator<Employee> empIterator=allEmployees.iterator();
     while(empIterator.hasNext())
     {
         Employee emp =empIterator.next();
         System.out.println(emp.getEmp_id()+" "+emp.getFirst_name()+" "+emp.getSalary());
     }
   
}
public static void testEGetmployeeById() {
    Employee emp = new Employee();
    System.out.println(emp.getEmp_id()+" "+emp.getFirst_name()+" "+emp.getSalary());
}
public static void testInsertEmployee()
{
    Employee newemp=new Employee();
    newemp.setEmp_id(300);
    newemp.setFirst_name("Ana");
    newemp.setLast_name("Rose");;
    newemp.setEmail("ana@gmail.com");
    Calendar c1=Calendar.getInstance();
    java.util.Date newDate=c1.getTime();
    newemp.setHire_date(new java.util.Date());
    newemp.setHire_date(newDate);
    newemp.setJob_id("IT_PROG");
    newemp.setSalary(250000);
    int result= EmployeeDao.insertEmployee(newemp);
    System.out.println(result);
}
public static void testUpdateEmployee()
{
    Employee oldemployee=EmployeeDao.getEmployeeById(126);
    System.out.println(oldemployee.getEmp_id() + "" + oldemployee.getFirst_name()+ "" +oldemployee.getSalary());
    oldemployee.setEmp_id(300);
    oldemployee.setFirst_name("Little");
    oldemployee.setLast_name("Joe");;
    oldemployee.setEmail("Little@gmail.com");
    Calendar c1=Calendar.getInstance();
    java.util.Date newDate=c1.getTime();
    oldemployee.setHire_date(new java.util.Date());
    oldemployee.setHire_date(newDate);
    oldemployee.setJob_id("IT_PROG");
    oldemployee.setSalary(250000);
    int result= EmployeeDao.insertEmployee(oldemployee);

    System.out.println(result);

}
public static void testDeleteEmployee()
{
 int result=EmployeeDao.deleteEmployee(126);
System.out.println(result);
}


}
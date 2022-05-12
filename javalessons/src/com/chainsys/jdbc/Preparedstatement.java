package com.chainsys.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Preparedstatement {
	 public static void main(String[] args) throws Exception
	    {
	//	 	create();
	//	 	insert();
	//		update();
	//		view(); 
	//    	delete();
	//	 	drop();
	    }
	 public static void create () throws Exception
	 {
		 try 
		( Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		 // Open a connection
	         Statement stmt = con.createStatement();
	    )  {		      
	          String sql = "CREATE TABLE summa " +
	                   "(id INTEGER not NULL, " +
	                   " Name VARCHAR(255), " + 
	                   "dept VARCHAR(255), " + 
	                   "Mark INTEGER, " + 
	                   " PRIMARY KEY ( id ))"; 

	         stmt.executeUpdate(sql);
	         System.out.println("Created table in given database...");   	  
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	 }
	 public static void insert() throws Exception
	    {
	        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
	        PreparedStatement stmt=con.prepareStatement("insert into summa values(?,?,?,?)");
	        //insert details in console
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));     
	        do
	        {
	        System.out.println("Enter Id:");  
	        int id=Integer.parseInt(br.readLine());  
	        System.out.println("Enter Name:");  
	        String name=br.readLine();  
	       // System.out.println("Enter Age:");  
	        //int age=Integer.parseInt(br.readLine());
	        System.out.println("Enter Dept:");  
	        String dept=br.readLine();
	        System.out.println("Enter Marks:");  
	        int marks=Integer.parseInt(br.readLine());
	        //values sets in table
	        stmt.setInt(1, id);
	        stmt.setString(2, name);
	       // stmt.setInt(3,age);
	        stmt.setString(3,dept);
	        stmt.setInt(4,marks);
	        
	        //checking whether the table is inserted or not
	        int i=stmt.executeUpdate();
	        System.out.println(i+ " Row Inserted");    
	        
	        System.out.println("Do you want to continue: y/n");  
	        String s=br.readLine();  
	        if(s.startsWith("n"))
	        {  
	            break;  
	        }  
	        }while(true); 
	        con.close();
	    }
	    public static void update() throws Exception
	    {
	        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
	        PreparedStatement stmt=con.prepareStatement("update summa set name=? where id=?"); 
	        stmt.setString(2,"Poda");
	        stmt.setInt(1,1004);  
	          
	        int i=stmt.executeUpdate();  
	        System.out.println(i+" Records Updated");  
	    }
	    public static void view() throws Exception
	    {
	        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
	        PreparedStatement stmt=con.prepareStatement("select * from summa");  
	        ResultSet rs=stmt.executeQuery();  
	        while(rs.next())
	        {  
	            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));  
	        }  
	    }
	    public static void delete() throws Exception
	    {
	        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
	        PreparedStatement stmt=con.prepareStatement("delete from College where id=?");  
	        stmt.setInt(1,1234);  
	          
	        int i=stmt.executeUpdate();  
	        System.out.println(i+" records deleted");  
	    }
	 public static void drop() throws Exception
	 {
		 // Open a connection
	      try( 
	    		  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
	         Statement stmt = con.createStatement();
	      ) {		      
	         String sql = "DROP TABLE summa";
	         stmt.executeUpdate(sql);
	         System.out.println("Table deleted in given database...");   	  
	      } catch (SQLException e)
	      {
	         e.printStackTrace();
	      }
	 }
	   
	 
	 
}
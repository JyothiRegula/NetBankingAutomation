package com.FilloConcept;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

//how to read excel data using SELECT Query with WHERE Condition - Fillo Excel API

public class ReadDataUsingWhere {
	
	@Test	
	public void run() throws Throwable{
			
			Fillo fillo = new Fillo();
			Connection connection =  fillo.getConnection(".\\src\\test\\resources\\DataDriven\\New Microsoft Excel Worksheet.xlsx");
			
			
			//using single where condition
			 
			/*  String strQuery ="Select * from Sheet1 where Fname ='jyothi'";
			 * // rs is a class fetching data from excel
			Recordset rs = connection.executeQuery(strQuery); // it hold entire data from sheet1
			
			 * 
			 */
			 
			// OR
			 
			// rs is a class fetching data from excel
		Recordset rs = connection.executeQuery("Select * from Sheet1").where("Fname = 'Sridhar'");   // it hold entire data from sheet1
			
			 
			// Print total excel data
			while(rs.next())
			{
				System.out.println(rs.getField("Fname") +"-------" +rs.getField("Lname"));	 
				
			}
			
			System.out.println("***************");
			
			// if i use single where condition and two users have same name menas it executes both
			String strQuery = "Select * from Sheet1 where Fname ='jyothi'";
			rs = connection.executeQuery(strQuery);
			
			while(rs.next()) {
				
				System.out.println(rs.getField("Fname") +"---------" +rs.getField("Lname"));
				
			}
			
			System.out.println("$$$$$$$$$");
			
		//When users have same name and differs surname that time we use multiple where condition and it will give particular
			
			/*
			 * String strsQuery1 = "select * from Sheet1 where Fname = 'ShivakritikSai' and Lname = 'regula'";
			 * rs = connection.executeQuery(strQuery1);
			 * 
			 */
			
			// OR
			
			rs = connection.executeQuery("Select * from Sheet1").where("Fname = 'ShivakritikSai'").where("Lname = 'regula'");
			while(rs.next()) {
				
				System.out.println(rs.getField("Fname") + "------" + rs.getField("Lname"));
			}
			
			
			
		
		 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

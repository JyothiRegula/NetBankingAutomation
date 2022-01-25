package com.FilloConcept;
import java.util.ArrayList;

import org.testng.annotations.Test;


import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Lavanish {
	
	@Test	
	public void run() throws Throwable{
			
			Fillo fillo = new Fillo();
			Connection connection =  fillo.getConnection(".\\src\\test\\resources\\DataDriven\\New Microsoft Excel Worksheet.xlsx");
			
			
			//using single where condition
			 
			/*  String strQuery ="Select * from Sheet1 where Fname ='jyothi'"
			 * 
			 * 
			 */
			// table name ---UserData
			String strQuery = "Select * from Sheet1 ";
			// rs is a class fetching data from excel
			Recordset rs = connection.executeQuery(strQuery); // it hold entire data from sheet1
			
			ArrayList<Object> data = new ArrayList<Object>();
			
			// Print total excel data
			while(rs.next())
			{
				System.out.println(rs.getField("Fname") +"-------" +rs.getField("Lname"));
				data.add(rs.getField("Lname"));
				
			}
			
			// Print Read data from List
			System.out.println("Fname lname from list :" +data.get(0));
			System.out.println("Fname lname from list :" +data.get(1));
			
			
			
			rs.close();
			connection.close();
			
			
			
		  }

}

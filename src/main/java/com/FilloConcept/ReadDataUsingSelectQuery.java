package com.FilloConcept;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ReadDataUsingSelectQuery {
	
	@Test	
	public void run() throws Throwable{
			
			Fillo fillo = new Fillo();
			Connection connection =  fillo.
					getConnection(".\\src\\test\\resources\\DataDriven\\New Microsoft Excel Worksheet.xlsx");
			String strQuery = "Select * from Sheet1 ";
			Recordset rs = connection.executeQuery(strQuery);  
			
			// using java collection framework ---- Java Gernerics
			//List<String> data = new ArrayList<String>(); ----List
			
			// print total excel data
			 while(rs.next()) {
				 System.out.println(rs.getField("Fname")+"------"+rs.getField("Lname")+"-----"+rs.getField("Place") + "-----" +rs.getField("ID"));
				 //data.add(rs.getField("Place"));  ----List
			 }
			 
			 // print and reading a particular data from list
			// System.out.println("Fname    Lname from the list :"+data.get(0)); ----List
			// System.out.println("Fname    Lname from the list :"+data.get(1));  ----List
			// System.out.println("Fname    Lname from the list :"+data.get(2));  ----List
			 
			 System.out.println();
			 // total rows in excel sheet
			 System.out.println("Total rows in excel sheet:  " +rs.getCount());
			 
			 System.out.println();
			 // total columns in sheet
			 int totalCols = rs.getFieldNames().size();
			 System.out.println("Total cols in excel sheet:  " +totalCols);
			 
			 System.out.println();
			 // Get last row data
			 rs.moveLast();
			 System.out.println("get last row data");
			 System.out.println(rs.getField("Fname") +"-----" +rs.getField("ID"));
			 
			 System.out.println();
			 System.out.println("Before previous data");
			 
			 // Get previous Row data
			 rs.movePrevious();
			 System.out.println(rs.getField("Fname")+"------"+rs.getField("ID"));
			 
			 System.out.println();
			 
			 //Get first row data
			 rs.moveFirst();
			 System.out.println(rs.getField("Fname")+"------"+rs.getField("ID"));
			 
			 System.out.println();
			 
			 // Get next row data
			 rs.moveNext();
			 System.out.println(rs.getField("Fname")+"------"+rs.getField("ID"));
			 
			 // Get first column name 
			 
			 String colName = rs.getFieldNames().get(3);
			 System.out.println("Column Name : " +colName);
			 System.out.println(rs.getField(colName));
			 
	}		

}

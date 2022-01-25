package com.FilloConcept;

import org.testng.annotations.Test;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

public class DeleteDataFromExcel {
	
	// how to write delete data from excel using DELETE Query --Fillo Excel API
	
			@Test	
			public void run() throws Throwable{
					
					Fillo fillo = new Fillo();
					Connection connection =  fillo.getConnection(".\\src\\test\\resources\\DataDriven\\New Microsoft Excel Worksheet.xlsx");
					
				/*	// Delete single data
					String strQuery = "Delete from Sheet2 where Fname = 'jyothi'";
					connection.executeUpdate(strQuery);
					connection.close(); 
					*/
					
					// Delete entire excel sheet2  data 
					String strQuery = "Delete from Sheet2";
					connection.executeUpdate(strQuery);
					connection.close(); 
					
					
					
					
					
			}
}

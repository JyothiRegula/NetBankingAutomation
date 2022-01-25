package com.FilloConcept;

import org.testng.annotations.Test;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

public class InsertDataIntoExcel {
	
	// how to write data in excel using INSERT Query --Fillo Excel API
	
	@Test	
	public void run() throws Throwable{
			
			Fillo fillo = new Fillo();
			Connection connection =  fillo.getConnection(".\\src\\test\\resources\\DataDriven\\New Microsoft Excel Worksheet.xlsx");
			String strQuery = "INSERT INTO Sheet1(Fname,Lname,Place,ID) VALUES('Lavanish','sathi','Mallial','204')";
			connection.executeUpdate(strQuery);
			connection.close();
	}
}
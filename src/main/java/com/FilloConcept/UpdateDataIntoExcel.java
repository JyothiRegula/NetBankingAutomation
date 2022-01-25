package com.FilloConcept;

import org.testng.annotations.Test;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

public class UpdateDataIntoExcel {
	
	// how to write updata data in excel using UPDATE Query --Fillo Excel API
	
		@Test	
		public void run() throws Throwable{
				
				Fillo fillo = new Fillo();
				Connection connection =  fillo.getConnection(".\\src\\test\\resources\\DataDriven\\New Microsoft Excel Worksheet.xlsx");
				String strQuery = "Update sheet1 set Place = 'Singapore' where Fname = 'jyothi'";
				connection.executeUpdate(strQuery);
				connection.close();
		}

}

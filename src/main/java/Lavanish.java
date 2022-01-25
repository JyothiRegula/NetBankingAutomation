import org.testng.annotations.Test;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Lavanish {
	
	@Test	
	public void run() throws Throwable{
			
			Fillo fillo = new Fillo();
			Connection connection =  fillo.getConnection(".\\src\\test\\resources\\DataDriven\\New Microsoft Excel Worksheet.xlsx");
			
			// table name ---UserData
			String strQuery = "Select * from Sheet1";
			// rs is a class fetching data from excel
			Recordset rs = connection.executeQuery(strQuery);
			
			while(rs.next())
			{
				System.out.println(rs.getField("Fname"));
				
			}
			
			rs.close();
			connection.close();
			
			
			
		  }

}

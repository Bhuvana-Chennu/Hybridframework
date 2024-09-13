package Utility;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class Data_Providers {
	//Data provider1
	@DataProvider(name ="LoginData")
	public String[][] getData() throws IOException{
		String path =".\\testdata\\login.xlsx";
		ExcelUtility xlutiliy = new ExcelUtility(path);
		
		int totalrows = xlutiliy.getRowCount("Sheet1");
		int totalcol = xlutiliy.getCellCount("Sheet1", 1);
		String[][] logindata = new String[totalrows][totalcol];
		
		for(int i=1;i<totalrows;i++)
		{
			for(int j=0;j<totalcol;j++)
			{
				logindata[i-1][j] = xlutiliy.getCellData("Sheet1", i, j);
			}
		}
		
		return logindata;
		
	}
	
	//Data provider2
	

}

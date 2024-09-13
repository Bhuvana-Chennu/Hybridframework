package Day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_data_excel {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Test_Data\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		//XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFSheet sheet = workbook.getSheetAt(0);
		int total_rows = sheet.getLastRowNum();
		int total_cells = sheet.getRow(1).getLastCellNum();
		System.out.println("Total no of rows:"+total_rows);
		System.out.println("Total no of cells:"+total_cells);
		for(int r=0;r<=total_rows;r++) {
			XSSFRow currentrow = sheet.getRow(r);
			for(int c=0;c<total_cells;c++) {
				XSSFCell cell = currentrow.getCell(c);
				System.out.print(cell.toString()+"\t");
				
			}
			System.out.println();
		}
		workbook.close();
		file.close();
		
		
	}

}

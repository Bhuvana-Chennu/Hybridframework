package Day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writting_data_Excek {

	public static void main(String[] args) throws IOException  {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\Test_Data\\myfile.xlxs");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Data");
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("java");
		row1.createCell(1).setCellValue(19);
		row1.createCell(2).setCellValue("automatiom");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("Python");
		row2.createCell(1).setCellValue(1);
		row2.createCell(2).setCellValue("automation");
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		
	}

}

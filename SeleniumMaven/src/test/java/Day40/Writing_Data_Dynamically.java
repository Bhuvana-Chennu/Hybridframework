package Day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_Data_Dynamically {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\Test_Data\\myfile_1.xlxs");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("DynamicData");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int no_of_rows = sc.nextInt();
		System.out.println("Enter no of cells:");
		int no_of_cells = sc.nextInt();
		for(int r=0;r<=no_of_rows;r++) {
			XSSFRow curr_row = sheet.createRow(r);
			for(int c=0;c<no_of_cells;c++) {
				curr_row.createCell(c).setCellValue(sc.next()  );
				
			}
			
		}
		workbook.write(file);
		workbook.close();
		file.close();	
		System.out.println("File created sucessfully");
	}

}

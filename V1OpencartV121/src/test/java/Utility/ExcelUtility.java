package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;
	String path;

	public ExcelUtility(String path) {
		this.path = path;
		
	}
	
	public int getRowCount(String SheetName) throws IOException
	{
		fi = new FileInputStream(path);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(SheetName);
		int rowcount = ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
		
	}
	
	public int getCellCount(String Sheetname,int rownum) throws IOException
	{
		fi = new FileInputStream(path);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(Sheetname);
		row = ws.getRow(rownum);
		int cellcount = row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
		
	}
	
	public String getCellData(String Sheetname, int rownum, int colnum) throws IOException
	{
		fi = new FileInputStream(path);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(Sheetname);
		row = ws.getRow(rownum);
		cell = row.getCell(colnum);	
		
		DataFormatter format = new DataFormatter();
		String data;
		try
		{
			data = format.formatCellValue(cell);
		}
		catch(Exception e)
		{
			data = " ";
		}
		wb.close();
		fi.close();
		return data;
		
		
	}
	
	public void setCellData(String sheetName,int rownum, int colnum,String data) throws IOException
	{
		File xlfile = new File(path);
		if(!xlfile.exists())   // If file not exists create a new file
		{
		wb = new XSSFWorkbook();
		fo = new FileOutputStream(path);
		wb.write(fo);
		
		
		}
		fi = new FileInputStream(path);
		wb = new XSSFWorkbook(fi);
		
		if(wb.getSheetIndex(sheetName)==-1)
		
			wb.createSheet(sheetName);
			ws = wb.getSheet(sheetName);
			
			
		if(ws.getRow(rownum)==null)
			ws.createRow(rownum);
		row= ws.getRow(rownum);
		
		cell = row.createCell(colnum);
		cell.setCellValue(data);
		fo = new FileOutputStream(path);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
	}
	
	public  void fillgreencolour(String xlfile,String xlsheet,int rownum,int column,String data) throws IOException {
		fi = new FileInputStream(xlfile);
		wb= new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		cell = row.getCell(column);
		style = wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cell.setCellStyle(style);
		fo = new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
		
		
	}
	public  void fillredcolour(String xlfile,String xlsheet,int rownum,int column,String data) throws IOException {
		fi = new FileInputStream(xlfile);
		wb= new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		cell = row.getCell(column);
		style = wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cell.setCellStyle(style);
		fo = new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
		
		
	}
	
}

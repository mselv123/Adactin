package com.base_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.net.FixedIANAPortRange;

public class ReadData {	
	public static void particularData() throws IOException {
		
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\Maven\\Excel\\ExcelData.xlsx");
		FileInputStream fis = new FileInputStream(f);		
	     Workbook wb = new XSSFWorkbook(fis);
	     Sheet sheetAt = wb.getSheetAt(0);
	     Row row = sheetAt.getRow(2);
	     Cell cell = row.getCell(1);     	     
	     double numericCellValue = cell.getNumericCellValue();
	     System.out.println(numericCellValue);
	     
        //(or) String stringCellValue = cell.getStringCellValue();  //
	    // System.out.println(stringCellValue); //

	}
	
	public static void AllData() throws IOException {
		
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\Maven\\Excel\\ExcelData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);	
		Sheet sheetAt = wb.getSheetAt(0);
		
		int RowSize = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < RowSize; i++) {
		Row row = sheetAt.getRow(i);
		int Cellsize = row.getPhysicalNumberOfCells();
		for (int j = 0; j < Cellsize; j++) {
	    Cell cell = row.getCell(j);
	    
			
		}
					
	}
			
		}
	public static void main(String[] args) throws IOException {
		particularData();
	}
}
package com.base_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	
public static void writedata() throws IOException {
		
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\Maven\\Excel\\excelproject.xlsx");
		FileInputStream fis = new FileInputStream(f);		
	     Workbook wb = new XSSFWorkbook(fis);
	     Sheet createSheet = wb.createSheet("SheetData");
	     Row createRow = createSheet.createRow(0);
	     Cell createCell = createRow.createCell(0);
	     createCell.setCellValue("Username");
	     wb.getSheet("SheetData").getRow(0);
	   
	     
	     
	     FileOutputStream fos =new FileOutputStream(f);
	     wb.write(fos);
	     System.out.println("sheet created");
	     
}
public static void main(String[] args) throws IOException {
	writedata();
	
}
}
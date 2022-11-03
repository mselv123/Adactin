package com.base_class;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	public static void main(String[] args) throws IOException {
	//Syntax	
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\Maven\\Excel\\excelproject.xlsx");
		
	//syntax for creating workbook
		Workbook  w = new XSSFWorkbook();
		System.out.println(w);
		
   //syntax for creating sheet
	  Sheet s= w.createSheet("StudentData");
	  
	//syntax for creating row and column
	  
	 Row r = s.createRow(0);
	 Cell c = r.createCell(0);
	 c.setCellValue("Name");
	 
	 FileOutputStream fo = new FileOutputStream(f);
	 
	 //To write in workbook
	 
	 w.write(fo);
	 
	 
	}

}

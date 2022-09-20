package com.UtilityClass;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLReader {
	
	public String XlinputData(String sheetno,int i, int j) throws IOException {
	FileInputStream file = new FileInputStream("C:\\Users\\Sai\\eclipse-workspace\\Ecommercedemo2\\XmlSuite\\inputData.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet(sheetno);
	XSSFRow row = sheet.getRow(i);
	XSSFCell cell = row.getCell(j);
	String inp = cell.toString();
	return inp;
	}
}

package com.excelreader;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetCellValue {
	   static XSSFSheet sheet;
	
	public static void setExcelFile(String path,String sheetname) throws IOException {
		
		if (path == null || sheetname == null) {
	        throw new IOException("Path and sheet name cannot be null.");
	    }
	    try (FileInputStream fis = new FileInputStream(path)) {
	        XSSFWorkbook wbook = new XSSFWorkbook(fis);
	        sheet = wbook.getSheet(sheetname);
	    }
	}
	public static String getData(int rowNo,String coloumnName) {
	
		XSSFRow row=sheet.getRow(0);
		XSSFCell cell=null;
		int coloumnnum=-1;
		try {
		for(int i=0;i<row.getLastCellNum();i++) {
			if(row.getCell(i).getStringCellValue().toString().trim().equals(coloumnName)) {
				coloumnnum=i;
			
			}
		}
				
		}catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("entered coloumn name is not avilable in excel data file");
		}
		String value=sheet.getRow(rowNo).getCell(coloumnnum).getStringCellValue().toString().trim();
		return value;
		}
	
	

	public static void main(String[] args) throws IOException {
		
		
		String filePath=System.getProperty("user.dir")+"\\TestData\\data.xlsx";
		setExcelFile(filePath,"Sheet1");
		String returnValue=getData(2,"test data");
		System.out.println(returnValue);
		
	}

}

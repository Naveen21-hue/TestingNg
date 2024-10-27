package com.excelreader;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	
	public static String getDataFromColm(int row,int coloumn) throws IOException {
		
		String CellData;
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\data.xlsx");
		XSSFWorkbook wbname=new XSSFWorkbook(fis);
		XSSFSheet sheetname=wbname.getSheet("Sheet1");
		System.out.println(sheetname.getLastRowNum());
		System.out.println(sheetname.getRow(1).getLastCellNum());
		
		try {
			XSSFCell cell=sheetname.getRow(row).getCell(coloumn);
			CellData=cell.getStringCellValue().toString().trim();
		}catch(NullPointerException e) {
			return "";
			
		}
		return CellData;
	}
		
		
		
		public static void main(String[]args)throws IOException {
			System.out.println( getDataFromColm(1,0));
		}
		
		
	
	
	

}

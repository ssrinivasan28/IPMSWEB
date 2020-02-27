package com.islandpacific.testdata;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InputDefineGTIN {
	public static String DefineGTIN = System.getProperty("user.dir")+"/test-input/Input_DefineGTIN.xlsx";
	public static String GTINCode() throws Exception
	//String DefDistrictpath =  "C:\\Test Data\\Constant_Definations\\DefineDistrict.xlsx";

	
	{
		File ScrUser = new  File(DefineGTIN);
		FileInputStream fis = new FileInputStream(ScrUser);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int GTINCodes= (int)wb.getSheetAt(0).getRow(1).getCell(1).getNumericCellValue();
		String GTINCode = String.valueOf(GTINCodes);
		return GTINCode;
		
		
	}
	
	public static String GTINName() throws Exception


	{
		File ScrUser = new  File(DefineGTIN);
		FileInputStream fis = new FileInputStream(ScrUser);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String GTINName = sheet1.getRow(2).getCell(1).getStringCellValue();
		return GTINName;	
	}

}

package com.islandpacific.testdata;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InputDefineDistrict

{
	//public static String DefDistrictpath =  "C:\\Automation\\Test Data\\Constant_Definations\\4_DefineDistrict.xlsx";
	public static String DefDistrictpath =  System.getProperty("user.dir")+"/test-input/Input_DefineDistrict.xlsx";
	
	public static String Districtcode() throws Exception
	//String DefDistrictpath =  "C:\\Test Data\\Constant_Definations\\DefineDistrict.xlsx";

	
	{
		File ScrUser = new  File(DefDistrictpath);
		FileInputStream fis = new FileInputStream(ScrUser);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int DistrictCodes= (int)wb.getSheetAt(0).getRow(1).getCell(1).getNumericCellValue();
		String DistCode = String.valueOf(DistrictCodes);
		return DistCode;
		
		
	}

public static String DistrictName() throws Exception


{
	File ScrUser = new  File(DefDistrictpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String DistrictName = sheet1.getRow(2).getCell(1).getStringCellValue();
	return DistrictName;	
}


public static String DistrictLinkToRegion() throws Exception


{
	File ScrUser = new  File(DefDistrictpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
    int LinkDistToReg= (int)wb.getSheetAt(0).getRow(3).getCell(1).getNumericCellValue();
	String LinkDistToRegion = String.valueOf(LinkDistToReg);
	
	return LinkDistToRegion;	
}


public static String DistrictManager() throws Exception


{
	File ScrUser = new  File(DefDistrictpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String DistrictManager = sheet1.getRow(4).getCell(1).getStringCellValue();
	return DistrictManager;
}

public static String DistrictTelephone() throws Exception


{
	File ScrUser = new  File(DefDistrictpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	int DistrictTelephone= (int)wb.getSheetAt(0).getRow(5).getCell(1).getNumericCellValue();
	String DistTel = String.valueOf(DistrictTelephone);
	return DistTel;
}

public static String DistrictAddressOne() throws Exception


{
	File ScrUser = new  File(DefDistrictpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String DistrictAddressOne = sheet1.getRow(6).getCell(1).getStringCellValue();
	return DistrictAddressOne;	
}


public static String DistrictAddressTwo() throws Exception


{
	File ScrUser = new  File(DefDistrictpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String DistrictAddressTwo = sheet1.getRow(7).getCell(1).getStringCellValue();
	return DistrictAddressTwo;	
}


public static String DistrictCity() throws Exception


{
	File ScrUser = new  File(DefDistrictpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String DistrictCity = sheet1.getRow(8).getCell(1).getStringCellValue();
	return DistrictCity;	
}

public static String DistrictState() throws Exception


{
	File ScrUser = new  File(DefDistrictpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String DistrictState = sheet1.getRow(9).getCell(1).getStringCellValue();
	return DistrictState;	
}

public static String DistrictPostalCode() throws Exception


{
	File ScrUser = new  File(DefDistrictpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	int DistrictPostalCode= (int)wb.getSheetAt(0).getRow(10).getCell(1).getNumericCellValue();
	String DistPostCode = String.valueOf(DistrictPostalCode);
	return DistPostCode;
	
}

public static String DistrictContry() throws Exception


{
	File ScrUser = new  File(DefDistrictpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String DistrictContry = sheet1.getRow(11).getCell(1).getStringCellValue();
	return DistrictContry;	
}

public static String DistrictStatus() throws Exception

{
	File ScrUser = new  File(DefDistrictpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String DistrictStatus = sheet1.getRow(12).getCell(1).getStringCellValue();
	return DistrictStatus;	
}


	

}

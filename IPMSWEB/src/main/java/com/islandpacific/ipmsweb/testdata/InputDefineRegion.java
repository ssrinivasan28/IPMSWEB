package com.islandpacific.ipmsweb.testdata;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InputDefineRegion {
	//public static String DefRegionpath =  "C:\\Automation\\Test Data\\Constant_Definations\\3_DefineRegion.xlsx";
	
	public static String DefRegionpath =  System.getProperty("user.dir")+"/test-input/Input_DefineRegion.xlsx";
	public static String Regioncode() throws Exception

	
	{
		File ScrUser = new  File(DefRegionpath);
		FileInputStream fis = new FileInputStream(ScrUser);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int RegionCodes= (int)wb.getSheetAt(0).getRow(1).getCell(1).getNumericCellValue();
		String RegCode = String.valueOf(RegionCodes);
		return RegCode;
		
		
	}

public static String RegionName() throws Exception


{
	File ScrUser = new  File(DefRegionpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String RegionName = sheet1.getRow(2).getCell(1).getStringCellValue();
	return RegionName;	
}


public static String RegionLinkToTerritory() throws Exception


{
	File ScrUser = new  File(DefRegionpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
    int LinkRegToTerr= (int)wb.getSheetAt(0).getRow(3).getCell(1).getNumericCellValue();
	String LinkRegToTerri = String.valueOf(LinkRegToTerr);
	
	return LinkRegToTerri;	
}


public static String RegionManager() throws Exception


{
	File ScrUser = new  File(DefRegionpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String RegionManager = sheet1.getRow(4).getCell(1).getStringCellValue();
	return RegionManager;	
}

public static String RegionTelephone() throws Exception


{
	File ScrUser = new  File(DefRegionpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	int RegionTelephone= (int)wb.getSheetAt(0).getRow(5).getCell(1).getNumericCellValue();
	String RegTel = String.valueOf(RegionTelephone);
	return RegTel;
}

public static String RegionAddressOne() throws Exception


{
	File ScrUser = new  File(DefRegionpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String RegionAddressOne = sheet1.getRow(6).getCell(1).getStringCellValue();
	return RegionAddressOne;	
}


public static String RegionAddressTwo() throws Exception


{
	File ScrUser = new  File(DefRegionpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String RegionAddressTwo = sheet1.getRow(7).getCell(1).getStringCellValue();
	return RegionAddressTwo;	
}


public static String RegionCity() throws Exception


{
	File ScrUser = new  File(DefRegionpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String RegionCity = sheet1.getRow(8).getCell(1).getStringCellValue();
	return RegionCity;	
}

public static String RegionState() throws Exception


{
	File ScrUser = new  File(DefRegionpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String RegionState = sheet1.getRow(9).getCell(1).getStringCellValue();
	return RegionState;	
}

public static String RegionPostalCode() throws Exception


{
	File ScrUser = new  File(DefRegionpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	int RegionPostalCode= (int)wb.getSheetAt(0).getRow(10).getCell(1).getNumericCellValue();
	String RegPostCode = String.valueOf(RegionPostalCode);
	return RegPostCode;
	
}

public static String RegionContry() throws Exception


{
	File ScrUser = new  File(DefRegionpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String RegionContry = sheet1.getRow(11).getCell(1).getStringCellValue();
	return RegionContry;	
}

public static String RegionStatus() throws Exception

{
	File ScrUser = new  File(DefRegionpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String RegionStatus = sheet1.getRow(12).getCell(1).getStringCellValue();
	return RegionStatus;	
}
}
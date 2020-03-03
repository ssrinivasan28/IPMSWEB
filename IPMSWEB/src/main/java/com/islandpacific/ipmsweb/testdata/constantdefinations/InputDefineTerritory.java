package com.islandpacific.ipmsweb.testdata.constantdefinations;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InputDefineTerritory {
	
	//public static String DefTerrpath =  "C:\\Automation\\Test Data\\Constant_Definations\\2_DefineTerritory.xlsx";
	public static String DefTerrpath =  System.getProperty("user.dir")+"/test-input/Input_DefineTerritory.xlsx";
	public static String Territorycode() throws Exception
	{
		File ScrUser = new  File(DefTerrpath);
		FileInputStream fis = new FileInputStream(ScrUser);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int TerritoryCodes= (int)wb.getSheetAt(0).getRow(1).getCell(1).getNumericCellValue();
		String TerCode = String.valueOf(TerritoryCodes);
		return TerCode;
		
		
	}

public static String TerritoryName() throws Exception


{
	File ScrUser = new  File(DefTerrpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String TerritoryName = sheet1.getRow(2).getCell(1).getStringCellValue();
	return TerritoryName;	
}


public static String TerritoryLinkToZone() throws Exception


{
	File ScrUser = new  File(DefTerrpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
    int LinkTerToZones= (int)wb.getSheetAt(0).getRow(3).getCell(1).getNumericCellValue();
	String LinkTerToZone = String.valueOf(LinkTerToZones);
	
	return LinkTerToZone;	
}


public static String TerritoryManager() throws Exception


{
	File ScrUser = new  File(DefTerrpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String TerritoryManager = sheet1.getRow(4).getCell(1).getStringCellValue();
	return TerritoryManager;	
}

public static String TerritoryTelephone() throws Exception


{
	File ScrUser = new  File(DefTerrpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	int TerritoryTelephone= (int)wb.getSheetAt(0).getRow(5).getCell(1).getNumericCellValue();
	String TerTel = String.valueOf(TerritoryTelephone);
	return TerTel;
}

public static String TerritoryAddressOne() throws Exception


{
	File ScrUser = new  File(DefTerrpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String TerritoryAddressOne = sheet1.getRow(6).getCell(1).getStringCellValue();
	return TerritoryAddressOne;	
}


public static String TerritoryAddressTwo() throws Exception


{
	File ScrUser = new  File(DefTerrpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String TerritoryAddressTwo = sheet1.getRow(7).getCell(1).getStringCellValue();
	return TerritoryAddressTwo;	
}


public static String TerritoryCity() throws Exception


{
	File ScrUser = new  File(DefTerrpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String TerritoryCity = sheet1.getRow(8).getCell(1).getStringCellValue();
	return TerritoryCity;	
}

public static String TerritoryState() throws Exception


{
	File ScrUser = new  File(DefTerrpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String TerritoryState = sheet1.getRow(9).getCell(1).getStringCellValue();
	return TerritoryState;	
}

public static String TerritoryPostalCode() throws Exception


{
	File ScrUser = new  File(DefTerrpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	int TerritoryPostalCode= (int)wb.getSheetAt(0).getRow(10).getCell(1).getNumericCellValue();
	String TerPostCode = String.valueOf(TerritoryPostalCode);
	return TerPostCode;
	
}

public static String TerritoryContry() throws Exception


{
	File ScrUser = new  File(DefTerrpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String TerritoryContry = sheet1.getRow(11).getCell(1).getStringCellValue();
	return TerritoryContry;	
}

public static String TerritoryStatus() throws Exception

{
	File ScrUser = new  File(DefTerrpath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String TerritoryStatus = sheet1.getRow(12).getCell(1).getStringCellValue();
	return TerritoryStatus;	
}

















	

}

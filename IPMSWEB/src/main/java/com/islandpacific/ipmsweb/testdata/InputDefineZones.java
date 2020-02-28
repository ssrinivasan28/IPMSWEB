package com.islandpacific.ipmsweb.testdata;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InputDefineZones {
//	public static String DefZonePath =  "C:\\Automation\\Test Data\\Constant_Definations\\1_DefineZones.xlsx";

	public static String DefZonePath =   System.getProperty("user.dir")+"/test-input/Input_DefineZones.xlsx";
	public static String Zonecode() throws Exception

	
	{
		File ScrUser = new  File(DefZonePath);
		FileInputStream fis = new FileInputStream(ScrUser);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int ZoneCodes= (int)wb.getSheetAt(0).getRow(1).getCell(1).getNumericCellValue();
		String ZnCode = String.valueOf(ZoneCodes);
		return ZnCode;
		
		
	}

public static String ZoneName() throws Exception


{
	File ScrUser = new  File(DefZonePath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String ZoneName = sheet1.getRow(2).getCell(1).getStringCellValue();
	return ZoneName;	
}


public static String ZoneManager() throws Exception


{
	File ScrUser = new  File(DefZonePath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String ZoneManager = sheet1.getRow(3).getCell(1).getStringCellValue();
	return ZoneManager;	
}

public static String ZoneTelephone() throws Exception


{
	File ScrUser = new  File(DefZonePath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	int ZoneTelephone= (int)wb.getSheetAt(0).getRow(4).getCell(1).getNumericCellValue();
	String ZnTel = String.valueOf(ZoneTelephone);
	return ZnTel;
}

public static String ZoneAddressOne() throws Exception


{
	File ScrUser = new  File(DefZonePath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String ZoneAddressOne = sheet1.getRow(5).getCell(1).getStringCellValue();
	return ZoneAddressOne;	
}


public static String ZoneAddressTwo() throws Exception


{
	File ScrUser = new  File(DefZonePath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String ZoneAddressTwo = sheet1.getRow(6).getCell(1).getStringCellValue();
	return ZoneAddressTwo;	
}


public static String ZoneCity() throws Exception


{
	File ScrUser = new  File(DefZonePath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String ZoneCity = sheet1.getRow(7).getCell(1).getStringCellValue();
	return ZoneCity;	
}

public static String ZoneState() throws Exception


{
	File ScrUser = new  File(DefZonePath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String ZoneState = sheet1.getRow(8).getCell(1).getStringCellValue();
	return ZoneState;	
}

public static String ZonePostalCode() throws Exception


{
	File ScrUser = new  File(DefZonePath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	int ZonePostalCode= (int)wb.getSheetAt(0).getRow(9).getCell(1).getNumericCellValue();
	String ZnPostCode = String.valueOf(ZonePostalCode);
	return ZnPostCode;
	
}

public static String ZoneContry() throws Exception


{
	File ScrUser = new  File(DefZonePath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String ZoneContry = sheet1.getRow(10).getCell(1).getStringCellValue();
	return ZoneContry;	
}

public static String ZoneStatus() throws Exception

{
	File ScrUser = new  File(DefZonePath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	String ZoneStatus = sheet1.getRow(11).getCell(1).getStringCellValue();
	return ZoneStatus;	
}

public static String ZoneFinCompany() throws Exception


{
	File ScrUser = new  File(DefZonePath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	int ZoneFinCompany= (int)wb.getSheetAt(0).getRow(12).getCell(1).getNumericCellValue();
	String ZnFin = String.valueOf(ZoneFinCompany);
	return ZnFin;
	
}















	

}

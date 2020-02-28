package com.islandpacific.ipmsweb.testdata;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InputLogin {
	
	public static String UserCredPath =  System.getProperty("user.dir")+"/test-input/Input_UserLogin.xlsx";

	
public static String Username() throws Exception

	
	{
		File ScrUser = new  File(UserCredPath);
		FileInputStream fis = new FileInputStream(ScrUser);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String UserName = sheet1.getRow(1).getCell(0).getStringCellValue();
		return UserName;	
	}
	
public static String Password() throws Exception

	
	{
		File ScrUser = new  File(UserCredPath);
		FileInputStream fis = new FileInputStream(ScrUser);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String Password = sheet1.getRow(1).getCell(1).getStringCellValue();
		return Password;	
	}


public static String url() throws Exception


{
	File ScrUser = new  File(UserCredPath);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1 = wb.getSheetAt(0);
	//String url = sheet1.getRow(1).getCell(2).getStringCellValue();
	String url = sheet1.getRow(1).getCell(2).getStringCellValue();
    return url;



}

	

 
}
package com.islandpacific.ipmsweb.testdata.constantdefinations;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class InputEnterPriceChanges {
	public static String EnterPC = System.getProperty("user.dir")+"/test-input/Input_Enter_PriceChanges.xlsx";
	public static String SessionDescription() throws Exception

	
	{
		File ScrUser = new  File(EnterPC);
		FileInputStream fis = new FileInputStream(ScrUser);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String SessionDescription = sheet1.getRow(1).getCell(1).getStringCellValue();
		return SessionDescription;	
		
		
	}
	
	public static String SkUDetails() throws Exception


	{
		File ScrUser = new  File(EnterPC);
		FileInputStream fis = new FileInputStream(ScrUser);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String SkUDetails = sheet1.getRow(2).getCell(1).getStringCellValue();
		return SkUDetails;	
		
			
}
	
	
	public static String BookRetail() throws Exception


	{
		 File ScrUser = new  File(EnterPC);
			FileInputStream fis = new FileInputStream(ScrUser);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			int BookRetails= (int)wb.getSheetAt(0).getRow(3).getCell(1).getNumericCellValue();
			String BookRetail = String.valueOf(BookRetails);
			return BookRetail;
			
}
	
	
	public static String SplitFactor() throws Exception


	{
		 File ScrUser = new  File(EnterPC);
			FileInputStream fis = new FileInputStream(ScrUser);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			int SplitFactors= (int)wb.getSheetAt(0).getRow(4).getCell(1).getNumericCellValue();
			String SplitFactor = String.valueOf(SplitFactors);
			return SplitFactor;
			
}



}
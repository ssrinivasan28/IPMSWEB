/**
 * 
 */
package com.islandpacific.ipmsweb.testdata.financialmisoperations;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author SSrinivasan
 * @creationdate 03-Mar-20203:02:12 pm
 * @description
 */
public class TestDataFinancialFrieghtDutyWriteOffs 


{
	
	
	
public static String InputFrieghtDutyWriteOffs = System.getProperty("user.dir")+"/test-input/FinancialMiscOptions/InputFrieghtDutyWriteOffs.xlsx";
	
	
	public static String FileGroup() throws Exception

	
	{
		File ScrUser = new  File(InputFrieghtDutyWriteOffs);
		FileInputStream fis = new FileInputStream(ScrUser);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int fgpNumber = (int)wb.getSheetAt(0).getRow(1).getCell(1).getNumericCellValue();
		String str = String.format("%03d", fgpNumber); 
		String fileGroup = String.valueOf(str);
		return fileGroup;
		
	}
	
	
public static String InvoiceNumber() throws Exception

	
	{
	File ScrUser = new  File(InputFrieghtDutyWriteOffs);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	int reciptNumber = (int)wb.getSheetAt(0).getRow(2).getCell(1).getNumericCellValue();
	String strreciptNumber = String.format("%010d", reciptNumber); 
	String InvoiceNumb = String.valueOf(strreciptNumber);
	return InvoiceNumb;
		
	}

	

}

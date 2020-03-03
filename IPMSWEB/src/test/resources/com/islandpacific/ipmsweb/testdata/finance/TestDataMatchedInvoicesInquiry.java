package com.islandpacific.ipmsweb.testdata;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class TestDataMatchedInvoicesInquiry {
	public static String InputMatchedInvoicesInquiry = System.getProperty("user.dir")+"/test-input//FinancialSystemInquiries/InputMatchedInvoicesInquiry.xlsx";
	
	
	public static String VendorNumber() throws Exception

	
	{
		File ScrUser = new  File(InputMatchedInvoicesInquiry);
		FileInputStream fis = new FileInputStream(ScrUser);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int vendorNumber = (int)wb.getSheetAt(0).getRow(1).getCell(1).getNumericCellValue();
		String str = String.format("%06d", vendorNumber); 
		String vendorNum = String.valueOf(str);
		return vendorNum;
		
	}
	
	
public static String InvoiceNumber() throws Exception

	
	{
	File ScrUser = new  File(InputMatchedInvoicesInquiry);
	FileInputStream fis = new FileInputStream(ScrUser);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	int numInvoiceNumber = (int)wb.getSheetAt(0).getRow(2).getCell(1).getNumericCellValue();
	String strInvoiceNumber = String.format("%010d", numInvoiceNumber); 
	String numInvoiceNumber = String.valueOf(strInvoiceNumber);
	return numInvoiceNumber;
		
	}



}
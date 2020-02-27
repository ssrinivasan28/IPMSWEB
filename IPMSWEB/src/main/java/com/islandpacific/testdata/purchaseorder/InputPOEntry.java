package com.islandpacific.testdata.purchaseorder;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class InputPOEntry {
	public static String POEntry = System.getProperty("user.dir")+"/test-input/PurchaseOrderManagement/Input_POEntry.xlsx";
	public static String FileGroupEntry() throws Exception

	
	{
		File ScrUser = new  File(POEntry);
		FileInputStream fis = new FileInputStream(ScrUser);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int FGroup= (int)wb.getSheetAt(0).getRow(1).getCell(1).getNumericCellValue();
		String FGroups = String.valueOf(FGroup);
		return FGroups;
		
		
	}
	
	public static String BlockOutEntry() throws Exception


	{
		File ScrUser = new  File(POEntry);
		FileInputStream fis = new FileInputStream(ScrUser);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String BlockOutEntry = sheet1.getRow(2).getCell(1).getStringCellValue();
		return BlockOutEntry;
		
			
}
	
	
	public static String VendorEntry() throws Exception


	{
		 File ScrUser = new  File(POEntry);
			FileInputStream fis = new FileInputStream(ScrUser);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			int VendorEntrys= (int)wb.getSheetAt(0).getRow(3).getCell(1).getNumericCellValue();
			String VendorEntry = String.valueOf(VendorEntrys);
			return VendorEntry;
			
}
	
	
	public static String DepartMentEntry() throws Exception


	{
		 File ScrUser = new  File(POEntry);
			FileInputStream fis = new FileInputStream(ScrUser);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			int DepartMentEntrys= (int)wb.getSheetAt(0).getRow(4).getCell(1).getNumericCellValue();
			String DepartMentEntry = String.valueOf(DepartMentEntrys);
			return DepartMentEntry;
			
}
	
	public static String SKUEntry() throws Exception


	{
		 File ScrUser = new  File(POEntry);
			FileInputStream fis = new FileInputStream(ScrUser);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			int SKUEntrys= (int)wb.getSheetAt(0).getRow(5).getCell(1).getNumericCellValue();
			String SKUEntry = String.valueOf(SKUEntrys);
			return SKUEntry;
			
}

	public static String QtyEntry() throws Exception


	{
		 File ScrUser = new  File(POEntry);
			FileInputStream fis = new FileInputStream(ScrUser);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			int QtyEntrys= (int)wb.getSheetAt(0).getRow(6).getCell(1).getNumericCellValue();
			String QtyEntry = String.valueOf(QtyEntrys);
			return QtyEntry;
			
}


}
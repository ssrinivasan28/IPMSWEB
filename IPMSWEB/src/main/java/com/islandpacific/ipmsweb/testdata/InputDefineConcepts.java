package com.islandpacific.ipmsweb.testdata;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class InputDefineConcepts {
	public static String DefConceptpath = System.getProperty("user.dir")+"/test-input/Input_DefineConcepts.xlsx";
	public static String ConceptCode() throws Exception
	//String DefDistrictpath =  "C:\\Test Data\\Constant_Definations\\DefineDistrict.xlsx";

	
	{
		File ScrUser = new  File(DefConceptpath);
		FileInputStream fis = new FileInputStream(ScrUser);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int ConceptCodes= (int)wb.getSheetAt(0).getRow(1).getCell(1).getNumericCellValue();
		String ConceptCode = String.valueOf(ConceptCodes);
		return ConceptCode;
		
		
	}
	
	public static String ConceptName() throws Exception


	{
		File ScrUser = new  File(DefConceptpath);
		FileInputStream fis = new FileInputStream(ScrUser);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String ConceptName = sheet1.getRow(2).getCell(1).getStringCellValue();
		return ConceptName;	
	}


}

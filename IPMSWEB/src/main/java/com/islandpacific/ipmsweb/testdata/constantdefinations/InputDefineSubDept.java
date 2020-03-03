package com.islandpacific.ipmsweb.testdata.constantdefinations;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InputDefineSubDept {
	//public static String DefineSubDep =  "C:\\Automation\\Test Data\\Constant_Definations\\9_Def_SubDep.xlsx";
	public static String DefineSubDep =  System.getProperty("user.dir")+"/test-input/Input_Def_SubDep.xlsx";
	public static String DefSubDepcode() throws Exception
	//String DefDistrictpath =  "C:\\Test Data\\Constant_Definations\\DefineDistrict.xlsx";

	
	{
		File ScrUser = new  File(DefineSubDep);
		FileInputStream fis = new FileInputStream(ScrUser);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int SubDepartmentCodes= (int)wb.getSheetAt(0).getRow(1).getCell(1).getNumericCellValue();
		String SubDepartmentCode = String.valueOf(SubDepartmentCodes);
		return SubDepartmentCode;
		
		
	}
	
	public static String DefineSubDepName() throws Exception


	{
		File ScrUser = new  File(DefineSubDep);
		FileInputStream fis = new FileInputStream(ScrUser);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String SubDepartmentName = sheet1.getRow(2).getCell(1).getStringCellValue();
		return SubDepartmentName;	
	}
	
	
	public static String SubDepartmentUniqueID() throws Exception


	{
		File ScrUser = new  File(DefineSubDep);
		FileInputStream fis = new FileInputStream(ScrUser);
		//System.out.println("Exel Path " +ScrUser);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int SubDepUniqueID= (int)wb.getSheetAt(0).getRow(3).getCell(1).getNumericCellValue();
		String SubDepUniqueIDS = String.valueOf(SubDepUniqueID);
		//System.out.println("Ex ID sTRING " +SubDepUniqueIDS);
		//System.out.println("Ex ID INT " +SubDepUniqueID);
		return SubDepUniqueIDS;
	}
	
	public static String SubDepartmentUnderDepartment() throws Exception


	{
		File ScrUser = new  File(DefineSubDep);
		FileInputStream fis = new FileInputStream(ScrUser);
		//System.out.println("Exel Path " +ScrUser);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int SubDepartmentUnderDepartment= (int)wb.getSheetAt(0).getRow(4).getCell(1).getNumericCellValue();
		String SubDepartmentUnderDepartments = String.valueOf(SubDepartmentUnderDepartment);
		//System.out.println("Ex ID sTRING " +SubDepUniqueIDS);
		//System.out.println("Ex ID INT " +SubDepUniqueID);
		return SubDepartmentUnderDepartments;
	}


	

}

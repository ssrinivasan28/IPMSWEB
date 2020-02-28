package com.islandpacific.ipmsweb.test.definetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.islandpacific.ipmsweb.base.BaseTest;
import com.islandpacific.ipmsweb.util.ScreenRecord;

public class DefineDistricts extends BaseTest {
	
	@Test 
	public void DefineDistrict() throws Exception

	{
		test = extent.createTest("Define Dustrict");
		ScreenRecord.startRecording("Define District");
		/*
		 * //driver.findElement(By.xpath("//*[@id=\"LABEL1_0\"]")).click(); //
		 * Thread.sleep(3000); // test.log(Status.PASS, "Merchandising Menu Selected");
		 */		driver.findElement(By.xpath("//*[@id=\"LABEL4_2\"]")).click();
		
		test.log(Status.PASS, "Constant Defination Selected");
		 Thread.sleep(2000);
		 
		 WebElement mnuDeDist = driver.findElement(By.xpath("//*[@id=\"LABEL4_4\"]"));
	        mnuDeDist.click();
	        test.log(Status.PASS, "Clicked Define District");
	        Thread.sleep(5000);  
	        
	        //Entering District  Code into the feild 
	        WebElement txtDistCode = driver.findElement(By.xpath(".//*[@id='_OBJ_N65646']"));
	        txtDistCode.clear();
	        txtDistCode.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineDistrict.Districtcode());
	        WebElement BtnDistOK1 = driver.findElement(By.xpath(".//*[@id='(OK)']"));
	        BtnDistOK1.click();
	        test.log(Status.PASS, "Proceed OK ");
	        WebElement txtDistName = driver.findElement(By.id("_OBJ_N65803"));
	        txtDistName.clear();
	        txtDistName.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineDistrict.DistrictName());
	        test.log(Status.PASS, "District Name Entered");
	        WebElement txtDistToReg = driver.findElement(By.id("_OBJ_N65864"));
	        txtDistToReg.clear();
	        txtDistToReg.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineDistrict.DistrictLinkToRegion());
	        test.log(Status.PASS, "District Linked to Region");
	        WebElement txtDistMan = driver.findElement(By.id("_OBJ_N65927"));
	        txtDistMan.clear();
	        txtDistMan.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineDistrict.DistrictManager());
	        test.log(Status.PASS, "District Manager Name Entered");
	        WebElement txtDisPhone = driver.findElement(By.id("_OBJ_N65988"));
	        txtDisPhone.clear();
	        txtDisPhone.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineDistrict.DistrictTelephone());
	        test.log(Status.PASS, "District Phone Entered");
	        WebElement txtDistAdd1 = driver.findElement(By.id("ADDR1"));
	        txtDistAdd1.clear();
	        txtDistAdd1.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineDistrict.DistrictAddressOne());
	        test.log(Status.PASS, "District Address1 Entered");
	        WebElement txtDistAdd2 = driver.findElement(By.id("_OBJ_N66159"));
	        txtDistAdd2.clear();
	        txtDistAdd2.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineDistrict.DistrictAddressTwo());
	        test.log(Status.PASS, "District Address 2 Entered");
	        WebElement txtDistCity = driver.findElement(By.id("_OBJ_N66220"));
	        txtDistCity.clear();
	        txtDistCity.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineDistrict.DistrictCity());
	        test.log(Status.PASS, "District City Entered");
	        WebElement txtDistState = driver.findElement(By.id("_OBJ_N66259"));
	        txtDistState.clear();
	        txtDistState.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineDistrict.DistrictState());
	        test.log(Status.PASS, "District State Entered");
	        WebElement txtDistPin = driver.findElement(By.xpath(".//*[@id='ZIP']"));
	        txtDistPin.clear();
	        txtDistPin.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineDistrict.DistrictPostalCode());
	        test.log(Status.PASS, "District Pin   Entered");
	        WebElement txtDistCountry = driver.findElement(By.id("_OBJ_N66379"));
	        txtDistCountry.clear();
	        txtDistCountry.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineDistrict.DistrictContry());
	        test.log(Status.PASS, "District  Country Entered");
	        WebElement BtnDistOK = driver.findElement(By.xpath(".//*[@id='(OK)']"));
	         BtnDistOK.click();
	        test.log(Status.PASS, " District has been created ");
	        WebElement BtnDistExit = driver.findElement(By.id("_OBJ_N65844"));
	        BtnDistExit.click();
	        test.log(Status.PASS, "Exited to Constant Definitons");
	        driver.quit();
	        ScreenRecord.stopRecording();
	    	

		
		

		
	} 
	
}

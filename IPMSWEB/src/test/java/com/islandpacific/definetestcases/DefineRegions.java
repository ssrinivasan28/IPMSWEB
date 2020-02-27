package com.islandpacific.definetestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.islandpacific.base.BaseTest;
import com.islandpacific.testdata.InputDefineRegion;

public class DefineRegions extends BaseTest {
	
	@Test 
	public void DefineRegion() throws Exception

	{	test = extent.createTest("Define Regions ");
		//ScreenRecord.startRecording("Define Region");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		/*driver.findElement(By.xpath("//*[@id=\"LABEL1_0\"]")).click();
		Thread.sleep(3000);
		test.log(Status.PASS, "Merchandising  Menu Selected");*/
		driver.findElement(By.xpath("//*[@id=\"LABEL4_2\"]")).click();
		
		test.log(Status.PASS, "Constant Defination Selected");
		 Thread.sleep(2000);
		
		WebElement mnuDefReg = driver.findElement(By.xpath("//*[@id=\"LABEL4_3\"]"));
		mnuDefReg.click();
		test.log(Status.PASS, "Clicked Define Regions");
		
		//Entering Region Code into the feild 
		WebElement txtRegCode = driver.findElement(By.xpath(".//*[@id='_OBJ_N65646']"));
		txtRegCode.clear();
		txtRegCode.sendKeys(InputDefineRegion.Regioncode());
		test.log(Status.PASS, "Region Code Entered") ;
		WebElement btnReg1OK = driver.findElement(By.xpath(".//*[@id='(OK)']"));
		btnReg1OK.click();
	//	System.out.println("Proceed OK ");
	//	Thread.sleep(5000);  
		
 //Enter Regions 
		WebElement txtRegNam = driver.findElement(By.id("_OBJ_N65803"));
		txtRegNam.clear();
		txtRegNam.sendKeys(InputDefineRegion.RegionName());
		test.log(Status.PASS, "Region Name Entered");
		//Enter Territory  Link to Zone
		WebElement txtRegLnkTer = driver.findElement(By.id("_OBJ_N65864"));
		txtRegLnkTer.clear();
		txtRegLnkTer.sendKeys(InputDefineRegion.RegionLinkToTerritory());
		WebElement txtRegManager = driver.findElement(By.id("_OBJ_N65927"));
		txtRegManager.clear();
		txtRegManager.sendKeys(InputDefineRegion.RegionManager());
		test.log(Status.PASS, "Region Manager Name Entered");
		//Enter Region Phone  NAME
		WebElement txtRegTel = driver.findElement(By.id("_OBJ_N65988"));
		txtRegTel.clear();
		txtRegTel.sendKeys(InputDefineRegion.RegionTelephone());
		test.log(Status.PASS, "Region Phone Entered");
			//Enter Add Address1 NAME
		WebElement txtRegAdd1 = driver.findElement(By.xpath("//*[@id=\"ADDR1\"]"));
		txtRegAdd1.clear();
		txtRegAdd1.sendKeys(InputDefineRegion.RegionAddressOne());
		test.log(Status.PASS, "Region Address1 Entered");
		//Enter Add Address2 NAME
		WebElement txtRegAdd2 = driver.findElement(By.xpath("//*[@id=\"_OBJ_N66159\"]"));
		txtRegAdd2.clear();
		txtRegAdd2.sendKeys(InputDefineRegion.RegionAddressTwo());
		test.log(Status.PASS, "Region Address 2 Entered");
		///Enter Region  City
		WebElement txtRegCity = driver.findElement(By.id("_OBJ_N66220"));
		txtRegCity.clear();
		txtRegCity.sendKeys(InputDefineRegion.RegionCity());
		test.log(Status.PASS, "Region City Entered");		
 //Enter Region State
		WebElement txtRegState = driver.findElement(By.id("_OBJ_N66259"));
		txtRegState.clear();
		txtRegState.sendKeys(InputDefineRegion.RegionState());
		test.log(Status.PASS, "Region State Entered");
		//Enter Region Pin 
		WebElement txtRegPin = driver.findElement(By.xpath("//*[@id=\"ZIP\"]"));
		txtRegPin.clear();
		txtRegPin.sendKeys(InputDefineRegion.RegionPostalCode());
		test.log(Status.PASS, "Region Pin   Entered");
		//Enter Region Country
		WebElement txtRegCountry = driver.findElement(By.xpath("//*[@id=\"_OBJ_N66379\"]"));
		txtRegCountry.clear();
		txtRegCountry.sendKeys(InputDefineRegion.RegionContry());
		test.log(Status.PASS, "Region  Country Entered");
			WebElement btnReg2OK = driver.findElement(By.xpath("//*[@id=\"(OK)\"]"));
			btnReg2OK.click();
			
			//Back to Constant Definations 
	        WebElement BtnRegExit = driver.findElement(By.id("_OBJ_N65844"));
	        BtnRegExit.click();
	        test.log(Status.PASS, "Region has been Created");
	      //  ScreenRecord.stopRecording();
	    	
	     //   driver.quit();

		
		
		
		
		
	}
	

}

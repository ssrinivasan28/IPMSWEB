package com.islandpacific.ipmsweb.test.definetestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.islandpacific.ipmsweb.base.BaseTest;

public class DefineTerritories extends BaseTest

{
	
	@Test (priority =1)
	public void DefineTerritory () throws Exception
	{
		test = extent.createTest("Define Territories");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//	driver.findElement(By.xpath("//*[@id=\"LABEL1_0\"]")).click();
	//	Thread.sleep(3000);
	//	test.log(Status.PASS, "Merchandising Menu Selected");
		driver.findElement(By.xpath("//*[@id=\"LABEL4_2\"]")).click();
		
		test.log(Status.PASS, "Constant Defination Selected");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"LABEL4_2\"]")).click(); 
		
			test.log(Status.PASS, "Clicked Defined Territory");
			Thread.sleep(2000);
			
		
			//Define Territory 
	       
	        //Entering Zone Code into the feild 
	     
				WebElement txtTerCode= driver.findElement(By.xpath(".//*[@id='_OBJ_N65649']"));
				txtTerCode.clear();
				txtTerCode.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineTerritory.Territorycode());
				test.log(Status.PASS, "Territory Code Entered") ;
				
				WebElement BtnTerOK = driver.findElement(By.xpath(".//*[@id='(OK)']"));
				BtnTerOK.click();
				test.log(Status.PASS, "Proceed OK ");
				Thread.sleep(3000);  
				
		WebElement TxtTerName= driver.findElement(By.id("_OBJ_N65704"));
		TxtTerName.clear();
		TxtTerName.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineTerritory.TerritoryName());
		test.log(Status.PASS, "Territory Name Entered");
		WebElement txtTerLnkZone = driver.findElement(By.id("_OBJ_N65765"));
		txtTerLnkZone.clear();
		txtTerLnkZone.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineTerritory.TerritoryLinkToZone());
		test.log(Status.PASS, "Territory Linked to Zone");
		WebElement TxtTerManager= driver.findElement(By.id("_OBJ_N65826"));
		TxtTerManager.clear();
		TxtTerManager.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineTerritory.TerritoryManager());
		test.log(Status.PASS, "Territory Manager Name Entered");
		WebElement txtTerTel = driver.findElement(By.id("_OBJ_N65887"));
		txtTerTel.clear();
		txtTerTel.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineTerritory.TerritoryTelephone());
		test.log(Status.PASS, "Territory Phone Entered");
		WebElement txtTerAdd1 = driver.findElement(By.xpath(".//*[@id='ADDR1']"));
		txtTerAdd1.clear();
		txtTerAdd1.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineTerritory.TerritoryAddressOne());
		test.log(Status.PASS, "Territory Address1 Entered");
		WebElement TxtTerAdd2 = driver.findElement(By.id("_OBJ_N66058"));
		TxtTerAdd2.clear();
		TxtTerAdd2.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineTerritory.TerritoryAddressTwo());
		test.log(Status.PASS, "Territory Address 2 Entered");
		WebElement TxtTerCity = driver.findElement(By.id("_OBJ_N66119"));
		TxtTerCity.clear();
		TxtTerCity.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineTerritory.TerritoryCity());
		test.log(Status.PASS, "Territory City Entered");
		WebElement txtTerritorytate = driver.findElement(By.id("_OBJ_N66158"));
		txtTerritorytate.clear();
		txtTerritorytate.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineTerritory.TerritoryState());
		test.log(Status.PASS, "Territory State has been Created");
        WebElement txtTerPin = driver.findElement(By.xpath("//*[@id=\"ZIP\"]"));
        txtTerPin.clear();
        txtTerPin.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineTerritory.TerritoryPostalCode());
        test.log(Status.PASS, "Territory Pin  Entered");
        WebElement txtTerCountry = driver.findElement(By.id("_OBJ_N66283"));
        txtTerCountry.clear();
        txtTerCountry.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineTerritory.TerritoryContry());
        test.log(Status.PASS, "Territory  Country Entered");
         WebElement btnTer2OK = driver.findElement(By.xpath("//*[@id=\"(OK)\"]"));
         btnTer2OK.click();
         WebElement BtnTerExit = driver.findElement(By.id("_OBJ_N65847"));
         BtnTerExit.click();
     	
         
}

}
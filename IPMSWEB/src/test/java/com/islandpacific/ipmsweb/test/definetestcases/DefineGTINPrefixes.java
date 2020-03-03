package com.islandpacific.ipmsweb.test.definetestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.islandpacific.ipmsweb.base.BaseTest;
import com.islandpacific.ipmsweb.testdata.constantdefinations.InputDefineGTIN;
import com.islandpacific.ipmsweb.util.ScreenRecord;



public class DefineGTINPrefixes extends BaseTest

{
	@Test (priority =1)
	
	public void DefineGTINPrefix() throws Exception
	
	{
		test = extent.createTest("Define GTIN Prefixes");
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"LABEL1_0\"]")).click();
		Thread.sleep(3000);
		test.log(Status.PASS, "Merchandising  Menu Selected");
		driver.findElement(By.xpath("//*[@id=\"LABEL4_2\"]")).click();
		test.log(Status.PASS, "Constant Defination Selected");
		 Thread.sleep(2000);
		 WebElement GTINMenu = driver.findElement(By.xpath("//*[@id=\"LABEL4_22\"]"));
		 Actions GTRIN = new Actions(driver);
		 GTRIN.moveToElement(GTINMenu);
		 GTRIN.perform();
		 GTINMenu.click();
		 test.log(Status.PASS, "Menu Define GTIN prefix is clicked") ;
	//	 System.out.println("Clicked Define GTIN");
		 Thread.sleep(3000);
		 
//GTIN Add Option 
		 WebElement GTINAdd = driver.findElement(By.xpath(".//*[@id='_OBJ_N66431']"));
		 GTINAdd.click();
		 test.log(Status.PASS, "Add Button clicked");
		 Thread.sleep(3000);
		 
//GTIN code 
		 WebElement GTINCode = driver.findElement(By.xpath(".//*[@id='_OBJ_N65937']"));
		 GTINCode.sendKeys(com.islandpacific.ipmsweb.testdata.constantdefinations.InputDefineGTIN.GTINCode());
	 test.log(Status.PASS, "GTIN Code is entered");
	//	 System.out.println("GTIN Code" + " " +DefineGTIN.GTINCode()+ " " + "has been entered");
		
	//	 Utility.captureScreenshotforGTIN(driver);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(".//*[@id='(OK)']")).click();
		 
//GTIN Description 
		 WebElement GTINDesc = driver.findElement(By.xpath(".//*[@id='_OBJ_N66041']"));
		 GTINDesc.sendKeys(InputDefineGTIN.GTINName());
		 test.log(Status.PASS, "GTIN Description is entered ");
		 //System.out.println("GTIN Description" +DefineGTIN.GTINName() + "/has been entered");
//		 Utility.captureScreenshotforGTIN(driver);
		
			Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='(OK)']")).click();
			 
			 
			 Thread.sleep(3000);
			 WebElement BtnBack = driver.findElement(By.xpath("//*[@id=\"_OBJ_N66222\"]"));
			 BtnBack.click();
			 
			 WebElement BtnExit = driver.findElement(By.xpath("//*[@id=\"_OBJ_N66256\"]"));
			 BtnExit.click();
			 Thread.sleep(3000);
			 test.log(Status.PASS, "GTIN Prefix has been defined");

			 
				
		
		
		
		
		
		
	}

}

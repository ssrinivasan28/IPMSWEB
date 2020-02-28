package com.islandpacific.deletetestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.islandpacific.ipmsweb.base.BaseTest;
import com.islandpacific.ipmsweb.util.ScreenRecord;

public class DeleteGTIN extends BaseTest  {

	
@Test 

public void GTINDeletion() throws Exception
{
	
	test = extent.createTest("Define GTIN Prefixes");
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"LABEL1_0\"]")).click();
	Thread.sleep(3000);
	test.log(Status.PASS, "Merchandising  Menu Selected");
	driver.findElement(By.xpath("//*[@id=\"LABEL4_2\"]")).click();
	System.out.println("Constant Defination Selected");
	 Thread.sleep(3000);
	 WebElement GTINMenu = driver.findElement(By.xpath("//*[@id=\"LABEL4_22\"]"));
	 Actions GTRIN = new Actions(driver);
	 GTRIN.moveToElement(GTINMenu);
	 GTRIN.perform();
	 GTINMenu.click();
	 test.log(Status.PASS, "Menu Define GTIN prefix is clicked") ;
	//if( driver.getPageSource().contains(com.islandpacific.testdata.InputDefineGTIN.GTINCode()));
	WebElement LocateGTIN = driver.findElement(By.xpath("//*[@id=\"_OBJ_N65691\"]"));
	LocateGTIN.clear();
	LocateGTIN.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineGTIN.GTINCode());
	LocateGTIN.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	WebElement chkboxGTIN = driver.findElement(By.xpath("//*[@id=\"(LIST)CHECK_0\"]/div[2]"));
	chkboxGTIN.click();
	//WebElement GTINGridText = driver.findElement(By.xpath("//*[@id=\"LSTCOL1_0\"]"));
	//String FirstRow = GTINGridText.getText();
//	if (FirstRow.equals(com.islandpacific.testdata.InputDefineGTIN.GTINCode()))
		WebElement BtnDelete = driver.findElement(By.xpath("//*[@id=\"_OBJ_N65852\"]"));
	    BtnDelete.click();
	    test.log(Status.PASS, "Deleted Button Clicked") ;
	    
	    Thread.sleep(5000);

	
	
/*	else 
	{
		
		System.out.println("GTIN doesnot exist");
		
	
}*/
	ScreenRecord.stopRecording();
	
}

}


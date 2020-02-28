package com.islandpacific.deletetestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.islandpacific.ipmsweb.base.BaseTest;
import com.islandpacific.ipmsweb.testdata.InputDefineRegion;

public class DeleteRegion extends BaseTest {
	
@Test
public  void DeleteRegions() throws Exception
{
	
	test = extent.createTest("Delete Regions ");
	driver.manage().timeouts().implicitlyWait(600,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"LABEL1_0\"]")).click();
	Thread.sleep(3000);
	test.log(Status.PASS, "Merchandising  Menu Selected");
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
	WebElement txtRegNam = driver.findElement(By.id("_OBJ_N65803"));
	
	String textInsideInputBox = txtRegNam.getAttribute("value");

	// Check whether input field is blank
	if(textInsideInputBox.isEmpty())
	{
		test.log(Status.INFO, "Region doesnot exist for deletion ");
	  // driver.quit();
	}
		
	
	else 
	{
		
		driver.findElement(By.xpath("//*[@id=\"_OBJ_N66587\"]")).click();
		
		if (driver.findElement(By.xpath("//*[@id=\"_OBJ_N65646\"]")).isDisplayed())
		{
			
			
			test.log(Status.PASS, "Region is deleted ");
			
		}
		
		
		else
		{
			test.log(Status.FATAL, "Region is not deleted ");
			
			
		}
		
		



}

	
}


}

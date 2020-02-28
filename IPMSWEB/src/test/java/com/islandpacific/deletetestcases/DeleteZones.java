package com.islandpacific.deletetestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.islandpacific.ipmsweb.base.BaseTest;
import com.islandpacific.ipmsweb.testdata.InputDefineZones;

public class DeleteZones extends BaseTest  {
	
@Test
	public void DeleteZone() throws Exception
	{
	test = extent.createTest("Delete Zone");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"LABEL1_0\"]")).click();
	
	test.log(Status.INFO, "Merchandising  Menu Selected");
	driver.findElement(By.xpath("//*[@id=\"LABEL4_2\"]")).click();
	
	test.log(Status.INFO, "Constant Defination Selected");
	Thread.sleep(4000);
	 
	 driver.findElement(By.xpath("//*[@id=\"LABEL4_1\"]")).click(); 
		
		
		//driver.findElement(By.xpath(".//*[@id='LABEL4_1']/div")).click();
		
		
		//System.out.println("Clicked Defined Zones");
		//
		
	
		//Define Zones 
       
        //Entering Zone Code into the feild 
     
			WebElement txtzodecode = driver.findElement(By.xpath(".//*[@id='_OBJ_N65646']"));
			txtzodecode.clear();
			txtzodecode.sendKeys(InputDefineZones.Zonecode());
			//txtzodecode.sendKeys(Inputdata.ZoneCode());
			test.log(Status.INFO, "Zone Code Entered");
			//txtzodecode.sendKeys("555");
			
			
			
			
	
    //   Utility.capturescreenshot(driver);
			WebElement btnOKK = driver.findElement(By.xpath(".//*[@id='(OK)']"));
			btnOKK.click();
			
			  
			
			//Enter ZoneName
			//Utility.capturescreenshot(driver);
			WebElement txtZoneName = driver.findElement(By.id("_OBJ_N65879"));
	
			
			String textInsideInputBox = txtZoneName.getAttribute("value");

			// Check whether input field is blank
			if(textInsideInputBox.isEmpty())
			{
				test.log(Status.INFO, "Zone doesnot exist for deletion ");
			  // driver.quit();
			}
				
			
			else 
			{
				
				driver.findElement(By.xpath("//*[@id=\"_OBJ_N66719\"]")).click();
				
				if (driver.findElement(By.xpath("//*[@id=\"_OBJ_N65646\"]")).isDisplayed())
				{
					
					
					test.log(Status.PASS, "Zone  is deleted ");
					
				}
				
				
				else
				{
					test.log(Status.FATAL, "Zone is not deleted ");
					
					
				}
				
			
				
				

}
			
}
}

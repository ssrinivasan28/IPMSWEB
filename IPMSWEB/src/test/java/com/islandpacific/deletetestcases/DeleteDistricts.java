package com.islandpacific.deletetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.islandpacific.ipmsweb.base.BaseTest;
import com.islandpacific.ipmsweb.util.ScreenRecord;

public class DeleteDistricts extends BaseTest {
	
@Test
public void DelDist() throws Exception
{
	
	test = extent.createTest("Define Dustrict");
	
	driver.findElement(By.xpath("//*[@id=\"LABEL1_0\"]")).click();
	Thread.sleep(3000);
	test.log(Status.PASS, "Merchandising Menu Selected");
	driver.findElement(By.xpath("//*[@id=\"LABEL4_2\"]")).click();
	
	test.log(Status.PASS, "Constant Defination Selected");
	 Thread.sleep(2000);
	 
	 WebElement mnuDeDist = driver.findElement(By.xpath("//*[@id=\"LABEL4_4\"]"));
        mnuDeDist.click();
        test.log(Status.PASS, "Clicked Define District");
        Thread.sleep(5000);  
        
        //Entering District  Code into the feild 
        WebElement txtDistCode = driver.findElement(By.xpath(".//*[@id='_OBJ_N65646']"));
        txtDistCode.clear();
        txtDistCode.sendKeys(com.islandpacific.ipmsweb.testdata.constantdefinations.InputDefineDistrict.Districtcode());
        WebElement BtnDistOK1 = driver.findElement(By.xpath(".//*[@id='(OK)']"));
        BtnDistOK1.click();
        test.log(Status.PASS, "Proceed OK ");
        WebElement txtDistName = driver.findElement(By.id("_OBJ_N65803"));
        String textInsideInputBox = txtDistName.getAttribute("value");
		if(textInsideInputBox.isEmpty())
		{
			test.log(Status.INFO, "District doesnot exist for deletion ");
		  // driver.quit();
		}
			
		
		else 
		{
			
			driver.findElement(By.xpath("//*[@id=\"_OBJ_N66640\"]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@id='_OBJ_N65844']")).click();
			
			if (driver.findElement(By.xpath("//div[@id='LABEL4_1']")).isDisplayed())
			{
				
				
				test.log(Status.PASS, "District  is deleted ");
				
			}
			
	



}
}
}

package com.islandpacific.deletetestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.islandpacific.ipmsweb.base.BaseTest;
import com.islandpacific.ipmsweb.testdata.InputDefineConcepts;

public class DeleteConcepts extends BaseTest {

@Test(priority =1)

public void DelConcepts() throws Exception

{
	

	test = extent.createTest("Delete Concepts");
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"LABEL1_0\"]")).click();
	Thread.sleep(3000);
	test.log(Status.PASS, "Merchandising Menu Selected");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"LABEL4_2\"]")).click();
	
	test.log(Status.PASS, "Constant Defination Selected");
	 Thread.sleep(2000);
	 WebElement DefineConcepts = driver.findElement(By.xpath("//*[@id=\"LABEL4_25\"]"));
	 Actions actions = new Actions(driver);
	 actions.moveToElement(DefineConcepts);
	 actions.perform();
	 DefineConcepts.click();
	 Thread.sleep(3000);
	 
//Enter Concept Code
	 WebElement ConceptCode = driver.findElement(By.xpath("//input[@id='_OBJ_N65843']"));
	 ConceptCode.clear();
	 ConceptCode.sendKeys(InputDefineConcepts.ConceptCode());
	 test.log(Status.PASS, "Concept Code is entered");
//	 Utility.captureScreenshotforConcepts(driver);
	 Thread.sleep(3000);
	 driver.findElement(By.xpath(".//*[@id='(OK)']")).click(); 
	 
	 WebElement ConceptName = driver.findElement(By.xpath(".//*[@id='_OBJ_N65927']"));
	 String textInsideInputBox = ConceptName.getAttribute("value");
		if(textInsideInputBox.isEmpty())
		{
			test.log(Status.INFO, "Concept doesnot exist for deletion ");
		  // driver.quit();
		}
			
		
		else 
		{
			
			driver.findElement(By.xpath("//div[@id='_OBJ_N66078']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@id='_OBJ_N66037']")).click();
			
			if (driver.findElement(By.xpath("//div[@id='LABEL4_1']")).isDisplayed())
			{
				
				
				test.log(Status.PASS, "Concept  is deleted ");
				
			}
			
			
			else
			{
				test.log(Status.FATAL, "Concept is not deleted ");
				
				
			}
			
	 


}

}
}

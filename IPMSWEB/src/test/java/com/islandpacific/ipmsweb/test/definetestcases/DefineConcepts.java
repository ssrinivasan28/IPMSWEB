package com.islandpacific.ipmsweb.test.definetestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.islandpacific.ipmsweb.base.BaseTest;
import com.islandpacific.ipmsweb.testdata.constantdefinations.InputDefineConcepts;
import com.islandpacific.ipmsweb.util.ScreenRecord;



public class DefineConcepts extends BaseTest

{
	
	@Test
	public void DefineConcept() throws Exception
	{
		
		test = extent.createTest("Define Concepts");
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"LABEL1_0\"]")).click();
		Thread.sleep(3000);
		test.log(Status.INFO, "Merchandising Menu Selected");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"LABEL4_2\"]")).click();
		
		test.log(Status.INFO, "Constant Defination Selected");
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
		//Enter Concept Name
		 WebElement ConceptName = driver.findElement(By.xpath(".//*[@id='_OBJ_N65927']"));
		// System.out.println(input.DefineConcepts.ConceptName());
		 ConceptName.sendKeys(InputDefineConcepts.ConceptName());
		 //System.out.println("Concept" +input.DefineConcepts.ConceptName() +"has been entereded");
		 test.log(Status.PASS, "Concept Name is entered");
		 
		// Utility.captureScreenshotforConcepts(driver);
		 Thread.sleep(3000);
		
		
			driver.findElement(By.xpath(".//*[@id='(OK)']")).click();
			test.log(Status.PASS, "Concept has been created");
			driver.findElement(By.xpath(".//*[@id='_OBJ_N66037']")).click();
			// System.out.println("Navigated to Constant Definition Menu");
			 Thread.sleep(3000);
			//outputdata.TestResults.ConceptPass();
			 Thread.sleep(3000);
		
				
		
		
		
		
	}

}

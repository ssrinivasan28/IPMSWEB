package com.islandpacific.deletetestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.islandpacific.ipmsweb.base.BaseTest;

public class DeleteTerritories extends BaseTest {

@Test 
public void DeleteTerritorry() throws Exception

{
	
	test = extent.createTest("Delete Territories");
	//ScreenRecord.startRecording("Delete Territories");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"LABEL1_0\"]")).click();
	test.log(Status.PASS, "Merchandising Menu Selected");
	driver.findElement(By.xpath("//*[@id=\"LABEL4_2\"]")).click();
	test.log(Status.PASS, "Constant Defination Selected");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"LABEL4_2\"]")).click(); 
	test.log(Status.PASS, "Clicked Defined Territory");
		
	//Define Territory        
        //Entering Zone Code into the feild 
     
	WebElement txtTerCode= driver.findElement(By.xpath(".//*[@id='_OBJ_N65649']"));
	txtTerCode.clear();
	txtTerCode.sendKeys(com.islandpacific.ipmsweb.testdata.constantdefinations.InputDefineTerritory.Territorycode());
	test.log(Status.PASS, "Territory Code Entered") ;
			
	WebElement BtnTerOK = driver.findElement(By.xpath(".//*[@id='(OK)']"));
	BtnTerOK.click();
	test.log(Status.INFO, "Proceed OK ");
			  
			
	//Enter TerritoryName
	WebElement TxtTerName= driver.findElement(By.id("_OBJ_N65704"));
	String textInsideInputBox = TxtTerName.getAttribute("value");

	// Check whether input field is blank
	if(textInsideInputBox.isEmpty())
	{
		test.log(Status.INFO, "Territory doesnot exist for deletion ");
			
	}
						
	else 
	{
		
		driver.findElement(By.xpath("//*[@id=\"_OBJ_N66496\"]/div")).click();
		
		if (driver.findElement(By.xpath("//*[@id=\"_OBJ_N65627\"]")).isDisplayed())
		{
					
			
test.log(Status.INFO, "Territory is deleted ");
					
				}
				
	
		
				
		//ScreenRecord.stopRecording();
			
			}
				
	
				
			}
	






	


}

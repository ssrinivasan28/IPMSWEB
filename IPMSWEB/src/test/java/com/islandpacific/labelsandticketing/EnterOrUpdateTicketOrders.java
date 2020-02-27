package com.islandpacific.labelsandticketing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.islandpacific.base.BaseTest;

public class EnterOrUpdateTicketOrders extends BaseTest {
	/**
	 * @author SSrinivasan
	 * @throws Exception 
	
	 */	
	
	
	
@Test 
public void EnterUpdateTicketOrders() throws Exception
{
	

	test = extent.createTest("Enter Or Update Ticket Order Details ");
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	WebElement menuLabels = driver.findElement(By.xpath("//div[@id='LABEL1_9']"));
	menuLabels.click();
	test.log(Status.PASS, "Labels and Ticketing Menu Clicked");
	Thread.sleep(6000);
	System.out.println("Click 1");
	for(int i=0; i<=2;i++){
		  try{
			  WebElement menuEnterUpdateTicketOrders = driver.findElement(By.xpath("//div[@id='LABEL4_2']"));
				menuEnterUpdateTicketOrders.click();
				menuLabels.click();
		     break;
		  }
		     catch(Exception e){
		         System.out.println(e.getMessage());
		      }
		    
		     
		  
	}
	
	
	
	Thread.sleep(2000);
	test.log(Status.PASS, " Enter Update Ticketing Orders Menu Clicked");
	Thread.sleep(3000);
	
	WebElement btnAdd = driver.findElement(By.xpath("//div[@id='_OBJ_N66336']"));
	btnAdd.click();

	Thread.sleep(6000);
	WebElement txtStore = driver.findElement(By.xpath("//input[@id='_OBJ_N65694']"));
	txtStore.clear();
	txtStore.sendKeys("00586");
	test.log(Status.PASS, "Vendor Details Entered");
	WebElement txtOrderNumber = driver.findElement(By.xpath("//input[@id='_OBJ_N65839']"));
	txtOrderNumber.clear();
	txtOrderNumber.sendKeys(com.islandpacific.testdata.purchaseorder.InputPOEntry.BlockOutEntry());
	test.log(Status.PASS, "Order Details Entered");
	WebElement txtSKUDetails =driver.findElement(By.xpath("//input[@id='LSTCOL3_0']")) ;
	txtSKUDetails.clear();
	txtSKUDetails.sendKeys(com.islandpacific.testdata.purchaseorder.InputPOEntry.SKUEntry());
	test.log(Status.PASS, "SKU  Details Entered");
	WebElement txtQty =driver.findElement(By.xpath("//input[@id='LSTCOL4_0']")) ;
	txtQty.clear();
	txtQty.sendKeys("10");
	test.log(Status.PASS, "Qty of SKU Entered ");
	WebElement txtRetail =driver.findElement(By.xpath("//input[@id='LSTCOL5_0']"));
	txtRetail.clear();
	txtRetail.sendKeys("10");
	test.log(Status.PASS, "Retail of the SKU Entered");
	WebElement btnContinue =driver.findElement(By.xpath("//div[@id='_OBJ_N66714']"));
	btnContinue.click();
	WebElement btnExit = driver.findElement(By.xpath("//div[@id='_OBJ_N66283']"));
	btnExit.click();
	Thread.sleep(5000);
	System.out.println("Click");
	driver.findElement(By.id("TOOLBAR_SPLITBUTTON1")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("TOOLBAR_SPLITBUTTON1")).sendKeys(Keys.SHIFT,"X") ;
	Thread.sleep(6000);
	test.log(Status.PASS, "Logged off");

	
	
	
	
	 




}

}

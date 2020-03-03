/**
 * 
 */
package com.islandpacific.ipmsweb.test.receiving;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.islandpacific.ipmsweb.base.BaseTest;

/**
 * @author SSrinivasan
 * @creation date 03-Mar-20204:48:23 pm
 * @description
 */
public class ReceiveByPurchaseOrder extends BaseTest 

{
	
	@Test
	
	public void defReceiveByPurchaseOrder() throws Exception
	{
		
		test = extent.createTest("Receiving Log Inqruiy");
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		WebElement menuMerchandise = driver.findElement(By.xpath("//div[@id='LABEL1_0']"));
		menuMerchandise.click();
		test.log(Status.PASS, "Merchandise Menu Clicked");
		Thread.sleep(5000);
		WebElement menuReceiving = driver.findElement(By.xpath("//div[@id='LABEL4_5']"));
		menuReceiving.click();
		test.log(Status.PASS, "Receving Menu Clicked");
		Thread.sleep(5000);
		WebElement menuReceiveByPurchaseOrder = driver.findElement(By.xpath("//div[@id='LABEL4_4']"));
		menuReceiveByPurchaseOrder.click();
		WebElement txtPurchaseOrderNumber = driver.findElement(By.xpath("//input[@id='_OBJ_N100BB']"));
		txtPurchaseOrderNumber.clear();
		txtPurchaseOrderNumber.sendKeys(com.islandpacific.ipmsweb.testdata.purchaseorder.InputPOEntry.BlockOutEntry());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		WebElement txtInvoiceNumber = driver.findElement(By.xpath("//input[@id='_OBJ_N105BF']"));
		txtInvoiceNumber.sendKeys(com.islandpacific.ipmsweb.testdata.purchaseorder.InputPOEntry.BlockOutEntry());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		WebElement txtReceiveQty = driver.findElement(By.xpath("//input[@id='LSTCOL6_0']"));
		txtReceiveQty.clear();
		txtReceiveQty.sendKeys(com.islandpacific.ipmsweb.testdata.purchaseorder.InputPOEntry.QtyEntry());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		WebElement rbuttonPutAway = driver.findElement(By.xpath("//div[contains(text(),'Speed')]"));
		rbuttonPutAway.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		WebElement btnExit = driver.findElement(By.xpath("//div[@id='_OBJ_N1011C']"));
		btnExit.click();
		signoffSession();
		
		
		
		
		
		
		
		
		
		
	}
	
	

}

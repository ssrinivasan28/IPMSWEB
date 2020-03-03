package com.islandpacific.ipmsweb.test.purchaseordermanagement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.islandpacific.ipmsweb.base.BaseTest;

public class PurchaseOrderApproval extends BaseTest {
	
@Test
public void defPurchaseOrderApproval() throws Exception
{
	
	test = extent.createTest("Purchase Order Approval");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement menuMerchandise = driver.findElement(By.xpath("//div[@id='LABEL1_0']"));
	menuMerchandise.click();
	test.log(Status.PASS, "Merchandise Menu Clicked");
	Thread.sleep(3000);
	WebElement menuPoManagement = driver.findElement(By.xpath("//div[@id='LABEL4_4']"));
	menuPoManagement.click();	
	test.log(Status.PASS, "Purchase Management Menu Clicked");
	Thread.sleep(5000);
	WebElement menuPOApproval = driver.findElement(By.xpath("//div[@id='LABEL4_7']"));
	menuPOApproval.click();
	test.log(Status.PASS, "Purchase Prder Approval Menu Clicked");
	Thread.sleep(3000);
	WebElement txtFileGroup= driver.findElement(By.xpath("//input[@id='WFGP']"));
	txtFileGroup.sendKeys("700");
	test.log(Status.PASS, "File Group Entered");
	txtFileGroup.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	WebElement POCombobOX = driver.findElement(By.xpath("//div[@id='(LIST)COMBO_0']"));
	POCombobOX.click();
	POCombobOX.sendKeys(Keys.DOWN);
	POCombobOX.sendKeys(Keys.DOWN);
	test.log(Status.PASS, "Approving PO");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='(OK)']")).click();
	Thread.sleep(3000);
	WebElement btnExit =driver.findElement(By.xpath("//div[@id='_OBJ_N67171']"));
	btnExit.click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='(OK)']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='(OK)']")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("TOOLBAR_SPLITBUTTON1")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("TOOLBAR_SPLITBUTTON1")).sendKeys(Keys.SHIFT,"X") ;
	Thread.sleep(6000);
	test.log(Status.PASS, "Logged off");


}

}

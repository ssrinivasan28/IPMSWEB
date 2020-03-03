package com.islandpacific.ipmsweb.test.purchaseordermanagement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.islandpacific.ipmsweb.base.BaseTest;

public class PurchaseOrderChange extends BaseTest {

	@Test
	public void defPurchaseOrderChange() throws Exception {
		test = extent.createTest("Purchase Order Chnage");
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		WebElement menuMerchandise = driver.findElement(By.xpath("//div[@id='LABEL1_0']"));
		test.log(Status.PASS, "Merchandise  Menu Clicked");
		menuMerchandise.click();
		Thread.sleep(5000);
		WebElement menuPoManagement = driver.findElement(By.xpath("//div[@id='LABEL4_4']"));
		menuPoManagement.click();
		test.log(Status.PASS, "PO Management  Menu Clicked");
		
		Thread.sleep(5000);
		WebElement menuPoChange = driver.findElement(By.xpath("//div[@id='LABEL4_2']"));
		menuPoChange.click();	
		test.log(Status.PASS, "PO Change  Menu Clicked");
		WebElement txtLocatePO = driver.findElement(By.xpath("//*[@id=\"_OBJ_N65707\"]"));
		txtLocatePO.sendKeys(com.islandpacific.testdata.purchaseorder.InputPOEntry.BlockOutEntry());
		test.log(Status.PASS, "PO Details Entered");
		Thread.sleep(3000);
	//	txtLocatePO.sendKeys(Keys.ENTER);
		WebElement chkboxChangeVendorComments = driver.findElement(By.xpath("//div[@id='_OBJ_N65918']"));
		chkboxChangeVendorComments.click();
		test.log(Status.PASS, "Change Vendor Comments");
		WebElement chkboxChangeInternalComments = driver.findElement(By.xpath("//div[@id='_OBJ_N65960']"));
		chkboxChangeInternalComments.click();
		test.log(Status.PASS, "Change Internal Comments");
		WebElement chkboxChangeTicketingInstructions =driver.findElement(By.xpath("//div[@id='_OBJ_N66002']"));
		chkboxChangeTicketingInstructions.click();
		test.log(Status.PASS, "Change Ticketing Instruction");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(3000);
		WebElement txtVendorComments = driver.findElement(By.xpath("//input[@id='_OBJ_N65692']"));
		txtVendorComments.clear();
		txtVendorComments.sendKeys("AUTOMATED VENDOR COMMENTS");
		test.log(Status.PASS, " Vendor Comments Modified");
		WebElement txtInternalComments = driver.findElement(By.xpath("//input[@id='_OBJ_N65983']"));
		txtInternalComments.clear();
		txtInternalComments.sendKeys("AUTOMATED INTERNAL COMMENTS");
		test.log(Status.PASS, " Internal Comments Modified");
		WebElement txtTicketingInstructions = driver.findElement(By.xpath("//input[@id='_OBJ_N66206']"));
		txtTicketingInstructions.clear();
		txtTicketingInstructions.sendKeys("AUTOMATED TICKETIG COMMENTS");
		test.log(Status.PASS, "Ticketing Instructions Modified");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(3000);
		WebElement btnExit = driver.findElement(By.xpath("//div[@id='_OBJ_N66151']"));
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

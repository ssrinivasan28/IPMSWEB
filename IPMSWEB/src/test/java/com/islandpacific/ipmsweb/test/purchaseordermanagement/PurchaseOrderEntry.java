package com.islandpacific.ipmsweb.test.purchaseordermanagement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.islandpacific.ipmsweb.base.BaseTest;
import com.islandpacific.ipmsweb.util.JiraPolicy;

public class PurchaseOrderEntry extends BaseTest {

	@JiraPolicy(logTicketReady=true)
	@Test(priority=1, enabled=true)

	public void poEntry() throws Exception {

		test = extent.createTest("Purchase Order Entry");
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		WebElement menuMerchandise = driver.findElement(By.xpath("//div[@id='LABEL1_0']"));
		menuMerchandise.click();
		test.log(Status.PASS, "Merchandise Menu Clicked");
		Thread.sleep(5000);
		WebElement menuPoManagement = driver.findElement(By.xpath("//div[@id='LABEL4_5']"));
		menuPoManagement.click();
		test.log(Status.PASS, "Purchase Management Menu Clicked");
		Thread.sleep(5000);
		WebElement menuPOEntry = driver.findElement(By.xpath("//div[@id='LABEL4_0']"));
		menuPOEntry.click();
		test.log(Status.PASS, "Purchase Entry Menu Clicked");
		Thread.sleep(3000);
		WebElement txtFileGroup = driver.findElement(By.xpath("//input[@id='WFGP']"));
		txtFileGroup.clear();
	//	txtFileGroup.sendKeys("700");
		txtFileGroup.sendKeys(com.islandpacific.testdata.purchaseorder.InputPOEntry.FileGroupEntry());
		
		test.log(Status.PASS, "File Group Entered");
		txtFileGroup.sendKeys(Keys.ENTER);
		WebElement txtBlockOut = driver.findElement(By.xpath("//input[@id='_OBJ_N65865']"));
		txtBlockOut.clear();
	//	txtBlockOut.sendKeys("SSR2009194");
		txtBlockOut.sendKeys(com.islandpacific.testdata.purchaseorder.InputPOEntry.BlockOutEntry());
		test.log(Status.PASS, "Blockout Entered");
		txtBlockOut.sendKeys(Keys.ENTER);
		WebElement chkbockout = driver.findElement(By.xpath("//div[@id='_OBJ_N65690']"));
		chkbockout.click();
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(3000);
		WebElement txtVendor = driver.findElement(By.xpath("//input[@id='_OBJ_N65873']"));
		txtVendor.clear();
		//txtVendor.sendKeys(com.islandpacific.testdata.purchaseorder.InputPOEntry.VendorEntry());
		txtVendor.sendKeys("055586");
		test.log(Status.PASS, "Vendor Details Entered");
		txtVendor.sendKeys(Keys.ENTER);
		WebElement PoTemplateOK = driver.findElement(By.xpath("//input[@id='_OBJ_N65675']"));
		Actions POTemplate = new Actions(driver);
		POTemplate.moveToElement(PoTemplateOK).build().perform();
		PoTemplateOK.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement txtDepartment = driver.findElement(By.xpath("//input[@id='_OBJ_N66044']"));
		txtDepartment.clear();
		txtDepartment.sendKeys(com.islandpacific.testdata.purchaseorder.InputPOEntry.DepartMentEntry());
		test.log(Status.PASS, "Department Details Entered");
		Thread.sleep(3000);
		WebElement txtShipToStore = driver.findElement(By.xpath("//input[@id='_OBJ_N68285']"));
		txtShipToStore.clear();
		txtShipToStore.sendKeys("00586");
		test.log(Status.PASS, "Shp to Store Entered");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(3000);
		/*WebElement btnMode = driver.findElement(By.xpath("//div[@id='_OBJ_N67094']"));
		btnMode.click();*/
		WebElement txtSKU = driver.findElement(By.xpath("//input[@id='_OBJ_N66048']"));
		txtSKU.clear();
		//txtSKU.sendKeys(com.islandpacific.testdata.purchaseorder.InputPOEntry.SKUEntry());
		txtSKU.sendKeys("0000115675");
		test.log(Status.PASS, "SKU detauks Entered");
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		WebElement txtQuantity = driver.findElement(By.xpath("//input[@id='_OBJ_N66275']"));
		txtQuantity.clear();
		txtQuantity.sendKeys(com.islandpacific.testdata.purchaseorder.InputPOEntry.QtyEntry());
		test.log(Status.PASS, "PO Qty Entered");
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		WebElement btnContinue = driver.findElement(By.xpath("//div[contains(text(),'Continue')]"));
		btnContinue.click();
		Thread.sleep(3000);
		WebElement btnContinuePage2 = driver.findElement(By.xpath("//div[contains(text(),'Continue')]"));
		btnContinuePage2.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		System.out.println("Click");
		Thread.sleep(3000);
		driver.findElement(By.id("TOOLBAR_SPLITBUTTON1")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("TOOLBAR_SPLITBUTTON1")).sendKeys(Keys.SHIFT,"X") ;
		test.log(Status.PASS, "Logged off");
		//Thread.sleep(6000);
	//	signOff();
		
		
		
		
		
		
		
	}

}

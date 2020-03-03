package com.islandpacific.ipmsweb.distribution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.islandpacific.ipmsweb.base.BaseTest;

public class InteractiveItemTransfer extends BaseTest {

	@Test
	public void IITransfer() throws Exception {
		test = extent.createTest("Interactive Item Transfer");
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		WebElement menuMerchandise = driver.findElement(By.xpath("//div[@id='LABEL1_0']"));
		menuMerchandise.click();
		test.log(Status.PASS, "Merchandising Menu Selected");
		Thread.sleep(3000);
		WebElement menuDistribution = driver.findElement(By.xpath("//div[@id='LABEL4_10']"));
		menuDistribution.click();
		test.log(Status.PASS, "Distribution Menu Selected");
		Thread.sleep(3000);
		WebElement menuInteractiveItemTransfer = driver.findElement(By.xpath("//div[@id='LABEL4_3']"));
		menuInteractiveItemTransfer.click();
		Thread.sleep(3000);
		WebElement txtFileGroup = driver.findElement(By.xpath("//input[@id='WFGP']"));
		txtFileGroup.clear();
		txtFileGroup.sendKeys("700");
		test.log(Status.PASS, "File Group is Entered");
		txtFileGroup.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		//driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		/*WebElement itemMode =driver.findElement(By.xpath("//div[@id='_OBJ_N10091']"));
		itemMode.click();*/
		WebElement txtSku = driver.findElement(By.xpath("//input[@id='_OBJ_N10126']"));
		txtSku.clear();
		txtSku.sendKeys("0000062950");
		test.log(Status.PASS, "SKU is entered");
		WebElement txtToStore = driver.findElement(By.xpath("//input[@id='_OBJ_N102E7']"));
		txtToStore.clear();
		txtToStore.sendKeys("00587");
		test.log(Status.PASS, "Destination Store Entered");
		WebElement txtFromStore = driver.findElement(By.xpath("//input[@id='_OBJ_N102A8']"));
		txtFromStore.clear();
		txtFromStore.sendKeys("00586");
		test.log(Status.PASS, "Issuing Store Entered");
		//txtFromStore.sendKeys(Keys.ENTER);
	//	driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		//Thread.sleep(3000);
		WebElement txtTransferQty = driver.findElement(By.xpath(" //input[@id='_OBJ_N10559']"));
		txtTransferQty.clear();
		txtTransferQty.sendKeys("5");
		test.log(Status.PASS, "Transfer Qty Entered");
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
	
	//	test.log(Status.PASS, "Transfer Qty Entered");
		WebElement transvalue = driver.findElement(By.xpath("//input[@id='LSTCOL2_0']"));
		transvalue.clear();
		transvalue.sendKeys("5");
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		WebElement btnReview = driver.findElement(By.xpath("//div[@id='_OBJ_N10672']"));
		btnReview.click();
		test.log(Status.PASS, "Review Screen");
		WebElement btnExpand = driver.findElement(By.xpath("//img[@id='_OBJ_N65807']"));
		btnExpand.click();
		Thread.sleep(3000);
		WebElement btnCondense = driver.findElement(By.xpath("//img[@id='_OBJ_N65807']"));
		btnCondense.click();
		test.log(Status.PASS, "Expand Screen");
		WebElement btnContinue = driver.findElement(By.xpath("//div[@id='_OBJ_N1063D']"));
		btnContinue.click();
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		WebElement rbuttonFileUpdates = driver.findElement(By.xpath("//div[@id='_OBJ_N65854']"));
		rbuttonFileUpdates.click();
		
		for (int i=0; i<3;i++)
		{
			
			driver.findElement(By.xpath("//div[@id='(OK)']")).click();
			Thread.sleep(2000);
			
			
		};
		driver.findElement(By.id("TOOLBAR_SPLITBUTTON1")).click();
		driver.findElement(By.id("TOOLBAR_SPLITBUTTON1")).sendKeys(Keys.SHIFT, "X");
		Thread.sleep(3000);
		test.log(Status.PASS, "User Logged Off");

		

	}

}

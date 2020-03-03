/**
 * 
 */
package com.islandpacific.ipmsweb.financialmiscoptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.islandpacific.ipmsweb.base.BaseTest;

/**
 * @author SSrinivasan
 * @creation date 03-Mar-20202:10:04 pm
 * @description
 */
public class EnterFreightDutyWriteOffs extends BaseTest {

	@Test

	public void defEnterFreightDutyWriteOffs() throws Exception {
		test = extent.createTest("Enter Freight/Duty Write Offs");
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		WebElement menuFinancials = driver.findElement(By.xpath("//div[@id='LABEL1_4']"));
		test.log(Status.PASS, "Financials  Menu Clicked");
		menuFinancials.click();
		Thread.sleep(2000);
		WebElement menuFinanceMisOperations = driver.findElement(By.xpath("//div[@id='LABEL4_8']"));
		menuFinanceMisOperations.click();
		Thread.sleep(2000);
		WebElement menuEnterFandDWriteOffs = driver.findElement(By.xpath("//div[@id='LABEL4_6']"));
		menuEnterFandDWriteOffs.click();
		Thread.sleep(2000);
		WebElement rButtonOpCompany = driver.findElement(By.xpath("//div[@id='(LIST)RADIO_0']"));
		rButtonOpCompany.click();
		test.log(Status.PASS, "Default Operating Company Selected");
		WebElement btnSelectOpCompany = driver.findElement(By.xpath("//div[@id='_OBJ_N65671']"));
		btnSelectOpCompany.click();
		WebElement txtFileGroup = driver.findElement(By.xpath("//input[@id='WFGP']"));
		txtFileGroup.clear();
		txtFileGroup.sendKeys(
				com.islandpacific.ipmsweb.testdata.financialmisoperations.TestDataFinancialFrieghtDutyWriteOffs
						.FileGroup());
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(3000);
		WebElement txtReceiptNumber = driver.findElement(By.xpath("//input[@id='_OBJ_N65772']"));
		txtReceiptNumber.clear();
		txtReceiptNumber.sendKeys(
				com.islandpacific.ipmsweb.testdata.financialmisoperations.TestDataFinancialFrieghtDutyWriteOffs
						.InvoiceNumber());
		txtReceiptNumber.sendKeys(Keys.ENTER);
		// driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		WebElement txtWriteOffAmount = driver.findElement(By.xpath("//input[@id='_OBJ_N66038']"));
		txtWriteOffAmount.clear();
		txtWriteOffAmount.sendKeys("10");
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(3000);
		WebElement btnReview = driver.findElement(By.xpath("//div[@id='_OBJ_N66070']"));
		btnReview.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(2000);
		WebElement btnContinue = driver.findElement(By.xpath("//div[@id='_OBJ_N65964']"));
		btnContinue.click();
		WebElement cboxPrintReport = driver.findElement(By.xpath("//div[@id='_OBJ_N65689']"));
		cboxPrintReport.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		signoffSession();

	}

}

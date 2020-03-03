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
 * @creation date 03-Mar-2020 2:51:37 PM
 * @description
 */
public class ProcessFrightDutyWriteOffs extends BaseTest {

	@Test

	public void defProcessFrightDutyWriteOffs() throws Exception {

		test = extent.createTest("Process Freight/Duty Write Offs");
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		WebElement menuFinancials = driver.findElement(By.xpath("//div[@id='LABEL1_4']"));
		test.log(Status.PASS, "Financials  Menu Clicked");
		menuFinancials.click();
		Thread.sleep(2000);
		WebElement menuFinanceMisOperations = driver.findElement(By.xpath("//div[@id='LABEL4_8']"));
		menuFinanceMisOperations.click();
		Thread.sleep(2000);
		WebElement menuEnterFandDWriteOffs = driver.findElement(By.xpath("//div[@id='LABEL4_7']"));
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
		txtFileGroup.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement txtFileGroupGenerlLedger = driver.findElement(By.xpath("//input[@id='WFGP']"));
		txtFileGroupGenerlLedger.clear();
		txtFileGroupGenerlLedger.sendKeys(
				com.islandpacific.ipmsweb.testdata.financialmisoperations.TestDataFinancialFrieghtDutyWriteOffs
						.FileGroup());
		txtFileGroupGenerlLedger.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(2000);
		signoffSession();

	}

}

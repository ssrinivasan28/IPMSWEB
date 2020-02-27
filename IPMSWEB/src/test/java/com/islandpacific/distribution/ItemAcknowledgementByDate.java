package com.islandpacific.distribution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.islandpacific.base.BaseTest;
import com.islandpacific.util.JiraPolicy;

public class ItemAcknowledgementByDate extends BaseTest {

	@JiraPolicy(logTicketReady=true)
	@Test(priority=1, enabled=true)
	public void itemAckByDate() throws Exception {
		test = extent.createTest("Interactive Item Transfer");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		WebElement menuMerchandise = driver.findElement(By.xpath("//div[@id='LABEL1_0']"));
		menuMerchandise.click();

		Thread.sleep(3000);
		WebElement menuDistribution = driver.findElement(By.xpath("//div[@id='LABEL4_11']"));
		menuDistribution.click();
		Thread.sleep(3000);

		for (int i = 0; i < 10; i++) {
			driver.findElement(By.xpath("//div[@class='qx-scrollbar-vertical']//div[3]")).click();

		}

		WebElement menuItemAckByDate = driver.findElement(By.xpath("//div[@id='LABEL4_23']"));
		menuItemAckByDate.click();
		Thread.sleep(3000);
		WebElement txtFileGroup = driver.findElement(By.xpath("//input[@id='WFGP']"));
		txtFileGroup.clear();
		txtFileGroup.sendKeys("500");
		txtFileGroup.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		WebElement fromMonth = driver.findElement(By.xpath("//input[@id='_OBJ_N10155']"));
		fromMonth.clear();
		fromMonth.sendKeys("08");
		WebElement fromDate = driver.findElement(By.xpath("//input[@id='_OBJ_N10180']"));
		fromDate.clear();
		fromDate.sendKeys("19");
		WebElement fromYear = driver.findElement(By.xpath("//input[@id='_OBJ_N101AB']"));
		fromYear.clear();
		fromYear.sendKeys("19");
		WebElement toMonth = driver.findElement(By.xpath("//input[@id='_OBJ_N2']"));
		toMonth.clear();
		toMonth.sendKeys("08");
		WebElement toDate = driver.findElement(By.xpath("//input[@id='_OBJ_N3']"));
		toDate.clear();
		toDate.sendKeys("19");
		WebElement toYear = driver.findElement(By.xpath("//input[@id='_OBJ_N101AB1']"));
		toYear.clear();
		toYear.sendKeys("19");
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(3000);
		WebElement rbuttonIssueStore = driver.findElement(By.xpath("//div[@id='_OBJ_N65848']"));
		rbuttonIssueStore.click();
		WebElement txtStore = driver.findElement(By.xpath("//input[@id='_OBJ_N66167']"));
		txtStore.clear();
		txtStore.sendKeys("00586");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(3000);
		WebElement rbuttonDestinationStore = driver.findElement(By.xpath("//div[@id='_OBJ_N65848']"));
		rbuttonDestinationStore.click();
		WebElement txtDesStore = driver.findElement(By.xpath("//input[@id='_OBJ_N66167']"));
		txtDesStore.clear();
		txtDesStore.sendKeys("00587");
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(3000);
		WebElement btnReview = driver.findElement(By.xpath("//*[@id=\"_OBJ_N10455\"]"));
		btnReview.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(3000);
		WebElement btnContinue = driver.findElement(By.xpath("//*[@id=\"_OBJ_N10418\"]"));
		btnContinue.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();

		Thread.sleep(3000);

		System.out.println("Click");
		driver.findElement(By.id("TOOLBAR_SPLITBUTTON1")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("TOOLBAR_SPLITBUTTON1")).sendKeys(Keys.SHIFT, "X");
		Thread.sleep(3000);

	}

}

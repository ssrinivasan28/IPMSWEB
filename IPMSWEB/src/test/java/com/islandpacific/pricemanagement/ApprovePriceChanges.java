/**
 * 
 */
package com.islandpacific.pricemanagement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.islandpacific.base.BaseTest;

/**
 * @author SSrinivasan
 *
 */
public class ApprovePriceChanges extends BaseTest {

	@Test
	public void ApprovePC() throws Exception {
		test = extent.createTest("Approve Price Changes");
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		WebElement menuMerchandise = driver.findElement(By.xpath("//div[@id='LABEL1_0']"));
		menuMerchandise.click();

		Thread.sleep(3000);
		WebElement menuPricing = driver.findElement(By.xpath("//div[@id='LABEL4_13']"));
		menuPricing.click();
		Thread.sleep(3000);
		WebElement menuApprovePC = driver.findElement(By.xpath("//div[@id='LABEL4_2']"));
		menuApprovePC.click();
		Thread.sleep(3000);
		WebElement locatPCSession = driver.findElement(By.xpath("//input[@id='_OBJ_N65757']"));
		locatPCSession.clear();
		locatPCSession.sendKeys("ABCD4501");
		//locatPCSession.sendKeys(com.islandpacific.testdata.InputEnterPriceChanges.SessionDescription());
		locatPCSession.sendKeys(Keys.ENTER);
		WebElement comboSelect =driver.findElement(By.xpath("//div[@id='(LIST1)COMBO_0']"));
		comboSelect.click();
		for (int i = 0; i <= 2; i++) {
			comboSelect.sendKeys(Keys.DOWN);
			Thread.sleep(3000);

		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(3000);
		WebElement btnExit = driver.findElement(By.xpath("//div[@id='_OBJ_N68050']"));
		btnExit.click();
		Thread.sleep(3000);
		System.out.println("Click");
		driver.findElement(By.id("TOOLBAR_SPLITBUTTON1")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("TOOLBAR_SPLITBUTTON1")).sendKeys(Keys.SHIFT,"X") ;
		Thread.sleep(6000);

		
	}

}

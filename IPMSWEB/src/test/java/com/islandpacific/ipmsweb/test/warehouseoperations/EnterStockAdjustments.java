/**
 * 
 */
package com.islandpacific.ipmsweb.test.warehouseoperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.islandpacific.ipmsweb.base.BaseTest;
import com.islandpacific.ipmsweb.util.JiraPolicy;

/**
 * @author SSrinivasan
 *
 */
public class EnterStockAdjustments  extends BaseTest {

	@JiraPolicy(logTicketReady=true)
	@Test(priority=1, enabled=true)

	
	public void enterStockAdj() throws Exception {
		test = extent.createTest("Enter Stock Adjustments");
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		WebElement menuWarehouse =driver.findElement(By.xpath("//div[@id='LABEL1_3']"));
		menuWarehouse.click();
		Thread.sleep(5000);
		WebElement menuEnterStockAdjustments =driver.findElement(By.xpath("//div[@id='LABEL4_4']"));
		menuEnterStockAdjustments.click();
		Thread.sleep(5000);
		WebElement txtWarehouseSelection = driver.findElement(By.xpath("//input[@id='_OBJ_N65646']"));
		txtWarehouseSelection.clear();
		txtWarehouseSelection.sendKeys("00586");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		WebElement txtFileGroup = driver.findElement(By.xpath("//input[@id='WFGP']"));
		txtFileGroup.clear();
		txtFileGroup.sendKeys("600");
		txtFileGroup.sendKeys(Keys.ENTER);
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		WebElement btnModeToSku =driver.findElement(By.xpath("//div[@id='_OBJ_N66826']"));
		btnModeToSku.click();
		Thread.sleep(3000);
		WebElement txtLoc1 = driver.findElement(By.xpath("//input[@id='_OBJ_N65718']"));
		txtLoc1.sendKeys("RD");
		WebElement txtLoc2 = driver.findElement(By.xpath("//input[@id='_OBJ_N65762']"));
		txtLoc2.sendKeys("SD");
		WebElement txtLoc3 =driver.findElement(By.xpath("//input[@id='_OBJ_N65806']"));
		txtLoc3.sendKeys("LD");
		WebElement txtBiNumber = driver.findElement(By.xpath("//input[@id='_OBJ_N65872']"));
		txtBiNumber.clear();
		txtBiNumber.sendKeys("578600014");
		WebElement txtSKU = driver.findElement(By.xpath("//input[@id='_OBJ_N66028']"));
		txtSKU.clear();
		txtSKU.sendKeys("0000230011");
		WebElement txtQty =driver.findElement(By.xpath("//input[@id='_OBJ_N66437']"));
		txtQty.clear();
		txtQty.sendKeys("100");
		WebElement txtResaonCode = driver.findElement(By.xpath("//input[@id='_OBJ_N66500']"));
		txtResaonCode.clear();
		txtResaonCode.sendKeys("A");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(3000);
		WebElement btnReview = driver.findElement(By.xpath("//div[@id='_OBJ_N66765']"));
		btnReview.click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@id='_OBJ_N66291']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='_OBJ_N66659']")).click();
		Thread.sleep(3000);
		System.out.println("Click");
		driver.findElement(By.id("TOOLBAR_SPLITBUTTON1")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("TOOLBAR_SPLITBUTTON1")).sendKeys(Keys.SHIFT, "X");
		Thread.sleep(3000);



		
		
	

}
}
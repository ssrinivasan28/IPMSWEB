package com.islandpacific.ipmsweb.test.definetestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.islandpacific.ipmsweb.base.BaseTest;
import com.islandpacific.ipmsweb.util.ScreenRecord;

public class DefineItems extends BaseTest {
	
/**
 * @throws Exception
 */
@Test 
public void DefineItem() throws Exception
{
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	test = extent.createTest("Define Zone");
	ScreenRecord.startRecording("Define Items");
	
	driver.manage().timeouts().implicitlyWait(600,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"LABEL1_0\"]")).click();
	
	test.log(Status.PASS, "Merchandising Menu Selected");
	driver.findElement(By.xpath("//*[@id=\"LABEL4_2\"]")).click();
	
	test.log(Status.PASS, "Constant Defination Selected");
	Thread.sleep(4000);
	
	
	WebElement MenuDefineItem = driver.findElement(By.cssSelector("#LABEL4_0"));
	MenuDefineItem.click();
	test.log(Status.PASS, "Define Items Menu Clicked");
	
	WebElement ItemClass = driver.findElement(By.id("_OBJ_N66067"));
	ItemClass.clear();
	ItemClass.sendKeys("5786");
	test.log(Status.PASS, "Class is Entered");
	
	
	WebElement ItemVendor = driver.findElement(By.id("_OBJ_N66111"));
	ItemVendor.clear();
	ItemVendor.sendKeys("055586");
	test.log(Status.PASS, "Vendor is Entered");
	
	
	WebElement ItemStyle = driver.findElement(By.id("_OBJ_N66309"));
	ItemStyle.clear();
	ItemStyle.sendKeys("0201818");
	test.log(Status.PASS, "Style is Entered");
	
	
	
	WebElement ItemColor = driver.findElement(By.id("_OBJ_N66353"));
	ItemColor.clear();
	ItemColor.sendKeys("0004");
	test.log(Status.PASS, "Color is Entered");
	

	WebElement ItemSize = driver.findElement(By.id("_OBJ_N66397"));
	ItemSize.clear();
	ItemSize.sendKeys("00004");
	test.log(Status.PASS, "Size is Entered");
	
	
	driver.findElement(By.id("(OK)")).click();
	test.log(Status.PASS, "OK Button is Cliked");
	Thread.sleep(5000); 
	
	
	
	
	
	WebElement ItemDescription = driver.findElement(By.id("_OBJ_N65820"));
	ItemDescription.clear();
	ItemDescription.sendKeys("SSR ITEM");
	test.log(Status.PASS, "Item Description Entered");
	WebElement ItemsShortDescription = driver.findElement(By.id("_OBJ_N65976"));
	ItemsShortDescription.clear();
	ItemsShortDescription.sendKeys("SSR ITEM");
	test.log(Status.PASS, "Item Short Description Entered");
	Thread.sleep(3000);
	WebElement TabItemIdentification = driver.findElement(By.xpath("//*[@id=\"_OBJ_N65651\"]/div[1]/div/div/div[2]/div"));
	TabItemIdentification.click();
	Thread.sleep(3000);
	WebElement TxtItemVendorStyle = driver.findElement(By.id("_OBJ_N67368"));
	TxtItemVendorStyle.sendKeys("0201812");
	test.log(Status.PASS, "Item Vendor Style Entered");
	Thread.sleep(3000);
	WebElement TabRateAndCost = driver.findElement(By.xpath("//*[@id=\"_OBJ_N65651\"]/div[1]/div/div/div[3]/div"));
	TabRateAndCost.click();
	Thread.sleep(3000);
	
	WebElement TxtItemBookRetail = driver.findElement(By.id("_OBJ_N68190"));
	TxtItemBookRetail.clear();
	TxtItemBookRetail.sendKeys("10");
	test.log(Status.PASS, "Item Book Retail Entered");
	
	WebElement TxtItemSuggestedRetail = driver.findElement(By.id("_OBJ_N68320"));
	TxtItemSuggestedRetail.clear();
	TxtItemSuggestedRetail.sendKeys("10");
	test.log(Status.PASS, "Item Suggested Retail Entered");
	WebElement TxtItemOriginalRetail = driver.findElement(By.id("_OBJ_N68450"));
	TxtItemOriginalRetail.clear();
	TxtItemOriginalRetail.sendKeys("10");
	test.log(Status.PASS, "Item Original Retail Entered");
	WebElement TxtItemPLURetail = driver.findElement(By.id("_OBJ_N68580"));
	TxtItemPLURetail.clear();
	TxtItemPLURetail.sendKeys("10");
	test.log(Status.PASS, "Item PLU Retail Entered");
	WebElement TxtItemAletrnatePLURetail = driver.findElement(By.id("_OBJ_N68710"));
	TxtItemAletrnatePLURetail.clear();
	TxtItemAletrnatePLURetail.sendKeys("10");
	
	WebElement TxtItemLastVendorCost = driver.findElement(By.id("_OBJ_N69221"));
	TxtItemLastVendorCost.clear();
	TxtItemLastVendorCost.sendKeys("8.8");
	test.log(Status.PASS, "Item PLU Alternate Retail Entered");
	driver.findElement(By.id("(OK)")).click();
	Thread.sleep(5000);
	
	while (driver.findElement(By.id("(OK)")).isDisplayed())
	{
		
		driver.findElement(By.id("(OK)")).click();
		Thread.sleep(6000);
		
		
	}
	
	Thread.sleep(6000);
	
	
	ScreenRecord.stopRecording();
	
	

}

}

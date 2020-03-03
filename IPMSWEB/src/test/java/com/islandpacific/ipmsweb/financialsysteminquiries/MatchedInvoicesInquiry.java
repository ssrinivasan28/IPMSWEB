/**
 * 
 */
package com.islandpacific.ipmsweb.financialsysteminquiries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.islandpacific.ipmsweb.base.BaseTest;

/**
 * @author SSrinivasan
 * @creation-date 03-Mar-202011:07:39 am
 * @description - 
 */
public class MatchedInvoicesInquiry extends BaseTest {
	
	
@Test
public void defMatchedInvoicesInquiry() throws Exception
{
	
	
	test = extent.createTest("Matched Invoices Inquiry");
	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	WebElement menuMerchandise = driver.findElement(By.xpath("//div[@id='LABEL1_0']"));
	test.log(Status.PASS, "Merchandise  Menu Clicked");
	menuMerchandise.click();
	Thread.sleep(5000);
	
	
	
	
	




}
	
	

}

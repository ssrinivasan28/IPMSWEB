/**
 * 
 */
package com.islandpacific.ipmsweb.financialsysteminquiries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	WebElement menuFinancials = driver.findElement(By.xpath("//div[@id='LABEL1_4']"));
	test.log(Status.PASS, "Financials  Menu Clicked");
	menuFinancials.click();
	Thread.sleep(2000);
	WebElement menuFinancialSystemInquiries = driver.findElement(By.xpath("//div[@id='LABEL4_0']"));
	menuFinancialSystemInquiries.click();
	Thread.sleep(2000);
	WebElement menuMatchedInvoicesInquiry = driver.findElement(By.xpath("//div[@id='LABEL4_4']"));
	menuMatchedInvoicesInquiry.click();
	test.log(Status.PASS, "Matched Invoices Inquiry Clicked");
	Thread.sleep(2000);
	WebElement rButtonOpCompany = driver.findElement(By.xpath("//div[@id='(LIST)RADIO_0']"));
	rButtonOpCompany.click();
	test.log(Status.PASS, "Default Operating Company Selected");
	WebElement btnSelectOpCompany = driver.findElement(By.xpath("//div[@id='_OBJ_N65671']"));
	btnSelectOpCompany.click();
	WebElement searchVendorNumber = driver.findElement(By.xpath("//div[@id='_OBJ_N65627']"));
	searchVendorNumber.click();
	WebElement txtLocateVendor = driver.findElement(By.xpath("//input[@id='_OBJ_N65725']"));
	txtLocateVendor.clear();
	txtLocateVendor.sendKeys(com.islandpacific.ipmsweb.testdata.financeinquiry.TestDataMatchedInvoicesInquiry.VendorNumber());
	test.log(Status.PASS, "Vendor Details Entered");
	txtLocateVendor.sendKeys(Keys.ENTER);
	WebElement chkboxVendor =  driver.findElement(By.xpath("//div[@id='(LIST)CHECK_0']"));
	chkboxVendor.click();
	WebElement btnSelectVendor = driver.findElement(By.xpath("//div[@id='762T1FD_N65825']"));
	btnSelectVendor.click();
	WebElement txtInvoiceChargebackNumber = driver.findElement(By.xpath("//input[@id='_OBJ_N65802']"));
	txtInvoiceChargebackNumber.clear();
	txtInvoiceChargebackNumber.sendKeys(com.islandpacific.ipmsweb.testdata.financeinquiry.TestDataMatchedInvoicesInquiry.InvoiceNumber());
	Thread.sleep(1000);
	test.log(Status.PASS, "Invoice Details Entered");
	driver.findElement(By.xpath("//div[@id='(OK)']")).click();
	WebElement cboxReceipt = driver.findElement(By.xpath("//div[@id='(LIST)CHECK_0']"));
	cboxReceipt.click();
	test.log(Status.PASS, "Receipt checkbox of the Invoice selected");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@id='(OK)']")).click();
	Thread.sleep(2000);
	WebElement cboxItem = driver.findElement(By.xpath("//div[@id='(LIST)CHECK_0']"));
	cboxItem.click();
	test.log(Status.PASS, "Item checkbox of the Invoice selected");
	
	WebElement btnItem = driver.findElement(By.xpath("//div[@id='_OBJ_N65784']"));
	btnItem.click();
	Thread.sleep(1000);
	test.log(Status.PASS, "Item button clicked");
	WebElement btnExpandItemLevel = driver.findElement(By.xpath("//img[@id='_OBJ_N66316']"));
	btnExpandItemLevel.click();
	test.log(Status.PASS, "Expand grid at Item Level");
	Thread.sleep(2000);
	WebElement btnCondenseItemLevel = driver.findElement(By.xpath("//img[@id='_OBJ_N66316']"));
	btnCondenseItemLevel.click();
	test.log(Status.PASS, "Condense  grid at Item Level");
	Thread.sleep(2000);
	WebElement btnCancel =driver.findElement(By.xpath("//div[@id='_OBJ_N66728']"));
	btnCancel.click();
	Thread.sleep(2000);
	WebElement btnExpandReceiptLevel = driver.findElement(By.id("_OBJ_N65814"));
	btnExpandReceiptLevel.click();
	test.log(Status.PASS, "Expand grid at Receipt Level");
	Thread.sleep(2000);
	WebElement btnCondenseReceiptLevel = driver.findElement(By.id("_OBJ_N65814"));;
	btnCondenseReceiptLevel.click();
	test.log(Status.PASS, "Condense  grid at Receipt Level");
	WebElement btnCancelReceiptLevel = driver.findElement(By.id("_OBJ_N66377"));
	btnCancelReceiptLevel.click();
	Thread.sleep(2000);
	WebElement btnCancelHeaderLevel = driver.findElement(By.id("_OBJ_N66635"));
	btnCancelHeaderLevel.click();
	WebElement btnExit =  driver.findElement(By.id("_OBJ_N66694"));
	btnExit.click();
	Thread.sleep(2000);
	test.log(Status.PASS, "Exit Procedure");
	System.out.println("Click");
	driver.findElement(By.id("TOOLBAR_SPLITBUTTON1")).click();
	Thread.sleep(1100);
	driver.findElement(By.id("TOOLBAR_SPLITBUTTON1")).sendKeys(Keys.SHIFT,"X") ;
	Thread.sleep(3000);
	test.log(Status.PASS, "Logged off");
	
	
			
	
	
	
	
	
	
	
	
	
	
	
	




}
	
	

}

package com.islandpacific.ipmsweb.test.accountspayableprocessing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.islandpacific.ipmsweb.base.BaseTest;

public class EnterInvoicesandCharbacks extends BaseTest{
	
@Test
public void enterInvoicesandChargeBacks() throws Exception
{
	
	
	WebElement menuFinancials  = driver.findElement(By.xpath("//div[@id='LABEL1_4']"));
	menuFinancials.click();
	WebElement menuAccountsPayableProcessing = driver.findElement(By.xpath("//div[@id='LABEL4_2']"));
	menuAccountsPayableProcessing.click();
	Thread.sleep(3000);
	WebElement menuEnterInvoicesandChargeBacks = driver.findElement(By.xpath("//div[@id='LABEL4_2']"));
	menuEnterInvoicesandChargeBacks.click();
	WebElement rdButtonCompany = driver.findElement(By.xpath("//div[@id='(LIST)RADIO_0']"));
	rdButtonCompany.click();
	WebElement btnSelect = driver.findElement(By.xpath("//div[contains(text(),'OK')]"));
	btnSelect.click();
	driver.findElement(By.xpath("//input[@id='WFGP']")).clear();
	driver.findElement(By.xpath("//input[@id='WFGP']")).sendKeys("700");
	driver.findElement(By.xpath("//div[contains(text(),'OK')]")).click();
	driver.findElement(By.xpath("//input[@id='_OBJ_N65725']")).sendKeys("000586");
	driver.findElement(By.xpath("//div[contains(text(),'OK')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'OK')]")).click();
	WebElement txtInviceNumber= driver.findElement(By.xpath("//input[@id='_OBJ_N65766']")) ;
	txtInviceNumber.clear();
	txtInviceNumber.sendKeys("4504504");
	WebElement dateInvCol1 =driver.findElement(By.xpath("//input[@id='_OBJ_N65766']"));
	dateInvCol1.clear();
	dateInvCol1.sendKeys("02");
	WebElement dateInvCol2 =driver.findElement(By.xpath("//input[@id='_OBJ_N66027']"));
	dateInvCol2.clear();
	dateInvCol2.sendKeys("20");
	WebElement dateInvCol3 =driver.findElement(By.xpath("//input[@id='_OBJ_N66070']"));
	dateInvCol3.clear();
	dateInvCol3.sendKeys("20");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}

}

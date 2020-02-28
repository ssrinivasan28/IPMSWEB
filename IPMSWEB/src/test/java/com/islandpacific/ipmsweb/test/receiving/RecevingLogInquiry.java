package com.islandpacific.ipmsweb.test.receiving;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.islandpacific.ipmsweb.base.BaseTest;

import net.bytebuddy.matcher.ModifierMatcher.Mode;

public class RecevingLogInquiry extends BaseTest {

	@Test

	public void RLogInquiry() throws Exception {
		test = extent.createTest("Receiving Log Inqruiy");
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		WebElement menuMerchandise = driver.findElement(By.xpath("//div[@id='LABEL1_0']"));
		menuMerchandise.click();
		test.log(Status.PASS, "Merchandise Menu Clicked");
		Thread.sleep(5000);
		WebElement menuReceiving = driver.findElement(By.xpath("//div[@id='LABEL4_5']"));
		menuReceiving.click();
		test.log(Status.PASS, "Receving Menu Clicked");
		Thread.sleep(5000);
		WebElement menuRLogInquiry = driver.findElement(By.xpath("//div[@id='LABEL4_10']"));
		menuRLogInquiry.click();
		test.log(Status.PASS, "Receving Log Menu Clicked");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		WebElement thirdChckBox = driver.findElement(By.xpath("//div[@id='(LIST)CHECK_3']"));
		thirdChckBox.click();
		test.log(Status.PASS, "Receving Number Selected");
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(3000);
		 WebElement btnOK = driver.findElement(By.xpath("//div[@id='(OK)']"));
		btnOK.click();
		Thread.sleep(3000);
		 WebElement btnOK2 = driver.findElement(By.xpath("//div[@id='(OK)']"));
		btnOK2.click();
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//div[@id='(LIST)CHECK1_3']"))

		WebElement thirdChckBox3 = driver.findElement(By.xpath("//div[@id='(LIST)CHECK1_3']"));
		thirdChckBox3.click();
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(3000);
		WebElement comboDisplay = driver.findElement(By.xpath("//div[@id='(LIST)COMBO_0']"));
		comboDisplay.click();
		comboDisplay.sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(3000);
		WebElement btnCancel = driver.findElement(By.xpath("//div[@id='_OBJ_N66796']"));
		btnCancel.click();
		Thread.sleep(3000);
		WebElement btnExit = driver.findElement(By.xpath("//div[@id='_OBJ_N66433']"));
		btnExit.click();
		System.out.println("Click");
		Thread.sleep(3000);
		driver.findElement(By.id("TOOLBAR_SPLITBUTTON1")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("TOOLBAR_SPLITBUTTON1")).sendKeys(Keys.SHIFT,"X") ;
		test.log(Status.PASS, "Logged off");
		/*WebElement btnMode = driver.findElement(By.xpath("//div[@id='_OBJ_N66513']"));
		btnMode.click();
		WebElement Order = driver.findElement(By.xpath("//div[@id='_OBJ_N65697']"));
	/*	Actions ActMode = new Actions(driver);
		ActMode.moveToElement(Order).click().build().perform();
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(3000);
		System.out.println("Click");
*/
	}

}

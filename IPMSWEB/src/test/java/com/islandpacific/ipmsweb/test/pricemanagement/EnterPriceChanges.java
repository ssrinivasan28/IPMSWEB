/**
 * 
 */
package com.islandpacific.ipmsweb.test.pricemanagement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.islandpacific.ipmsweb.base.BaseTest;
import com.islandpacific.ipmsweb.util.JiraPolicy;

/**
 * @author SSrinivasan
 * The following script will automate enter price changes with entry mode sku and at the chain level for a single item
 * 
 *
 */
public class EnterPriceChanges extends BaseTest {

	@JiraPolicy(logTicketReady=true)
	@Test(priority=1, enabled=true)
 
public void enterPC() throws Exception
{

		test = extent.createTest("Enter Price Changes");
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		WebElement menuMerchandise = driver.findElement(By.xpath("//div[@id='LABEL1_0']"));
		menuMerchandise.click();

		Thread.sleep(3000);
		WebElement menuPricing = driver.findElement(By.xpath("//div[@id='LABEL4_13']"));
		menuPricing.click();
		Thread.sleep(3000);
		WebElement menuEnterPriceChanges = driver.findElement(By.xpath("//div[@id='LABEL4_0']"));
		menuEnterPriceChanges.click();
		Thread.sleep(5000);
		WebElement txtSessionDescription = driver.findElement(By.xpath("//input[@id='_OBJ_N65849']"));
		txtSessionDescription.clear();
	/*	txtSessionDescription.sendKeys("SS1541"
				+ ""
				+ "");*/
//		txtSessionDescription.sendKeys(com.islandpacific.testdata.InputEnterPriceChanges.SessionDescription());
		txtSessionDescription.sendKeys("ABCD450133");
		WebElement chkboxPerMarkdown = driver.findElement(By.xpath("//div[@id='_OBJ_N65948']"));
		chkboxPerMarkdown.click();
		WebElement btnAdd = driver.findElement(By.xpath("//div[@id='_OBJ_N66188']"));
		btnAdd.click();
		Thread.sleep(3000);
		WebElement txtSKU = driver.findElement(By.xpath("//input[@id='_OBJ_N65885']"));
		txtSKU.clear();
//		txtSKU.sendKeys(com.islandpacific.testdata.InputEnterPriceChanges.SkUDetails());
		txtSKU.sendKeys("0000115675");

		/*WebElement txtClass = driver.findElement(By.xpath("//input[@id='_OBJ_N67592']"));
		txtClass.clear();
		txtClass.sendKeys("5786");*/
		WebElement faceility = driver.findElement(By.xpath("//input[@id='_OBJ_N67435']"));
		faceility.clear();
		faceility.sendKeys("P");
		
		WebElement txtPriceGroup = driver.findElement(By.xpath("//input[@id='_OBJ_N67592']"));
		txtPriceGroup.clear();
		txtPriceGroup.sendKeys("CHN");
		WebElement magReason = driver.findElement(By.xpath("//div[@id='_OBJ_N67745']"));
		magReason.click();
		WebElement combatt = driver.findElement(By.xpath("//div[@id='(LIST)COMBO_0']"));
		combatt.click();
		combatt.sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(3000);
		
		WebElement txtNewBookRetail = driver.findElement(By.xpath("//*[@id=\"_OBJ_N7_0\"]"));
		txtNewBookRetail.clear();
		txtNewBookRetail.sendKeys(com.islandpacific.ipmsweb.testdata.constantdefinations.InputEnterPriceChanges.BookRetail());
		Thread.sleep(3000);
		WebElement txtSplitFactor = driver.findElement(By.xpath("//input[@id='_OBJ_N10_0']"));
		txtSplitFactor.clear();
		txtSplitFactor.sendKeys(com.islandpacific.ipmsweb.testdata.constantdefinations.InputEnterPriceChanges.SplitFactor());
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(3000);
		WebElement btnReview = driver.findElement(By.xpath("//div[@id='_OBJ_N68235']"));
		btnReview.click();
		Thread.sleep(3000);
		WebElement comboSelectDisplay = driver.findElement(By.xpath("//div[@id='(LIST)COMBO_0']"));
		comboSelectDisplay.click();
		for (int i=0;i<=2;i++)
		{
		comboSelectDisplay.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		}
		
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(3000);
		WebElement btnReleasePriceChange = driver.findElement(By.xpath("//div[@id='_OBJ_N66973']"));
		btnReleasePriceChange.click();
		Thread.sleep(3000);
		
		WebElement chboxPrint = driver.findElement(By.xpath("//div[contains(text(),'without')]"));
		chboxPrint.click();
		WebElement chkboxReleaseForApproval = driver.findElement(By.xpath("//div[@id='_OBJ_N65915']"));
		chkboxReleaseForApproval.click();
		Thread.sleep(3000);;
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='(OK)']")).click();
		Thread.sleep(3000);
		WebElement btnExit = driver.findElement(By.xpath("//div[@id='_OBJ_N66135']"));
		btnExit.click();
		Thread.sleep(3000);
		System.out.println("Click");
		driver.findElement(By.id("TOOLBAR_SPLITBUTTON1")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("TOOLBAR_SPLITBUTTON1")).sendKeys(Keys.SHIFT,"X") ;
		Thread.sleep(6000);
		
		
		
		
		
		
		

}
}

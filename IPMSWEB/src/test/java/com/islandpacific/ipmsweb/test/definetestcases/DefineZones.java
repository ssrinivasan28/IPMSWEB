package com.islandpacific.ipmsweb.test.definetestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.islandpacific.ipmsweb.base.BaseTest;
import com.islandpacific.ipmsweb.testdata.InputDefineZones;

public class DefineZones extends BaseTest {

	@Test
	public void DefineZone() throws Exception {

		test = extent.createTest("Define Zone");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"LABEL1_0\"]")).click();

		test.log(Status.PASS, "Merchandising Menu Selected");
		driver.findElement(By.xpath("//*[@id=\"LABEL4_2\"]")).click();

		test.log(Status.PASS, "Constant Defination Selected");

		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"LABEL4_1\"]")).click();
		test.log(Status.PASS, "Clicked Defined Zones");
		WebElement txtzodecode = driver.findElement(By.xpath(".//*[@id='_OBJ_N65646']"));
		txtzodecode.clear();
		txtzodecode.sendKeys(InputDefineZones.Zonecode());
		test.log(Status.PASS, "Zone Code Entered");

		WebElement btnOKK = driver.findElement(By.xpath(".//*[@id='(OK)']"));
		btnOKK.click();
		System.out.println(com.islandpacific.ipmsweb.testdata.InputDefineZones.Zonecode());
		System.out.println("Proceed OK ");

		// Enter ZoneName
		WebElement txtZoneName = driver.findElement(By.id("_OBJ_N65879"));
		txtZoneName.clear();
		txtZoneName.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineZones.ZoneName());
		test.log(Status.PASS, "Zone Name Entered");

		// Enter MANAGER NAME
		WebElement txtZoneManager = driver.findElement(By.id("_OBJ_N65940"));
		txtZoneManager.clear();
		test.log(Status.PASS, "Zone Manager Name Entered");
		txtZoneManager.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineZones.ZoneManager());

		// Enter Phone NAME
		WebElement txtZoneTel = driver.findElement(By.id("_OBJ_N66001"));
		txtZoneTel.clear();
		txtZoneTel.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineZones.ZoneTelephone());
		test.log(Status.PASS, "Zone Phone Entered");

		// Enter Add Address2 NAME
		WebElement txtZoneAdd1 = driver.findElement(By.id("ADDR1"));
		txtZoneAdd1.clear();
		txtZoneAdd1.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineZones.ZoneAddressOne());
		test.log(Status.PASS, "Zone Address One Entered");

		// Enter Add Address2 NAME
		WebElement txtZoneAdd2 = driver.findElement(By.id("_OBJ_N66172"));
		txtZoneAdd2.clear();
		txtZoneAdd2.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineZones.ZoneAddressOne());
		test.log(Status.PASS, "Zone Addres Two Entered");

		// Enter ZoneCity
		WebElement txtZoneCity = driver.findElement(By.id("_OBJ_N66233"));
		txtZoneCity.clear();
		txtZoneCity.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineZones.ZoneCity());
		test.log(Status.PASS, "Zone City Entered");

		// Enter Zone State
		WebElement txtZoneState = driver.findElement(By.id("_OBJ_N66439"));
		txtZoneState.clear();
		txtZoneState.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineZones.ZoneState());
		test.log(Status.PASS, " Zone State Entered");

		// Enter Zone Pin
		WebElement txtZonePin = driver.findElement(By.xpath("//*[@id=\"ZIP\"]"));
		txtZonePin.clear();
		txtZonePin.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineZones.ZonePostalCode());
		test.log(Status.PASS, "Zone Pin   Entered");

		// Enter Zone Country
		WebElement txtZoneCountry = driver.findElement(By.id("_OBJ_N66392"));
		txtZoneCountry.clear();
		txtZoneCountry.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineZones.ZoneContry());
		test.log(Status.PASS, "Zone Country Entered");

		// Enter Zone FinCompany
		WebElement txtZoneCompany = driver.findElement(By.id("_OBJ_N66517"));
		txtZoneCompany.clear();
		txtZoneCompany.sendKeys(com.islandpacific.ipmsweb.testdata.InputDefineZones.ZoneFinCompany());
		test.log(Status.PASS, "Zone Financial Year  Entered");
		WebElement BtnZoneOK = driver.findElement(By.xpath("//*[@id=\"(OK)\"]"));
		BtnZoneOK.click();
		WebElement BtnZoneExit = driver.findElement(By.id("_OBJ_N65884"));
		BtnZoneExit.click();
		test.log(Status.PASS, "Exit to Define Constant Preferences");
		test.log(Status.PASS, "Test Define Zones Passed");
		// signOff();

	}

}

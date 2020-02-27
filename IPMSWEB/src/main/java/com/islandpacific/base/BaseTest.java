package com.islandpacific.base;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import  com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.islandpacific.util.Email;
import com.islandpacific.util.ScreenRecord;
import com.islandpacific.util.ScreenShot;
import com.islandpacific.util.Zipper;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest
{
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static Properties prop;
    public static ExtentTest test;
	public static WebDriver driver ;
	//public WebElement btnOK = driver.findElement(By.xpath("//div[@id='(OK)']"));
	
	
	public BaseTest(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/islandpacific/util/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
		
     
    
	
	@BeforeSuite
    public void setUp() throws Exception
    {
	    Zipper.Zip();
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/TestResultReport.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        htmlReporter.loadXMLConfig("./extent-config.xml");
         
        extent.setSystemInfo("OS", System.getProperty("os.name"));
        extent.setSystemInfo("System Name", System.getProperty("user.name"));
        extent.setSystemInfo("Environment", "IPTSFIL9");
        extent.setSystemInfo("User Name", prop.getProperty("username"));
         
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setDocumentTitle("IWEB Automation");
        htmlReporter.config().setReportName("IWEB Automation");
        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlReporter.config().setTheme(Theme.STANDARD);
       
     //   Date now = new Date();
		//SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	//	String time = dateFormat.format(now);
	//	File dir = new File("./ScreenRecordings/" +time);

         FileUtils.deleteDirectory(new File(System.getProperty("user.dir") +"/ScreenRecordings"));
    
        
    }
	

		
		

      
 
 
    
    
    @BeforeClass
	public void browserSetup() throws Exception
	{
    	String browserName = prop.getProperty("browser");
    	 String className = getClass().getSimpleName();
         ScreenRecord.startRecording(className);
		if(browserName.equals("chrome")){
		  // System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"/drivers/chromedriver.exe");	
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			// driver= new ChromeDriver();

			 //driver = new HtmlUnitDriver(true);
			
		
		}
		 if(browserName.equals("FF")){
			//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +"/drivers/geckodriver.exe");
			  driver = new FirefoxDriver();
;			 driver = new FirefoxDriver(); 
		}
		
   
		driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
		WebElement TxtUserName = driver.findElement(By.xpath("//input[@id='_OBJ_N65954']"));
		TxtUserName.sendKeys(prop.getProperty("username"));
		WebElement TxtPassword = driver.findElement(By.xpath("//input[@id='_OBJ_N66023']"));
		TxtPassword.sendKeys(prop.getProperty("password"));
		Thread.sleep(3000);
		WebElement BtnSign = driver.findElement(By.xpath("//div[@id='_OBJ_N66322']"));
		BtnSign.click();
		
		/*
		 * WebElement lk = driver.findElement(By.xpath("//*[@id=\"RADIO2\"]"));
		 * 
		 * if (lk.isDisplayed()==false) {
		 * 
		 * lk.click(); driver.findElement(By.xpath(".//*[@id='(OK)']")).click();
		 * Thread.sleep(3000); driver.findElement(By.xpath(".//*[@id='(OK)']")).click();
		 * WebElement TxtUserName1 =
		 * driver.findElement(By.xpath("//input[@id='_OBJ_N65954']"));
		 * TxtUserName1.sendKeys(prop.getProperty("username")); WebElement TxtPassword1
		 * = driver.findElement(By.xpath("//input[@id='_OBJ_N66023']"));
		 * TxtPassword1.sendKeys(prop.getProperty("password")); WebElement BtnSign1 =
		 * driver.findElement(By.xpath("//div[@id='_OBJ_N66322']")); BtnSign1.click();
		 * 
		 * 
		 * 
		 * }
		 */
	
	//	driver.findElement(By.id("(OK)")).click();
		
		
		WebElement Environment = driver.findElement(By.id("COMBO1"));
		Environment.sendKeys(Keys.DOWN);
		Environment.sendKeys(Keys.DOWN);
		Environment.sendKeys(Keys.DOWN);
	    Environment.sendKeys(Keys.DOWN);
		Environment.sendKeys(Keys.DOWN);
		Environment.sendKeys(Keys.DOWN);
		Environment.sendKeys(Keys.DOWN);
		WebElement btnOK = driver.findElement(By.xpath(".//*[@id='(OK)']"));
		btnOK.click();
		
	
	
		
	
		
		
		
	}
	
	
     
    @AfterMethod
    public void getResult(ITestResult result) throws Exception
    {
 
    	 
    	 if(result.getStatus() == ITestResult.FAILURE)
         {
        //     String screenShotPath = GetScreenShot.capture(driver, "screenShotName");
    		 String screenShotPath = ScreenShot.capture(driver, "screenShotName");
             test.log(Status.FAIL, result.getThrowable());
             test.log(Status.FAIL, "Snapshot below: " + test.addScreenCaptureFromPath(screenShotPath));
             
         }
        
    	
    	
    	else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getName()  + " has been Passed" );
		//	test.pass("Screen Shot : " + test.addScreenCaptureFromPath(screenShot));
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.skip("Test Case : " + result.getName() + " has been skipped");
		}
 
		extent.flush();
	driver.close();
    }
    
    

    /*public void signOff() throws Exception
    {
    	
    	
    	Thread.sleep(5000);
		driver.findElement(By.id("TOOLBAR_SPLITBUTTON1")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("TOOLBAR_SPLITBUTTON1")).sendKeys(Keys.SHIFT,"X") ;
		Thread.sleep(6000);

    	Thread.sleep(3000);
		 test.log(Status.PASS, "Signed Off");
    	
    }
    */
    
    @AfterClass
	public void quit() throws Exception
	{ 
    	
    
    	ScreenRecord.stopRecording();
    	
		driver.quit();
		
		
	}
	
     
    
	
	@AfterSuite
    public void tearDown() throws Exception
    {
        extent.flush();
        Email.EmailTrigger();
      File file = new File(System.getProperty("user.dir") +"/test-output/TestResultReport.html");
        Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String time = dateFormat.format(now);
		File dir = new File("./ScreenRecordings/" +time);
	
        if(!Desktop.isDesktopSupported()){
            System.out.println("Desktop is not supported");
            return;
        }
        
        Desktop desktop = Desktop.getDesktop();
        if(file.exists()) desktop.open(file);
        if(dir.exists()) desktop.open(dir); 
    }
    }



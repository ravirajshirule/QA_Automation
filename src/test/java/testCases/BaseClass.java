package testCases;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utilities.Configproperties;

public class BaseClass  {
	
	ExtentReports reports;
	ExtentTest test;
	
	Configproperties conpro = new Configproperties();
	
	public String baseurl= conpro.appurl();
	public String firefoxpath= conpro.getFirefox();
	public String chromepath= conpro.getChromepath();
	
	public String email = conpro.getUsername();
	public String password = conpro.getPassword();
	
	public static Logger logger;
	static WebDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get(baseurl);
		
		//logger = logger.getLogger("QA Automation");
		
	}
	
	public static void mouseOver(WebDriver driver,String element)
	{
		Actions act = new Actions(driver);
		WebElement ele = null;
		act.moveToElement(ele).build().perform();;
	}
	
	
	
	public  static void scrolDown(WebDriver driver)
	{
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
	}
	
	
//	public static void dropDownList(WebDriver driver,String locatorType,String locatorValue,String text)
//	{
//		Select drlist=new Select(driver.findElement(By.xpath(locatorValue)));
//		drlist.selectByVisibleText(text);
//	}
//	
	public void implicitwait()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
//	@AfterTest
//	public void teardown()
//	{
//		driver.quit();
//	}

}

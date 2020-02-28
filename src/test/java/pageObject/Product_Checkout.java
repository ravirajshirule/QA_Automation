package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Product_Checkout {
	
	WebDriver driver;
	
String Title = "http://automationpractice.com/index.php?controller=my-account";
	
	By emailID = By.xpath("//*[@id='email']");
	By password = By.xpath("//*[@id='passwd']");
	By Clickbutton = By.xpath("//*[@id='SubmitLogin']/span");	
	By link = By.xpath("//*[@class='login']");
	By cartlink = By.xpath("//*[@id='header']/div[3]/div/div/div[3]/div/a");
	
	
	
	
	public void sigin()
	{
		driver.findElement(link).click();
	}
	
	public void Username(String email)
	{
	driver.findElement(emailID).sendKeys(email);	
	}
	
	public void pass(String passwrd)
	{
		driver.findElement(password).sendKeys(passwrd);
	}
	public void submit()
	{
		driver.findElement(Clickbutton).click();
	}
	
	public void validate()
	{
		String url= driver.getCurrentUrl();
		Assert.assertEquals(url, Title);
	}
	
	public void cart()
	{
		driver.findElement(cartlink).click();
		
	}
	
	
	
	
	
	
	}




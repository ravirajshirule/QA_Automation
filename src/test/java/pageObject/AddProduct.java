package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class AddProduct {
	
	WebDriver driver;
	
	 
    String Title = "http://automationpractice.com/index.php?controller=my-account";
	
	By emailID = By.xpath("//*[@id='email']");
	By pass = By.xpath("//*[@id='passwd']");
	By Clickbutton = By.xpath("//*[@id='SubmitLogin']/span");	
	By link = By.xpath("//*[@class='login']");
	
	By hoverlink = By.xpath("//*[@id='block_top_menu']/ul/li[1]/a");
	By Tshirthover = By.xpath("//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul/li[1]/a");
	By quickview = By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[2]/span");
	
	
	
	public void AddProduct(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void hover()
	{
		Actions act= new Actions(driver);
		WebElement ele = driver.findElement(hoverlink);
		Action builder = act.moveToElement(ele).build();
		//act.moveToElement(ele).perform();;
	}
	
	
	
	
	public void login()
	{
		driver.findElement(link).click();
	}
	
	public void enter_emailID(String email)
	{
		driver.findElement(emailID).sendKeys(email);
	}
	
	public void enter_pass(String password)
			{
		driver.findElement(pass).sendKeys(password);
			}
	public void submit_login()
	{
		driver.findElement(link);
	}
	
	
	
	
	
	
	
}

package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Loginpage {
	
    WebDriver driver;
    
    String Title = "http://automationpractice.com/index.php?controller=my-account";
	
	By emailID = By.xpath("//*[@id='email']");
	By password = By.xpath("//*[@id='passwd']");
	By Clickbutton = By.xpath("//*[@id='SubmitLogin']/span");	
	By link = By.xpath("//*[@class='login']");
	By hoverlink = By.xpath("//*[@id='block_top_menu']/ul/li[1]/a");
	By hoverTlink = By.xpath("//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul/li[1]/a");
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
		
	

	public void enter_email(String email)
	{
		driver.findElement(emailID).sendKeys(email);
	}
	
	public void enter_password(String passwrd)
	{
		driver.findElement(password).sendKeys(passwrd);
	}
	
	public void click()
	{
		driver.findElement(Clickbutton).click();
	}
	
	public void loginlink()
	{
		driver.findElement(link).click();
	}
	
	public void verifyPage()
	{
		String Curl = driver.getCurrentUrl();
		Assert.assertEquals(Curl, Title);
		System.out.println(Curl);
	}
	
	public void hoverWoman() throws InterruptedException
	{
		Actions act = new Actions(driver);
		
		WebElement ele = driver.findElement(hoverlink);
				act.moveToElement(ele).perform();
		
	}
	
	public void hoverTshirt()
	{
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(hoverTlink);
		act.moveToElement(ele).perform();
		act.click();
		
	}

}

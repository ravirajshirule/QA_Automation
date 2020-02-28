package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccount {
	
	WebDriver driver;
	
	By loginlink = By.xpath("//*[@class='login']");
	By CreateUser = By.xpath("//*[@name='email_create']");
	By Createbutton = By.xpath("//*[@id='SubmitCreate']/span");	
	
	
	public CreateAccount(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void signin()
	{
		driver.findElement(loginlink).click();
	}
	
	public void enter_email(String email)
	{
		driver.findElement(CreateUser).sendKeys(email);
	}
	
	public void click()
	{
		driver.findElement(Createbutton).click();
	}
	


}

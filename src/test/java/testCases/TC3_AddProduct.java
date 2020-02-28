package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObject.AddProduct;
import pageObject.Loginpage;

public class TC3_AddProduct extends BaseClass{
	
	
	
	@Test
	public void selectProduct()
	
	{
		
		AddProduct ap = new AddProduct();
	
	
	
		ap.login();
		implicitwait();
		
		ap.enter_emailID(email);
		implicitwait();
		
		ap.enter_pass(password);
		implicitwait();
		
		ap.submit_login();
		implicitwait();
	
		ap.hover();
		implicitwait();
	
	
	
	
	
	}
}

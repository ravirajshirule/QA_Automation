package testCases;

import org.testng.annotations.Test;

import pageObject.CreateAccount;

public class TC1_CreateAccount extends BaseClass

{
	
	@Test
	public void CreateUser()
	{
	
		//driver.get(baseurl);
		
		CreateAccount hp = new CreateAccount(driver);
		
		hp.signin();
		hp.enter_email(email);
		hp.click();
		
		
	}

}

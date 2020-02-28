package testCases;



import org.testng.annotations.Test;

import pageObject.Loginpage;




public class TC2_loginpage extends BaseClass {
	
	
	@Test
	public void signin() throws InterruptedException
	{
		
		//driver.get(baseurl);
		
		Loginpage lp = new Loginpage(driver);
		//BaseClass bc = new BaseClass();
		
		lp.loginlink();
		implicitwait();
		
		lp.enter_email(email);
		implicitwait();
		
		lp.enter_password(password);
		implicitwait();
		
		lp.click();
		implicitwait();	
		
		lp.hoverWoman();
		implicitwait();
		
		lp.hoverTshirt();
		implicitwait();
		
		
		
	}
	
	

}

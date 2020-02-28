package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configproperties {

	Properties pro;
	{
	File src = new File("./ConfigProperty/config.properties");
	
	
		FileInputStream fis;
		try {
			fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	
}
	
	public String appurl()
	{
		String url = pro.getProperty("baseurl");
		return url;
		
	}
	
	public String getUsername()
	{
		String email = pro.getProperty("username");
		return email;
		
	}
	
	public String getPassword()
	{
		String pass = pro.getProperty("password");
		return pass;
		
	}
	
	public String getChromepath()
	{
		String chrome = pro.getProperty("chromepath");
		return chrome;
		
	}
	
	public String getFirefox()
	{
		String firefox = pro.getProperty("firefoxpath");
		return firefox;
		
	}
	
}

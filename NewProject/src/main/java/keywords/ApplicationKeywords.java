package keywords;

import java.io.FileInputStream;
import java.util.Properties;

public class ApplicationKeywords extends ValidationKeywords
{
	public ApplicationKeywords() 
	{
		mainProp = new Properties();
		childProp = new Properties();
		
		try 
		{
			fis = new FileInputStream(projectpath+"\\src\\test\\resources\\environment.properties");
			mainProp.load(fis);
			String e = mainProp.getProperty("env");
			
			fis = new FileInputStream(projectpath+"\\src\\test\\resources\\"+e+".properties");
			childProp.load(fis);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public void login()
	{
		
	}
	
	public void selectDataform()
	{
		
	}
	
}

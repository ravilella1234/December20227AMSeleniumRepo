package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
	public static WebDriver driver;
	public static String projectPath = System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties p;
	public static Properties mainProp;
	public static Properties childProp;
	
	public static void init() throws Exception
	{
		//FileInputStream fis = new FileInputStream("D:\\April2022WD\\December2022_7AMSeleniumBatch\\src\\test\\resources\\data.properties");
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\data.properties");
		p = new Properties();
		p.load(fis);
		
		fis = new FileInputStream(projectPath+"\\src\\test\\resources\\environment.properties");
		mainProp = new Properties();
		mainProp.load(fis);
		String e = mainProp.getProperty("env");
		System.out.println(e);
		
		fis = new FileInputStream(projectPath+"\\src\\test\\resources\\"+e+".properties");
		childProp = new Properties();
		childProp.load(fis);
		String val = childProp.getProperty("amazonurl");
		System.out.println(val);
	}
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	}
	
	public static void navigateUrl(String url)
	{
		driver.get(childProp.getProperty(url));
		driver.navigate().to(childProp.getProperty(url));
	}

}

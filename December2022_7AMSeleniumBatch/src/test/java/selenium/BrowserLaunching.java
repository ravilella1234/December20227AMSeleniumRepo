package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunching 
{

	public static void main(String[] args) 
	{
		WebDriver driver = null;
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravi\\Desktop\\SeleniumDocuments\\chromedriver.exe");
		driver = new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		//webdriver.gecko.driver
		driver = new FirefoxDriver();
		
		//webdriver.ie.driver
		//webdriver.edge.driver
	}

}

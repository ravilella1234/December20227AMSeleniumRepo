package keywords;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericKeywords 
{
	public WebDriver driver;
	public String projectpath = System.getProperty("user.dir");
	public FileInputStream fis;
	public Properties mainProp;
	public Properties childProp;
	public ExtentTest test;
	
	public void openBrowser(String browserName)
	{
		System.out.println("Opening the Browser : " + childProp.getProperty(browserName));
		//test.log(Status.INFO, "Opening the Browser : " + childProp.getProperty(browserName));
		log("Opening the Browser : " + childProp.getProperty(browserName));
		if(childProp.getProperty(browserName).equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(childProp.getProperty(browserName).equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	}
	
	public void naviagateurl(String url)
	{
		System.out.println("Navigating to url :" + childProp.getProperty(url));
		//test.log(Status.INFO, "Navigating to url :" + childProp.getProperty(url));
		log("Navigating to url :" + childProp.getProperty(url));
		driver.get(childProp.getProperty(url));
	}
	
	public void type(String locatorKey,String text)
	{
		//test.log(Status.INFO, "typing the test by using locator :" + childProp.getProperty(text));
		log("typing the test by using locator :" + childProp.getProperty(text));
		getElement(locatorKey).sendKeys(childProp.getProperty(text));
	}
	
	public void clickElement(String locatorKey)
	{
		//test.log(Status.INFO, "Clicking on element By using locator : " + locatorKey);
		log("Clicking on element By using locator : " + locatorKey);
		getElement(locatorKey).click();
	}
	
	public void selectOption(String locatorKey, String option)
	{
		getElement(locatorKey).sendKeys(childProp.getProperty(option));
	}
	
	public  WebElement getElement(String locatorKey) 
	{
		WebElement element = null;
		
		//check for element present
		if(!isElementPresent(locatorKey))
			//report as failure
			System.out.println("Element is not present :" + locatorKey);
		
		element = driver.findElement(getLocator(locatorKey));
		
		return element;
	}
	
	public boolean isElementPresent(String locatorKey) 
	{
		System.out.println("Cheking for Element presence : " + locatorKey);
		test.log(Status.INFO, "Cheking for Element presence : " + locatorKey);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(getLocator(locatorKey)));
		
		 return true;
	}
	
	public By getLocator(String locatorKey)
	{
		By by = null;
		if(locatorKey.endsWith("_id")) {
			by = By.id(mainProp.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_name")) {
			by = By.name(mainProp.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_classname")) {
			by = By.className(mainProp.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_xpath")) {
			by = By.xpath(mainProp.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_css")) {
			by = By.cssSelector(mainProp.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_linktext")) {
			by = By.linkText(mainProp.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_partiallinktext")) {
			by = By.partialLinkText(mainProp.getProperty(locatorKey));
		}
		return by;
	}
	
	public void setReport(ExtentTest test)
	{
		this.test = test;
	}
	
	//Reporting Function
	public void log(String msg)
	{
		test.log(Status.INFO, msg);
	}

}

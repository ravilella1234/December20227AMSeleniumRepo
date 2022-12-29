package selenium;

import org.apache.log4j.Logger;

public class TC_003 extends BaseTest
{

	private static final Logger log = Logger.getLogger(TC_003.class);
	
	public static void main(String[] args) throws Exception 
	{
		init();
		log.info("Init the properties files....");
		
		launch("chromebrowser");
		log.info("Launching the browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigating to Url : " + childProp.getProperty("amazonurl"));
		
		driver.manage().window().maximize();
		
		selectOption("amazondropbox_id","Books");
		log.info("Selecting the option Books By using loactor : " + orProp.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtext_name","Harry Potter");
		log.info("Entering text harry potter By using locator : " + orProp.getProperty("amazonsearchtext_name"));
		
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked on element By using locatoe : " + orProp.getProperty("amazonsearchbutton_xpath"));
		
		
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		//loc.sendKeys("Books");
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		//driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	}
}

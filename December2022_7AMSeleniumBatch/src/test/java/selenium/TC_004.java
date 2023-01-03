package selenium;

import com.aventstack.extentreports.Status;

public class TC_004 extends BaseTest
{
	

	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.createTest("TC_004");
		test.log(Status.INFO, "Init the properties files....");
				
		launch("chromebrowser");
		test.log(Status.PASS, "Launching the browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.PASS, "Navigating to Url : " + childProp.getProperty("amazonurl"));
		
		driver.manage().window().maximize();
		
		selectOption("amazondropbox_id","Books");
		test.log(Status.PASS, "Selecting the option Books By using loactor : " + orProp.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtext_name","Harry Potter");
		test.log(Status.FAIL, "Entering text harry potter By using locator : " + orProp.getProperty("amazonsearchtext_name"));
				
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.PASS,"Clicked on element By using locatoe : " + orProp.getProperty("amazonsearchbutton_xpath"));		
		
		report.flush();
	}

}

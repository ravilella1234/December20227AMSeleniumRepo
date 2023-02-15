package pageobjectmodel;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import selenium.BaseTest;

public class POM_001 extends BaseTest
{  
  @BeforeMethod
  public void beforeMethod() throws Exception 
  {
	    init();
		test = report.createTest("POM_001");
		test.log(Status.INFO, "Init the properties files....");
				
		launch("chromebrowser");
		test.log(Status.PASS, "Launching the browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("fburl");
		test.log(Status.PASS, "Navigating to Url : " + childProp.getProperty("fburl"));
  }

  @Test
  public void loginTest() 
  {
	  LoginPage page = new LoginPage(driver);
	  page.login();
  }
  
  @AfterMethod
  public void afterMethod()
  {
	  
  }

}

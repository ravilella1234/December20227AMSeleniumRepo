package verificationsReportings;

import com.aventstack.extentreports.Status;

import selenium.BaseTest;

public class Verify3 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.createTest("Verify3");
		test.log(Status.INFO, "Init the properties files....");
				
		launch("chromebrowser");
		test.log(Status.PASS, "Launching the browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.PASS, "Navigating to Url : " + childProp.getProperty("amazonurl"));
		
		driver.manage().window().maximize();
		
		String expectedLink = "Customer Serv";
		
		if(!isLinksEqual(expectedLink))
			reportFailure("Both links are not equal...");
			//System.out.println("Both links are not equal...");
		else
			reportSuccess("Both links are equal...");
			//System.out.println("Both links are equal...");
		
		report.flush();
	}
}

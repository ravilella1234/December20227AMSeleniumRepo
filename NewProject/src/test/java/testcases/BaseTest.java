package testcases;

import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import keywords.ApplicationKeywords;
import reports.ExtentManager;

// Critical Failure , Acceptable Failure, Unexpected Failure

public class BaseTest 
{
	public ApplicationKeywords app;
	public ExtentReports rep;
	public ExtentTest test;
	
	
	@BeforeTest
	public void beforeTest(ITestContext context)
	{
		app = new ApplicationKeywords();
		System.out.println("startProcess BeforeTest");		
		context.setAttribute("app", app);
		
		//init the Reporting for Test
		rep = ExtentManager.getReports();
		test = rep.createTest(context.getCurrentXmlTest().getName());
		app.setReport(test);
		
		String criticalFailure = (String)context.getAttribute("criticalFailure");
		if(criticalFailure!=null && criticalFailure.equals("Y"))
		{
			test.log(Status.SKIP, "Critical failure in privious Test");
			throw new SkipException("Critical failure in privious Test");
		}
		
		context.setAttribute("report", rep);
		context.setAttribute("test", test);
	}
	
	@BeforeMethod
	public void beforeMethod(ITestContext context)
	{
		System.out.println("startProcess beforeMethod");	
		app = (ApplicationKeywords)context.getAttribute("app");
		
		rep = (ExtentReports)context.getAttribute("report");
		test = (ExtentTest)context.getAttribute("test");
		
	}
	
	@AfterTest
	public void quit()
	{
		if(rep!=null)
			rep.flush();
	}
}

package testcases;

import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import keywords.ApplicationKeywords;

public class BaseTest 
{
	public ApplicationKeywords app;
	
	@BeforeTest
	public void beforeTest(ITestContext context)
	{
		app = new ApplicationKeywords();
		System.out.println("startProcess BeforeTest");		
		context.setAttribute("app", app);
	}
	
	@BeforeMethod
	public void beforeMethod(ITestContext context)
	{
		System.out.println("startProcess beforeMethod");	
		app = (ApplicationKeywords)context.getAttribute("app");
	}
}

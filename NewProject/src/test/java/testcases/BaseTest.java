package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest 
{
	@BeforeTest
	public void startProcess()
	{
		System.out.println("startProcess BeforeTest");
	}
	
	@AfterTest
	public void endProcess()
	{
		System.out.println("endProcess AfterTest");
	}

}

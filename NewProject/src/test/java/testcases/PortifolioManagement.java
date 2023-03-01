package testcases;

import org.testng.annotations.Test;

public class PortifolioManagement extends BaseTest
{
  @Test
  public void createportifolio() 
  {
	  System.out.println("createportifolio");
	  //report
	  app.reportFailure("some non critical failure....", false);
	  app.assertAll();
  }
  
  @Test
  public void modifyportifolio() 
  {
	  System.out.println("modifyportifolio");
  }
  
  @Test
  public void deleteportifolio()
  {
	  System.out.println("deleteportifolio");
  }
}

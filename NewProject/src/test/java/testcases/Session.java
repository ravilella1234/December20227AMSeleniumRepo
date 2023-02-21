package testcases;

import org.testng.annotations.Test;

public class Session extends BaseTest
{
  @Test
  public void doLogin() 
  {
	  System.out.println("doLogin");
	  app.openBrowser("chromebrowser");
	  app.naviagateurl("rediffurl");
	  app.clickElement("signin_linktext");
	  app.type("useremail_id", "rediffuser");
	  app.type("userpassword_id", "rediffpassword");
	  app.clickElement("submit_id");
  }
  
  @Test
  public void doLogOut() 
  {
	  System.out.println("doLogOut");
  }
}

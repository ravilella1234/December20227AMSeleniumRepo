package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="email")public WebElement fbemail;
	@FindBy(name="pass")public WebElement fbpassword;
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void login()
	{
		fbemail.sendKeys("ravilella");
		fbpassword.sendKeys("password");
	}
}

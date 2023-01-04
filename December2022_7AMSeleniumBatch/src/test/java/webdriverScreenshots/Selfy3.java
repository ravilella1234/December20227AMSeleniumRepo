package webdriverScreenshots;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selfy3 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		String link1 = driver.findElement(By.linkText("Customer Service")).getText();
		System.out.println(link1);
		
		List<WebElement> link2 = driver.findElements(By.tagName("a"));
		for(int i=0;i<link2.size();i++)
		{
			String l = link2.get(i).getText();
			System.out.println(l);
		}
		
		List<WebElement> link3 = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		for(int j=0;j<link3.size();j++)
		{
			String m = link3.get(j).getText();
			System.out.println(m);
		}
	}

}

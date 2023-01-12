package switches;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switch1 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		//It opens a new blank tab
		/*driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());*/
		
		//It opens a new blank window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.in");
		System.out.println(driver.getTitle());
		

	}

}

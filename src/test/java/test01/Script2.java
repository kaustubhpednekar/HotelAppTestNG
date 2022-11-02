package test01;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Script2 
{
	WebDriver driver;
	  @Test
	  public void f() 
	  {
		  driver.findElement(By.linkText("Trending Books")).click();
		  driver.findElement(By.xpath("//*[@id=\"contentBody\"]/div[1]/ul/li[1]/div[2]/div/div[1]/a")).click();
		  
	  }
	  
	  @BeforeTest
	  public void beforeTest() 
	  {
			System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://openlibrary.org/");
			driver.manage().window().maximize();	
	  }

	  @AfterTest
	  public void afterTest() 
	  {
		  driver.quit();
	  }

}

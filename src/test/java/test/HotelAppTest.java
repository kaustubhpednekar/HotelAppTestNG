package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class HotelAppTest {
	WebDriver driver;
  @Test
  public void f() 
  {
	  WebElement uname = driver.findElement(By.id("username"));
		uname.clear();
		uname.sendKeys("vasuvespag");
		driver.findElement(By.id("password")).sendKeys("vasu1234");
		
		driver.findElement(By.className("login_button")).click();
		Reporter.log("This is login test");
  }
  @BeforeTest
  public void beforeTest() 
  {
		System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
  }

}

package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class SearchHotelTest {
	WebDriver driver;
  @Test
  public void f() 
  {
	  WebElement uname = driver.findElement(By.id("username"));
		uname.clear();
		uname.sendKeys("vasuvespag");
		driver.findElement(By.id("password")).sendKeys("vasu1234");
		driver.findElement(By.className("login_button")).click();
		
		new Select(driver.findElement(By.cssSelector("#location"))).selectByVisibleText("Adelaide");
		new Select(driver.findElement(By.cssSelector("#hotels"))).selectByValue("Hotel Sunshine");
		
		driver.findElement(By.cssSelector("#Submit")).click();
		driver.findElement(By.xpath("//*[@id=\"radiobutton_1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(By.name("first_name")).sendKeys("Manoj");
		driver.findElement(By.name("last_name")).sendKeys("Kumar");
		driver.findElement(By.id("address")).sendKeys("Housing Colony, Bangalore");
		driver.findElement(By.xpath("//*[@id=\"cc_num\"]")).sendKeys("1234567890123456");
		
		new Select(driver.findElement(By.cssSelector("#cc_type"))).selectByVisibleText("VISA");
		new Select(driver.findElement(By.cssSelector("#cc_exp_month"))).selectByValue("10");
		new Select(driver.findElement(By.cssSelector("#cc_exp_year"))).selectByValue("2022");
		
		driver.findElement(By.xpath("//*[@id=\"cc_cvv\"]")).sendKeys("087");
		driver.findElement(By.cssSelector("#book_now")).click();
		Reporter.log("This is searching hotel in specified location");
		
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

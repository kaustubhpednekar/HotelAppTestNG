package test01;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Script1 
{
	WebDriver driver;
	  @Test
	  public void f() 
	  {
		  //driver.findElement(By.linkText("Trending Books")).click();
			
			/*
			 * List<WebElement> book =
			 * driver.findElement(By.xpath(".//a//img[@itemprop='image']")); List<String>
			 * text = new ArrayList<String>(); for(WebElement list:book) {
			 * text.add(list.getText());
			 * 
			 * } System.out.println(text.size());
			 */
			 //*[@id="contentBody"]/div[2]/div[2]/div/div/div
		  
		  WebElement book = driver.findElement(By.xpath("//*[@id=\"contentBody\"]/div[3]/div[2]/div/div/div"));
		  int Child1 =Integer.parseInt(book.getAttribute("childElementCount"));
		  System.out.println(Child1);
		  //driver.navigate().back();
		  
          driver.findElement(By.xpath("//*[@id=\"header-bar\"]/div[2]/div/div[1]/form/input[1]")).sendKeys("art");
		  driver.findElement(By.xpath("//input[@type=\"submit\"][1]")).click();
		  String str = driver.findElement(By.xpath("//*[@id=\"contentBody\"]/div[2]")).getText();
		  System.out.println(str.substring(0,8));
		  
		  
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

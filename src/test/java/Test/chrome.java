package Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
/*
public class chrome extends A_2{
	
	WebDriver driver;
	WebDriverWait wait;
	@BeforeSuite
	
public void testbbc() {

		System.setProperty("webdriver.chrome.driver", "/Users/nayyaan/Chrome/chromedriver");
		
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.qa.oncue.com/");
		
		// FirefoxDriver driver = new FirefoxDriver();
		
		
		
	}
	
	@Test

public void testTabs() {
		           
	    


    WebElement link4 = driver.findElement(By.xpath("html/body/div[1]/header/div/div/div[1]/div/div/ul/li[3]/a"));
	  
	  link4.click(); 
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("header-gplay")));
	  WebElement link4_1 = driver.findElement(By.id("header-gplay"));
	  
	    link4_1.click();                                

	        System.out.println(driver.getCurrentUrl());
		 
		 

    //driver.close();
   
  /*
		@Test
	public void testGetTheAppGooglePlay() throws InterruptedException 
		
		{
		  
		  WebElement link4 = driver.findElement(By.xpath("html/body/div[1]/header/div/div/div[1]/div/div/ul/li[3]/a"));
		  
		  link4.click(); 
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("header-gplay")));
		 wait.until(ExpectedConditions.
		  
		 //Thread.sleep(1000); 
		  
		 WebElement link4_1 = driver.findElement(By.id("header-gplay"));
		 link4_1.click();
		  
		  }
		  
}
	}
}
*/
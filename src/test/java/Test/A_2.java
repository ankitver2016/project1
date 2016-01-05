package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class A_2 {
	
	WebDriver driver;
	WebDriverWait wait;
/*

	public void testyahoo() {

		//System.setProperty("webdriver.chrome.driver", "/Users/nayyaan/Chrome/chromedriver");
		// FirefoxDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();

		//driver.get("http://www.yahoo.com./");
		//closing();
		//driver.close();
		
		*/
	
	public void waiting(){
	
		for (String winHandle : driver.getWindowHandles()) {
		      driver.switchTo().window(winHandle);
		    

		}
	}

	
		
		

	

}

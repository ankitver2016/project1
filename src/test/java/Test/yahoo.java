package Test;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class yahoo extends A_2 {
	@Test
	public void newwindow() throws InterruptedException
	{

	System.setProperty("webdriver.chrome.driver", "/Users/nayyaan/Chrome/chromedriver");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.go90.com/");
	String parentHandle = driver.getWindowHandle();
	
	
	Thread.sleep(5000);
	
    WebElement link = driver.findElement(By.xpath("html/body/div[1]/footer/div[2]/div/div[1]/ul/li[1]/a/img"));
 
    link.click();  
    Thread.sleep(15000);
    
    
   
 for (String winHandle : driver.getWindowHandles()) {
     
    driver.switchTo().window(winHandle);
    

//}
    //System.out.println(winHandle);

    WebElement link1= driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/h1/a/i"));
    link1.click();
    System.out.println(driver.getCurrentUrl()); 
    driver.close();
 
    driver.switchTo().window(parentHandle);
    
    WebElement link3 = driver.findElement(By.xpath("html/body/div[1]/header/div/div/div[2]/a"));
      link3.click();
      
  System.out.println(driver.getCurrentUrl()); 
   
     
    }        
   
	
	}


package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;  

public class Utube
 
		{
		 public static void main(String[] args) throws  InterruptedException

		 {
			System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.youtube.com/");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[id='search']")).sendKeys("Kgf2 trailer");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("div[id='channel-info']")).click();
			Thread.sleep(2000);
		}
		}
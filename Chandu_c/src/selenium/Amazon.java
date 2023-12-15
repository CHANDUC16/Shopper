package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[id='twotabsearchtextboxq']")).sendKeys("iphone15 pro");
        driver.findElement(By.xpath("//input[id='nav-search-submitt-button']")).sendKeys("iphone15 pro");
        driver.findElement(By.xpath("//image[id='']")).click();
        driver.findElement(By.xpath("//input[id='add-to-cart-button']")).click();
        
	}
}

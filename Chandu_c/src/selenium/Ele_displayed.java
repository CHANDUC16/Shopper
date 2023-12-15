package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ele_displayed
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/ADMIN/Desktop/Abd.html");
      WebElement ele = driver.findElement((By.id("a1")));
      boolean b = ele.isSelected();
      if(b)
      {
    	  System.out.println("element selected");
      }
      else
      {
    	  System.out.println("element not selected");
      }
      driver.quit();
}
}

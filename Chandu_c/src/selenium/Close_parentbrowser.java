package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Close_parentbrowser 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://skpatro.github.io/demo/links");
	Thread.sleep(2000);
	driver.findElement(By.name("NewWindow")).click();
	Thread.sleep(1000);
	String p_id = driver.getWindowHandle();
	Set<String> allwh = driver.getWindowHandles();
	for (String wh: allwh)
	{
		driver.switchTo().window(wh);
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		if (wh.equals(p_id))
		{
			driver.close();
			
		}
		
	}
		
	}
}

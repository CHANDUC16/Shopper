package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo16
{
public static void main(String[] args)  throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
     Thread.sleep(3000);
	WebElement ele = driver.findElement(By.name("login"));
	ele.sendKeys(Keys.ENTER);
}
}

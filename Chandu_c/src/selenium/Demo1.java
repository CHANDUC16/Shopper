package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	driver.findElement(By.tagName("a")).click();
	//or
	//WebElement ele=driver.findElement("By.tagName("a"));"
	//ele.click();
}
}

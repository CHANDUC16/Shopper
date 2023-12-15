package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll_down_up
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage(). window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	for(int i=0;i<3;i++)
	{
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
	}
	for(int i=0;i<3;i++)
	{
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(1000);
	}
}
}

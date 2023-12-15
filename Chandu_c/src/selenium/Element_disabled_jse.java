package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Element_disabled_jse 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage(). window().maximize();
	driver.get("file:///C:/Users/ADMIN/Documents/Disabled.html");
	Thread.sleep(3000);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("document.getElementById('a1').value='selenium'");
	
}
}

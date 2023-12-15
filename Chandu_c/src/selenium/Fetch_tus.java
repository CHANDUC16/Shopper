package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fetch_tus 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	//String title=driver.getTitle();
	//System.out.println(title);
	//String url=driver.getCurrentUrl();
	//System.out.println(url);
	String src=driver.getPageSource();
	System.out.println(src);
}
}

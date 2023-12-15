package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.instagram.com/");
	Thread.sleep(3000);
	String title=driver.getTitle();
	System.out.println(title);
	if(title.contains( "title"))
	{
	 System.out.println(true);
}
	else
	{
	System.out.println(false);
	}
}
}

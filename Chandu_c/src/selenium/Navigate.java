package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate
{
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("https://www.google.com");
}
}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehandling_action
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.myntra.com/");
	Thread.sleep(1000);
	WebElement women = driver.findElement(By.xpath("//a[.='Women'])[1]"));
	Actions act = new Actions(driver);
	act.moveToElement(women).perform();
}
}


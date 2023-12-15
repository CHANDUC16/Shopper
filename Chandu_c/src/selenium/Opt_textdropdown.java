package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Opt_textdropdown 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com/r.php");
	Thread.sleep(2000);
	WebElement ele1=driver.findElement(By.id("month"));
	Select s=new Select(ele1);
	List<WebElement> opt = s.getOptions();
	for(WebElement we:opt)
	{
		System.out.println(we.getText());
	}
	driver.quit();
	}
}

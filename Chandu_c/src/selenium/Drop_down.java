package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/ADMIN/Desktop/Dropdown.html");
	Thread.sleep(1000);
	WebElement drop_down1=driver.findElement(By.xpath("//select[@id='city-dropdwon']"));
	Select s=new Select(drop_down1);
	s.selectByIndex(0);
	Thread.sleep(1000);
	s.selectByValue("C");
	Thread.sleep(1000);
	s.selectByVisibleText("mysore");
}
}
	
	
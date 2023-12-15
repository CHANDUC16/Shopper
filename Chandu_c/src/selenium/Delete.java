package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Delete 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/ADMIN/Desktop/Swap.html");
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.xpath("//input[type='text']"));
	ele.sendKeys(Keys.CONTROL+"ax");
	Thread.sleep(2000);
	WebElement ele1=driver.findElement(By.xpath("//input[value='selenium']"));
	ele1.sendKeys(Keys.CONTROL+"v");
	Thread.sleep(20000);
	WebElement ele2=driver.findElement(By.xpath("//input[type='text']"));
	ele2.sendKeys(Keys.CONTROL+"ax");
	Thread.sleep(20000);
	WebElement ele3=driver.findElement(By.xpath("//input[value='api']"));
	ele3.sendKeys(Keys.CONTROL+"v");
	Thread.sleep(20000);
	WebElement ele4=driver.findElement(By.xpath("//input[type='text']"));
	ele4.sendKeys(Keys.CONTROL+"ax");
	Thread.sleep(20000);
	WebElement ele5=driver.findElement(By.xpath("//input[value='']"));
	ele5.sendKeys(Keys.CONTROL+"v");

	
	
}
}

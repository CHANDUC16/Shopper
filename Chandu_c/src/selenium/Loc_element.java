package selenium;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loc_element 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage(). window().maximize();
	driver.get("https://www.amazon.in");
	Thread.sleep(3000);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	WebElement help = driver.findElement(By.xpath("//a[.='Brazil']"));	
	Point loc = help.getLocation();
	int x = loc.getX();
	int y = loc.getY();
	for(int i=0;i<12;i++)
	{
		js.executeScript(x+" "+y);
		Thread.sleep(1000);
	//System.out.println(x+" "+y);
	
}
}
}
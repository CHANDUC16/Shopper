package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Option_present 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com/r.php");
	Thread.sleep(2000);
	WebElement ele1=driver.findElement(By.id("month"));
	Select s=new Select(ele1);
	List<WebElement> opt = s.getOptions();
	ArrayList<String> l=new ArrayList<String>();
	int count = opt.size();
	System.out.println(count);
	for(WebElement we:opt)
	{
		String text=we.getText();
		l.add(text);
	}
 if(l.contains("Sep"))
 {
	 System.out.println("option present");
 }
 else
 {
	 System.out.println("option not present");
 }
}
}

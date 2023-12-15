package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chandu 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/ADMIN/Desktop/Chandu.html");
	Thread.sleep(2000);
	List<WebElement> clear1 = driver.findElements(By.xpath("//input[.='chandu']"));
	int count=clear1.size();
	System.out.println(clear1);
	for(int i=5;i>count;i++)
	{
		WebElement we = clear1.get(i);
		we.clear();
	}
	
}
}

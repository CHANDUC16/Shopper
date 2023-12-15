package selenium;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Courses_qspiders 
{
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage(). window().maximize();
	driver.get("https://www.qspiders.com/courses");
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	for(int i=0;i<1;i++)
	{
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
	}
	driver.findElement(By.xpath("(//span[.='Details'])[6]")).click();
	for(int j=0;j<4;j++)
	{
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
	}
	 //WebElement ele = driver.findElement(By.xpath("(//p[@class='card-header-title has-text-persian'])[3]")).click();
	//WebElement ele2= ele2.click();
	 WebElement ele1 = driver.findElement(By.xpath("(//p[@class='card-header-title has-text-persian'])[3]"));
		Select s = new Select(ele1);
		ArrayList<String> l = new ArrayList<String>();
		List<WebElement> opt = s.getOptions();
		for (WebElement w : opt)
		{
		String text = w.getText();
		l.add(text);
		}
	//Select s = new Select(ele);
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dst=new File("C:\\Users\\ADMIN\\Pictures\\New folder (3)\\act.jpg");
	FileHandler.copy(src, dst);
	/*WebElement ele1 = driver.findElement(By.xpath("(//p[@class='card-header-title has-text-persian'])[3]"));
	Select s = new Select(ele1);
	ArrayList<String> l = new ArrayList<String>();
	List<WebElement> opt = s.getOptions();
	for (WebElement w : opt)
	{
	String text = w.getText();
	l.add(text);
	}*/
	driver.close();
}
}
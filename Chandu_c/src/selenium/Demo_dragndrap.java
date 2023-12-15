package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_dragndrap 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demoapps.qspiders.com/dragDrop");
	Thread.sleep(1000);
	WebElement src = driver.findElement(By.xpath("//div[.='Mobile Charger']"));
	WebElement src1= driver.findElement(By.xpath("//div[.='Laptop Charger']"));
	WebElement src2 = driver.findElement(By.xpath("//div[.='Mobile Cover']"));
	WebElement src3 = driver.findElement(By.xpath("//div[.='Laptop Cover']"));
	WebElement dst = driver.findElement(By.xpath("//div[.='Mobile Accessories']"));
	WebElement dst1 = driver.findElement(By.xpath("//div[.='Laptop Accessories']"));
	Actions act = new Actions(driver);
	act.dragAndDrop(src, dst);
	act.dragAndDrop(src1, dst1);
	act.dragAndDrop(src2, dst);
	act.dragAndDrop(src3, dst1);
	
	
}
}

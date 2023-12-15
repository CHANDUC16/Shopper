package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_qspiders
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demoapps.qspiders.com/dropdown");
	Thread.sleep(1000);
	driver.findElement(By.id("phone")).sendKeys("8970939655");
	Thread.sleep(1000);
	WebElement ele = driver.findElement(By.xpath("//select[@id='select2']"));
    Select s = new Select(ele);
    s.selectByVisibleText("Female");
    WebElement ele1 = driver.findElement(By.xpath("//select[@id='select3']"));
    Select s1 = new Select(ele1);
    s1.selectByVisibleText("India");
    WebElement ele3 = driver.findElement(By.xpath("//select[@id='select5']"));
    Select s2 = new Select(ele3);
    s2.selectByVisibleText("Karnataka");
    WebElement ele4 = driver.findElement(By.xpath("//option[.='Select City']/.."));
    Select s3 = new Select(ele4);
    s3.selectByVisibleText("Ramanagar");
	
	
	
}
}

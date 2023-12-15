package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Title_qqfetch_close 
{
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://skpatro.github.io/demo/links/");
Thread.sleep(2000);
driver.findElement(By.name("NewWindow")).click();
Thread.sleep(1000);
String allwh = driver.getWindowHandle();
for (String wh : args)
{
	driver.switchTo().window(wh);
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.close();
}
}
}

package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_handle
{
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.redbus.com/");
driver.findElement(By.xpath("//label[@for='date']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("(//span[.='29'])[1]")).click();
Alert a = driver.switchTo().alert();
System.out.println(a.getText());
a.accept();


}
}

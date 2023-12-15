package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Resize_browser
{
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
    WebDriver driver=new FirefoxDriver();
  // Dimension d=new Dimension(200,300);
   //driver.manage().window().setSize(d);
    //drag_browser
    Point p=new Point(20,30);
    driver.manage().window().setPosition(p);
}
}

package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_launch
{
public static void main(String[] args) {
	String key="webdriver.gecko.driver";
	String value="./selenium/geckodriver.exe";
	System.setProperty(key, value);
	FirefoxDriver driver=new FirefoxDriver();
}
}

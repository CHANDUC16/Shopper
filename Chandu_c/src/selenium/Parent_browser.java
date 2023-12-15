package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Parent_browser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000); 
		String p_id = driver.getWindowHandle();
		System.out.println(p_id);
}
}

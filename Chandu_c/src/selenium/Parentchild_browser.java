package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Parentchild_browser

{
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://skpatro.github.io/demo/links/");
			Thread.sleep(1000); 
			driver.findElement(By.name("NewTab") ).click();
			Thread.sleep(2000);
			Set<String> pc_id = driver.getWindowHandles();
			System.out.println(pc_id.size());
			for(String c:pc_id)
			{
				System.out.println(c);
			}
}
}
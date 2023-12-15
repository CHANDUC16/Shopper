package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_upload
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/ADMIN/Documents/Upload.html");
		Thread.sleep(1000); 
		WebElement ele = driver.findElement(By.name("upload file"));
		ele.sendKeys("C:\\Users\\ADMIN\\Desktop\\Chandrakala resume.docx");
	}

	
}

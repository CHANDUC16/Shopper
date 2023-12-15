package softwares;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Runnerscript1 extends GenericScript
{
@Test
public void validLogin()
{
	driver.findElement(By.id("email")).sendKeys("chandu");
	driver.findElement(By.id("pass")).sendKeys("chandu16");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	String title = driver.getTitle();
	System.out.println(title);
	SoftAssert s = new SoftAssert();
	s.assertEquals(title,"facebook");
	System.out.println("1");
	s.assertAll();
}
}

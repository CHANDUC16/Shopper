package softwares;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RunnerScript extends GenericScript
{
@Test
public void validLogin()
{
	driver.findElement(By.id("email")).sendKeys("admin");
}
}

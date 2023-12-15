package softwares;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_1
{
@Test
public void Compose()
{
Reporter.log("compose",true);	
}
@Test(dependsOnMethods = "Compose")
public void SentItem()
{
	Reporter.log("sentitem",true);
	Assert.fail();
}
@Test(dependsOnMethods = "SentItem")
public void Trash()
{
	Reporter.log("trash",true);
}
}

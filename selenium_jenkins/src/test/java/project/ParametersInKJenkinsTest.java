package project;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParametersInKJenkinsTest 
{
@Test
public void sample()
{
	String browser = System.getProperty("browser");
	Reporter.log(browser,true);
	
}
}

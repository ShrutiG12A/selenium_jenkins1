package project;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParametersInKJenkins 
{
@Test
public void sample()
{
	String browser = System.getProperty("browser");
	Reporter.log(browser,true);
	
}
}

package core.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.aventstack.extentreports.service.ExtentTestManager;

public class utils
{
	public static WebDriver InvokeBrowser(String browserType, String url)
	{ 
		try
		{
			WebDriver driver=null;
			//Browser configured & invoked
			if(browserType.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","E:\\Vision IT\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
			}else if(browserType.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.chrome.driver","E:\\Vision IT\\chromedriver_win32\\chromedriver.exe");
				 //driver=new FirefoxDriver();
			}
			//url="http://zero.webappsecurity.com/login.html";
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(url);
			Reporter.log("Browser chrome invoked with url");
			return driver;
		}catch(Exception e)
		{
			Reporter.log("Unable to invoke browser");
			return null;
		}
	}
	public static void WriteLogs(String logType,String msg)
	{
	   Reporter.log(logType + "-" + msg ,true);
	   switch(logType.toLowerCase())
	   {
	   case "Pass":
	      ExtentTestManager.getTest().pass(msg);
	      break;
	   case "Fail":
		      ExtentTestManager.getTest().pass(msg);
		      break;
	   case "info":
		      ExtentTestManager.getTest().pass(msg);
		      break;
	   case "fatal":
		      ExtentTestManager.getTest().pass(msg);
		      break;
		            
	   }
}
}


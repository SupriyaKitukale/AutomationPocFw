package retailbanking.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import core.utils.utils;

public class Settings_PO 
{
	WebDriver driver;

	public Settings_PO(WebDriver d)
	{
		driver =d;
	}
	// Elements or locators
	@FindBy(how =How.LINK_TEXT,using="//a[@class='dropdown-toggle']")
	WebElement settings;
	
	@FindBy(how =How.LINK_TEXT,using="Help")
	WebElement help;
	
	public void set_Login()
	{ 
		try 
		{
			settings.click();;
		utils.WriteLogs("Info","click on settings button");
	}
	catch(Exception e)
	{
		e.printStackTrace();
		utils.WriteLogs("Info","unable to click on settings button");
	}
		}
	public void set_Help()
	{ 
		try 
		{
			help.click();;
		utils.WriteLogs("Info","click on help");
	}
	catch(Exception e)
	{
		e.printStackTrace();
		utils.WriteLogs("Info","unable to click on help");
	}
		}
	
	
	
}

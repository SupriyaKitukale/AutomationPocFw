package retailbanking.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.Reporter;

import core.utils.utils;

public class Login_PO 
{
	WebDriver driver;
	//public PO_Login(WebDriver d)
	public Login_PO(WebDriver d)
	{
		driver =d;
	}
	// Elements or locators
	//@FindBy(how =How.XPATH,using="//input[@id='user_login']")
	@FindBy(how =How.NAME,using="user_login")
	WebElement txtbx_username;

	//@FindBy(how =How.XPATH,using="//input[@id='user_password']")
	@FindBy(how =How.NAME,using="user_password")
	WebElement txtbx_password;

	@FindBy(how =How.XPATH,using="//input[@value='Sign in']")
	WebElement btn_submit;

	//private byte[] actual;

	//Methods
	public void set_username(String u)
	{ try {
		txtbx_username.sendKeys(u);
		utils.WriteLogs("info","Useranme set value is" );
	}
	catch(Exception e)
	{
		e.printStackTrace();
		utils.WriteLogs("info","unable to set username");
	}}

	public void set_password(String u)
	{ try {
		txtbx_password.sendKeys(u);
		utils.WriteLogs("info","password value is");
	}
	catch(Exception e)
	{
		e.printStackTrace();
		utils.WriteLogs("info","unable to set password");
	}}

	public void set_Login()
	{ try {
		btn_submit.click();;
		utils.WriteLogs("Info","click on submit button");
	}
	catch(Exception e)
	{
		e.printStackTrace();
		utils.WriteLogs("Info","unable to click on submit button");
	}}
	public void KW_LoginIntoApplication(String u,String p)
	{try 
	{
		set_username(u);
		set_password(p);
		set_Login();
		utils.WriteLogs("Info","Click on submit button ");
		//checkpoint
		String expected="Zero - Account Summary";
		String actual=driver.getTitle();

		//byte[] expected = null;
		Assert.assertEquals(expected, actual);
	}catch(Exception e)
	{
		e.printStackTrace();
		utils.WriteLogs("Info","unable to click on submit button");
	}

	}

}

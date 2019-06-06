package retailbanking.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import core.utils.utils;

public class OnlineStatement 
{
WebDriver driver;


public OnlineStatement (WebDriver driver)
{
	this.driver=driver;
}

//Page elements
@FindBy(how= How.ID, using="os_accountId")
private WebElement List_Account;

@FindBy(how= How.XPATH,using="//a[contains(text(),'2012')]")
private WebElement Statement_2012;

@FindBy(how= How.XPATH, using="//a[contains(text(),'2011')]")
private WebElement Statement_2011;

@FindBy(how= How.XPATH, using="//a[contains(text(),'2010')]")
private WebElement Statement_2010;

@FindBy(how= How.XPATH, using="//a[contains(text(),'2009')]")
private WebElement Statement_2009;

//methods
public void ShowAccount(String value)
{
	try
	{
		Select list=new Select(List_Account);
		list.selectByVisibleText(value);

		utils.WriteLogs("Info","Select from  account link");
	}catch(Exception e)
	{
		e.printStackTrace();
		utils.WriteLogs("Info","select from account link");
	}
}
public void Link_statement_2012()
{
	try
	{
		Statement_2012.click();
		utils.WriteLogs("Info","click on year 2012 link");
	}catch(Exception e)
	{
		e.printStackTrace();
		utils.WriteLogs("Info","unable click on year link");
	}
}

public void Link_statement_2011()
{
	try
	{
		Statement_2011.click();
		utils.WriteLogs("Info","click on year 2011 link");
	}catch(Exception e)
	{
		e.printStackTrace();
		utils.WriteLogs("Info","unable click on year link");
	}
}

public void Link_statement_2010()
{
	try
	{
		Statement_2010.click();
		utils.WriteLogs("Info","click on year 2010 link");
	}catch(Exception e)
	{
		e.printStackTrace();
		utils.WriteLogs("Info","unable click on year link");
	}
}

public void Link_statement_2009()
{
	try
	{
		Statement_2009.click();
		utils.WriteLogs("Info","click on year 2010 link");
	}catch(Exception e)
	{
		e.printStackTrace();
		utils.WriteLogs("Info","unable click on year link");
	}
}

public void KW_AllYear_statement(String acct)
{
	try
	{
	ShowAccount(acct);	
	Link_statement_2012();
	Link_statement_2011();
	Link_statement_2010();
	Link_statement_2009();
	
	utils.WriteLogs("Info","Page navigated to online statment");
	}catch(Exception e)
	{
		e.printStackTrace();
		utils.WriteLogs("Info","Page not navigated to online statement");

	}
	
	}
}

package retailbanking.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import core.utils.utils;

public class Common_PO 
{
	WebDriver driver;
	public Common_PO(WebDriver d)
	{
		driver=d;
	}

	//Page elements
	@FindBy(how= How.LINK_TEXT, using="Account Summary")
	WebElement link_AccountSummary;

	@FindBy(how= How.LINK_TEXT, using="Transfer Funds")
	WebElement link_TransferFunds;
	
	@FindBy(how= How.LINK_TEXT, using="Account Activity")
	WebElement link_AccountActivity;
	
	@FindBy(how= How.LINK_TEXT, using="Online Statements")
	WebElement link_online_statement;
	
	@FindBy(how= How.LINK_TEXT, using="Pay Bills")
	WebElement link_PayBills;
	
	@FindBy(how= How.XPATH, using="//input[@id='searchTerm' and @placeholder='Search']")
	WebElement link_Searchbox;
	
	@FindBy(how= How.LINK_TEXT, using="//a[@class='dropdown-toggle']")
	WebElement link_Settings;
	
	@FindBy(how= How.LINK_TEXT, using="My Money Map")
	WebElement MoneyMap;

	
	//methods
	public void Cick_on_TransferFunds()
	{
		try
		{
			link_TransferFunds.click();
			utils.WriteLogs("Info","Clicked on transfer funds link");
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info","Unable to Clicked on transfer funds link");
}	}
	public void Cick_on_AccountActivity()
	{
		try
		{
			link_AccountActivity.click();
			utils.WriteLogs("Info","Clicked on Accountactivity link");
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info","Unable to Clicked on Accountactivity link");
         }
		}
	
	public void Click_on_OnlineStatement()
	{
		try
		{
			link_online_statement.click();
			utils.WriteLogs("Info","Clicked on Onlinestatement link");
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info","Unable to Clicked on Onlinestatement link");
         }
		}
	
	public void PayBills_PO ()
	{
		try
		{
			link_PayBills.click();
			utils.WriteLogs("Info","Clicked on Onlinestatement link");
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info","Unable to Clicked on Onlinestatement link");
         }
		}
	public void AccountSummary_PO ()
	{
		try
		{
			link_AccountSummary.click();
			utils.WriteLogs("Info","Clicked on account summary link");
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info","Unable to Clicked on Account summary link");
         }
		}
	public void Search_PO ()
	{
		try
		{
			link_Searchbox.click();
			utils.WriteLogs("Info","Clicked on account summary link");
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info","Unable to Clicked on Account summary link");
         }
		}
	public void Settings_PO ()
	{
		try
		{
			link_Settings.click();
			utils.WriteLogs("Info","Clicked on settings link");
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info","Unable to Clicked on settings link");
         }
		}

	public void MyMoneyMap ()
	{
		try
		{
			MoneyMap.click();
			utils.WriteLogs("Info","Clicked on mmp link");
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info","Unable to Clicked on mmp link");
         }
		}




}


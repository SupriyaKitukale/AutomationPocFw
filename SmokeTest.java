package retailbanking.tc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

import core.utils.utils;


import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;

import retailbanking.po.AccountSummary_PO;
import retailbanking.po.Common_PO;
import retailbanking.po.Login_PO;
import retailbanking.po.MyMoneyMap_PO;
import retailbanking.po.OnlineStatement;
import retailbanking.po.PO_AccountActivity;
import retailbanking.po.PO_TransferFunds;
import retailbanking.po.PayBills_PO;
import retailbanking.po.Search_PO;
import retailbanking.po.Settings_PO;

@Listeners(ExtentITestListenerClassAdapter.class)
public class SmokeTest 
{
	@Parameters({"url","browser"})
	@Test

	public void tc_01_checklogin(String url,String browserType)
	{ 

		try
		{
			url="http://zero.webappsecurity.com/login.html";
			WebDriver driver= utils.InvokeBrowser(browserType, url);
			//init page object elements
			Login_PO login_po=PageFactory.initElements(driver, Login_PO.class);
			//login_po.set_username("username");
			//login_po.set_password("password");
			//login_po.set_Login();
			login_po.KW_LoginIntoApplication("username", "password");



			utils.WriteLogs("Test Pass", "test case completed");
		}catch(Exception e)
		
		{
			utils.WriteLogs("Test Fail", "test case failed");
           Assert.assertFalse(false);
		}
	}
	//@SuppressWarnings("unused")
	//private void Cick_on_TransferFunds() {
	// TODO Auto-generated method stub


	@Parameters({"url","browser"})
	@Test

	public void tc_02_transferFunds(String url,String browserType)
	{
		//url="http://zero.webappsecurity.com/login.html";
		WebDriver driver= utils.InvokeBrowser(browserType, url);
		Login_PO login_po=PageFactory.initElements(driver, Login_PO.class);
		login_po.KW_LoginIntoApplication("username", "password");
				
		//click on Transfer funds
		Common_PO common_po=PageFactory.initElements(driver, Common_PO.class);
		common_po.Cick_on_TransferFunds();

		//transfer funds
		PO_TransferFunds po_transfer_funds =PageFactory.initElements(driver,PO_TransferFunds.class);
		String frm="1";
		String to="2";
		String amt="100";
		String desc="transfer";
		
		po_transfer_funds.KW_FillTransferFunds(frm, to, amt, desc);
	}
	
		@Parameters({"url","browser"})	
		@Test

	public void tc_03_AccountActivity(String url,String browserType)
	{
		WebDriver driver= utils.InvokeBrowser(browserType, url);
		Login_PO login_po=PageFactory.initElements(driver, Login_PO.class);
		login_po.KW_LoginIntoApplication("username", "password");
				
		//click on Account activity
		Common_PO common_po=PageFactory.initElements(driver, Common_PO.class);
		common_po.Cick_on_AccountActivity();

		//transfer funds
		PO_AccountActivity po_account_activity =PageFactory.initElements(driver,PO_AccountActivity.class);
		String val="Loan";
		String desc="MyAccount";
		String famt="500";
		String toamt="1000";
		String type="Withdrawal";
		
		po_account_activity.KW_showTransaction(val);
		
		po_account_activity.KW_Find_Transaction(desc, famt, toamt, type);
		
	}
	@Parameters({"url","browser"})
	@Test

	public void tc_04_OnlineStatement(String url,String browserType)
	{
		WebDriver driver= utils.InvokeBrowser(browserType, url);
		Login_PO login_po=PageFactory.initElements(driver, Login_PO.class);
		login_po.KW_LoginIntoApplication("username", "password");
				
		//click on Account activity
		Common_PO common_po=PageFactory.initElements(driver, Common_PO.class);
		common_po.Click_on_OnlineStatement();

		//transfer funds
		OnlineStatement po_onlinestatement =PageFactory.initElements(driver,OnlineStatement.class);
		po_onlinestatement.KW_AllYear_statement("Loan");	
	}
	
	@Parameters({"url","browser"})
	@Test

	public void tc_05_PayBills(String url,String browserType)
	{
		WebDriver driver= utils.InvokeBrowser(browserType, url);
		Login_PO login_po=PageFactory.initElements(driver, Login_PO.class);
		login_po.KW_LoginIntoApplication("username", "password");
				
		//click on PayBill activity
		Common_PO common_po=PageFactory.initElements(driver, Common_PO.class);
		common_po.PayBills_PO();

		//transfer funds
		PayBills_PO po_paybilldate =PageFactory.initElements(driver,PayBills_PO.class);
		//add save payee
		String payee="Apple";
		String acct="Checking";
		String amt="1000";
		String desc="Pay bill";
		//add new payee
		String payeenm="SK";
		String add="Pune";
		String act="Saving";
		String det="worked at BOM";
		//purchase foreign currency
		String curr="Austerlia";
		String amnt="1000";
		//String usd="2000";
		
		po_paybilldate.KW_PSP_PayBill(payee, acct, amt, desc);
		po_paybilldate.KW_ANP_PayBill(payeenm, add, act, det);
		po_paybilldate.KW_PFC_Currency(curr, amnt);	
	}
	
	@Parameters({"url","browser"})
    @Test

	public void tc_06_AccountSummary(String url,String browserType)
	{
		WebDriver driver= utils.InvokeBrowser(browserType, url);
		Login_PO login_po=PageFactory.initElements(driver, Login_PO.class);
		login_po.KW_LoginIntoApplication("username", "password");
				
		//click on Account activity
		Common_PO common_po=PageFactory.initElements(driver, Common_PO.class);
		common_po.AccountSummary_PO();

		//transfer funds
		AccountSummary_PO po_accountsummary =PageFactory.initElements(driver,AccountSummary_PO.class);
		po_accountsummary.KW_Account_summary();	
	}
	
      @Parameters({"url","browser"})
    @Test

	public void tc_07_Search(String url,String browserType)
	{
		WebDriver driver= utils.InvokeBrowser(browserType, url);
		Login_PO login_po=PageFactory.initElements(driver, Login_PO.class);
		login_po.KW_LoginIntoApplication("username", "password");
				
		//click on Account activity
		Common_PO common_po=PageFactory.initElements(driver, Common_PO.class);
		common_po.AccountSummary_PO();

		//transfer funds
		Search_PO po_search =PageFactory.initElements(driver,Search_PO.class);
		po_search.search("how to open saving account");	
	}
	
	@Parameters({"url","browser"})
    @Test

	public void tc_08_Settings(String url,String browserType)
	{
		WebDriver driver= utils.InvokeBrowser(browserType, url);
		Login_PO login_po=PageFactory.initElements(driver, Login_PO.class);
		login_po.KW_LoginIntoApplication("username", "password");
				
		//click on Account activity
		Common_PO common_po=PageFactory.initElements(driver, Common_PO.class);
		common_po.Settings_PO();

		//transfer funds
		Settings_PO po_setting =PageFactory.initElements(driver,Settings_PO.class);
		po_setting.set_Help();
	}
	
	@Parameters({"url","browser"})
    @Test

	public void tc_09_MyMoneyMap(String url,String browserType)
	{
		WebDriver driver= utils.InvokeBrowser(browserType, url);
		Login_PO login_po=PageFactory.initElements(driver, Login_PO.class);
		login_po.KW_LoginIntoApplication("username", "password");
				
		//click on Account activity
		Common_PO common_po= PageFactory.initElements(driver, Common_PO.class);
		common_po.MyMoneyMap();

		//transfer funds
		MyMoneyMap_PO po_mymoneymap = PageFactory.initElements(driver,MyMoneyMap_PO.class);
		po_mymoneymap.outflow();
	}
	
}


package retailbanking.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import core.utils.utils;

public class PO_TransferFunds
{
	WebDriver driver;
	public PO_TransferFunds(WebDriver driver)
	{
		this.driver=driver;
	}

	//Page elements
	@FindBy(how= How.ID, using="tf_fromAccountId")
	private WebElement List_fromAccount1;

	@FindBy(how= How.ID, using="tf_toAccountId")
	private WebElement List_toAccount;

	@FindBy(how= How.ID, using="tf_amount")
	private WebElement Txtbox_Amount;

	@FindBy(how= How.ID, using="tf_description")
	private WebElement Txtbox_description;

	@FindBy(how= How.ID, using="btn_submit")
	private WebElement btn_continue;

	@FindBy(how= How.XPATH, using="//button[text()='Submit']")
	private WebElement btn_submit;

	@FindBy(how = How.XPATH,using="//h2[@class='board-header']")
	WebElement txt_success_header;


	//method
	public void List_fromAccount1(String value)
	{
		try 
		{
			Select List_fromAccount2=new Select(List_fromAccount1);
			List_fromAccount2.selectByValue(value);
			utils.WriteLogs("Info","selected value is");
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info","unable to select value");
		}
	}
	public void List_toAccount(String value)
	{
		try 
		{
			Select List_toAccount2=new Select(List_toAccount); 	
			List_toAccount2.selectByValue(value);
			utils.WriteLogs("Info","selected value is");
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info","unable to select value");
		}
	}

	public void Set_amount(String value)
	{
		try 
		{
			Txtbox_Amount.sendKeys(value);
			utils.WriteLogs("Info","selected value is");
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info","unable to select value");
		}
	}

	public void Set_description(String value)
	{
		try 
		{
			Txtbox_description.sendKeys(value);
			utils.WriteLogs("Info","selected value is");
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info","unable to select value");
		}
	}


	public void Set_Continue_btn()
	{
		try 
		{
			btn_continue.click();
			utils.WriteLogs("Info","clicked on continue button");
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info","unable to click on continue button");
		}
	}
	public void clickOnSubmit()
	{
		try
		{
			btn_submit.click();
			utils.WriteLogs("Info","Clicked on submit button");
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info","unable to click on submit button");
		}

	}


	public void KW_FillTransferFunds(String frm,String to,String amt,String desc)
	{
		try
		{
			List_fromAccount1(frm);
			List_toAccount(to);
			Set_amount(amt);
			Set_description(desc);
			Set_Continue_btn();

			//validation point
			Assert.assertEquals(btn_submit.isDisplayed(), true);
			Assert.assertEquals(List_fromAccount1.isEnabled(), false);
			utils.WriteLogs("Info","Page navigated to transfer funds");

			clickOnSubmit();
			//Reporter.log("pass","Page Navigated to Transfer Funds Verify page");
			
			//Checkpoint to validate the Exepcted Text and values
			String expected = txt_success_header.getText();
			String actual = "Transfer Money & Make Payments - Confirm";
			Assert.assertEquals(actual, expected);
			
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info","unable to fill transfer page");
		}
	}


}





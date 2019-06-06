package retailbanking.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import core.utils.utils;

public class PO_AccountActivity
{
	WebDriver driver;
	public PO_AccountActivity(WebDriver driver)
	{
		this.driver=driver;
	}
	//Page elements
	/*@FindBy(how= How.LINK_TEXT, using="Find Transactions")
	private WebElement find_transaction;

	public void clickOnfindTransaction()
	{
		try
		{
			find_transaction.click();
			utils.WriteLogs("Info","Clicked on find transaction link");
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info","unable to click on f trindansaction link");
		}

	}*/

	@FindBy(how= How.LINK_TEXT, using="Show Transactions")
	private WebElement show_transaction;

	@FindBy(how=How.ID, using="aa_accountId")
	private WebElement show_account;

	@FindBy(how= How.LINK_TEXT, using="Find Transactions")
	private WebElement find_transaction;

	@FindBy(how=How.ID ,using ="aa_description")
	private WebElement Txtbox_description;

	@FindBy(how=How.ID ,using ="aa_fromAmount")
	private WebElement Frm_Amount;

	@FindBy(how=How.ID ,using ="aa_toAmount")
	private WebElement To_Amount;

	@FindBy(how=How.ID ,using ="aa_type")
	private WebElement Type;

	@FindBy(how=How.XPATH ,using ="//button[contains(text(),'Find')]")
	private WebElement find_button;

	@FindBy(how=How.XPATH ,using ="//input[@id='aa_fromDate' and @name='fromDate']")
	private WebElement Frm_Dates;

	@FindBy(how=How.XPATH ,using ="//span[contains (text(),'Next')]")
	private WebElement Click_on_next_button;
	
	@FindBy(how=How.ID ,using ="//table[@class='ui-datepicker-calendar']/tbody/tr[5]/td[1]")
	private WebElement curmonth;

	//@FindBy(how=How.XPATH ,using ="//a[text()='30']")
	//private WebElement Click_on_day;

	@FindBy(how=How.XPATH ,using ="//input[@id='aa_toDate' and @name='toDate']")
	private WebElement To_Dates;

	@FindBy(how=How.XPATH ,using ="//span[contains (text(),'Next')]")
	private WebElement Click_on_next_button1;
	
	@FindBy(how=How.ID ,using ="//table[@class='ui-datepicker-calendar']/tbody/tr[5]/td[6]")
	private WebElement curmonth1;

	//@FindBy(how=How.XPATH ,using ="//a[text()='30']")
	//private WebElement Click_on_day1;



	public void SetFromDate()
	{
		try
		{
			Frm_Dates.click();
			Click_on_next_button.click();;
			curmonth.click();
			//Click_on_day.click();
		
			/*Frm_Dates.click();

		String ExpMonth="September 2019";
		String CurrentMonth=curmonth.getText();

		if(ExpMonth.equals(CurrentMonth))
		{
			System.out.println("month already selected");
		}
		else
		{
			for(int i=0;i<5;i++)
			{
				Click_on_next_button.click();

				if(ExpMonth.equals(CurrentMonth))
				{
					System.out.println("month selected");
					break;
				}
				Click_on_day.click();
			}
		}*/
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info", "unable to select date");
		}
	
	}

	public void Set_To_Date()
	{
		try
		{
			To_Dates.click();
			Click_on_next_button1.click();
			curmonth1.click();
			//Click_on_day1.click();
		/*To_Dates.click();

		String ExpMonth="October 2019";
		String CurrentMonth=curmonth1.getText();

		if(ExpMonth.equals(CurrentMonth))
		{
			System.out.println("month already selected");
		}
		else
		{
			for(int i=0;i<5;i++)
			{
				Click_on_next_button1.click();

				if(ExpMonth.equals(CurrentMonth))
				{
					System.out.println("month selected");
					break;
				}
				Click_on_day1.click();
			}
		}*/
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info","unable to click on show transaction link");
		}
	}


	public void clickOnShowTransaction()
	{
		try
		{
			show_transaction.click();
			utils.WriteLogs("Info","Clicked on show transaction link");
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info","unable to click on show transaction link");
		}

	}

	public void clickOnShowAccount(String value)
	{
		try
		{
			Select list=new Select(show_account);
			list.selectByVisibleText("Loan");

			utils.WriteLogs("Info","Clicked on show account link");
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info","unable to click on show account link");
		}


	}

	public void clickOnFindTransaction()
	{
		try
		{
			find_transaction.click();
			utils.WriteLogs("Info","Clicked on find transaction link");
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info","unable to click on find transaction link");
		}

	}



	public void Set_Description(String value)
	{
		try 
		{
			Txtbox_description.sendKeys(value);
			utils.WriteLogs("Info","Clicked on find transaction link");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info","unable to select value");
		}
	}


	public void Frm_Amount(String value)
	{
		try 
		{
			Frm_Amount.sendKeys(value);
			utils.WriteLogs("Info","selected value is");
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info","unable to select value");
		}
	}
	public void To_Amount(String value)
	{
		try 
		{
			To_Amount.sendKeys(value);
			utils.WriteLogs("Info","selected value is");
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info","unable to select value");
		}
	}
	public void Type(String value)
	{
		try 
		{
			Select list=new Select(Type);
			list.selectByVisibleText(value);

			utils.WriteLogs("Info","selected value is");
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info","unable to select value");
		}
	}
	public void Find_button()
	{
		try 
		{

			find_button.click();
			utils.WriteLogs("Info","selected value is");
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info","unable to select value");
		}
	}
	public void KW_showTransaction(String val)
	{
		try {

			clickOnShowTransaction();
			clickOnShowAccount(val);
			utils.WriteLogs("Info","Page navigated to show transaction");
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info","Page not navigated to show transaction");
		}
	}

	public void KW_Find_Transaction(String desc,String famt,String toamt,String type)
	{
		try {

			clickOnFindTransaction();
			Thread.sleep(2000);
			Set_Description(desc);
			Thread.sleep(2000);
			SetFromDate();
			Thread.sleep(2000);
            Set_To_Date();
			Thread.sleep(2000);
            Frm_Amount(famt);
			Thread.sleep(2000);
             To_Amount(toamt);
 			Thread.sleep(2000);
             Type(type);
			Find_button();


			utils.WriteLogs("Info","Page navigated to show transaction");
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info","Page not navigated to show transaction");

		}
	}
}

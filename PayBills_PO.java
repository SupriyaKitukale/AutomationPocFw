package retailbanking.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import core.utils.utils;

public class PayBills_PO 
{
	WebDriver driver;
	public PayBills_PO (WebDriver driver)     
	{                                               
		this.driver=driver;                         
	}                                               
	//Page elements                                 
	//Pay saved payee 
	@FindBy(how=How.LINK_TEXT ,using ="Pay Saved Payee")    
	private WebElement link_paysavepayee ; 

	@FindBy(how=How.ID ,using ="sp_payee")    
	private WebElement drp_Payee ; 

	@FindBy(how=How.ID ,using ="sp_account")    
	private WebElement drp_Account ; 

	@FindBy(how=How.ID ,using ="sp_amount")    
	private WebElement txtbox_Amount ; 

	@FindBy(how=How.ID ,using ="sp_date")    
	private WebElement date ; 

	@FindBy(how=How.XPATH,using ="//div[@class='ui-datepicker-title']")    
	private WebElement currmonth ;

	@FindBy(how=How.XPATH,using ="//span[text()='Next']")    
	private WebElement click_on_next_button ;

	@FindBy(how=How.XPATH,using ="//a[text()='29']")    
	private WebElement click_on_day ;

	@FindBy(how=How.ID ,using ="sp_description")    
	private WebElement txtbox_Description ; 

	@FindBy(how=How.ID ,using ="pay_saved_payees")    
	private WebElement Button_Pay ; 

	//Pay saved payee methods
	public void Payee(String value)                                    
	{                                                                               
		try                                                                         
		{                                                                           
			Select list=new Select(drp_Payee);                                   
			list.selectByVisibleText(value);                                       

			utils.WriteLogs("Info","Select from list of payee");                 
		}catch(Exception e)                                                         
		{                                                                           
			e.printStackTrace();                                                    
			utils.WriteLogs("Info","unable to select from list of payee");         
		}                                                                           
	}   

	public void Account(String value)                                    
	{                                                                               
		try                                                                         
		{                                                                           
			Select list=new Select(drp_Account);                                   
			list.selectByVisibleText(value);                                       

			utils.WriteLogs("Info","Select from list of Account");                 
		}catch(Exception e)                                                         
		{                                                                           
			e.printStackTrace();                                                    
			utils.WriteLogs("Info","unable to select from list of Account");         
		}                                                                           
	}   

	public void Amount(String value)                                    
	{                                                                               
		try                                                                         
		{                                                                                                             
			txtbox_Amount.sendKeys(value);                                      

			utils.WriteLogs("Info","Print Amount");                 
		}catch(Exception e)                                                         
		{                                                                           
			e.printStackTrace();                                                    
			utils.WriteLogs("Info","unable to print Amount");         
		}                                                                           
	}   

	public void SetPayBillDate()
	{
		try
		{
			date.click();
			String ExpMonth="September 2019";
			String CurrentMonth=currmonth.getText();
			if(ExpMonth.equals(CurrentMonth))
			{
				System.out.println("Monh already selected");
			}else
			{
				for(int i=0;i<5;i++)
				{
					click_on_next_button.click();
					CurrentMonth=currmonth.getText();
					if(ExpMonth.equals(CurrentMonth))
					{
						System.out.println("Month selected");
						break;
					}
				}
				click_on_day.click();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
			utils.WriteLogs("Info", "unable to select date");
		}
	}

	public void Description(String value)                                    
	{                                                                               
		try                                                                         
		{                                                                                                             
			txtbox_Description.sendKeys(value);                                      

			utils.WriteLogs("Info","Print on textbox");                 
		}catch(Exception e)                                                         
		{                                                                           
			e.printStackTrace();                                                    
			utils.WriteLogs("Info","unable to print on textbox");         
		}                                                                           
	}   

	public void PayBill()                                  
	{                                                                               
		try                                                                         
		{                                                                                                             
			Button_Pay.click();                                     

			utils.WriteLogs("Info","click on pay button");                 
		}catch(Exception e)                                                         
		{                                                                           
			e.printStackTrace();                                                    
			utils.WriteLogs("Info","unable to click on pay button");         
		}                                                                           
	}   
	public void KW_PSP_PayBill(String payee,String acct,String amt,String desc)         
	{                                                                                         
		try { 

			Payee(payee);
			Account(acct);
			Amount(amt);
			SetPayBillDate();
			Description(desc);
			PayBill();
			utils.WriteLogs("Info","Page navigated to pay saved payee");                     
		}catch(Exception e)                                                                   
		{                                                                                     
			e.printStackTrace();                                                              
			utils.WriteLogs("Info","Page not navigated to pay saved payee");                 

		}                                                                                     
	}  

	//Webelement of add new payee

	@FindBy(how=How.LINK_TEXT ,using ="Add New Payee")    
	private WebElement link_AddNewPayee ; 

	@FindBy(how=How.ID ,using ="np_new_payee_name")    
	private WebElement Txtbox_payee_name ; 

	@FindBy(how=How.ID ,using ="np_new_payee_address")    
	private WebElement Txtbox_payee_add ; 

	@FindBy(how=How.ID ,using ="np_new_payee_account")    
	private WebElement Txtbox_Account ; 

	@FindBy(how=How.ID ,using ="np_new_payee_details")    
	private WebElement Txtbox_Payee_details ; 

	@FindBy(how=How.ID ,using ="add_new_payee")    
	private WebElement Button_AddNewPayee; 

	//methods of Add new payee

	public void Link_AddNewPayee()                                  
	{                                                                               
		try                                                                         
		{                                                                                                             
			link_AddNewPayee.click();                                     

			utils.WriteLogs("Info","click on pay add new payee linl");                 
		}catch(Exception e)                                                         
		{                                                                           
			e.printStackTrace();                                                    
			utils.WriteLogs("Info","unable to click on add new payee link");         
		}                                                                           
	}   
	public void PayeeName(String value)                                  
	{                                                                               
		try                                                                         
		{                                                                                                             
			Txtbox_payee_name.sendKeys(value);                                    

			utils.WriteLogs("Info","payee name filled");                 
		}catch(Exception e)                                                         
		{                                                                           
			e.printStackTrace();                                                    
			utils.WriteLogs("Info","unable to fill payee name");         
		}                                                                           
	}  

	public void PayeeAddress(String value)                                  
	{                                                                               
		try                                                                         
		{                                                                                                             
			Txtbox_payee_add.sendKeys(value);                                    

			utils.WriteLogs("Info","payee add filled");                 
		}catch(Exception e)                                                         
		{                                                                           
			e.printStackTrace();                                                    
			utils.WriteLogs("Info","unable to fill payee add");         
		}                                                                           
	}  

	public void PayeeAccount(String value)                                  
	{                                                                               
		try                                                                         
		{                                                                                                             
			Txtbox_Account.sendKeys(value);                                    

			utils.WriteLogs("Info","payee account filled");                 
		}catch(Exception e)                                                         
		{                                                                           
			e.printStackTrace();                                                    
			utils.WriteLogs("Info","unable to fill payee account");         
		}                                                                           
	}  
	public void PayeeDetails(String value)                                  
	{                                                                               
		try                                                                         
		{                                                                                                             
			Txtbox_Payee_details.sendKeys(value);                                    

			utils.WriteLogs("Info","payee details filled");                 
		}catch(Exception e)                                                         
		{                                                                           
			e.printStackTrace();                                                    
			utils.WriteLogs("Info","unable to fill payee details");         
		}                                                                           
	}  
	public void Button_add()                                  
	{                                                                               
		try                                                                         
		{                                                                                                             
			Button_AddNewPayee.click();                                    

			utils.WriteLogs("Info","click into add payee ");                 
		}catch(Exception e)                                                         
		{                                                                           
			e.printStackTrace();                                                    
			utils.WriteLogs("Info","unable to click into add payee");         
		}                                                                           
	}  

	public void KW_ANP_PayBill(String payeenm,String add,String act,String det)         
	{                                                                                         
		try { 
			Link_AddNewPayee();
			PayeeName(payeenm);
			PayeeAddress(add);
			PayeeAccount(act);
			PayeeDetails(det);
			Button_add();


			utils.WriteLogs("Info","Page navigated to add new payee");                     
		}catch(Exception e)                                                                   
		{                                                                                     
			e.printStackTrace();                                                              
			utils.WriteLogs("Info","Page not navigated to add new payee");                 

		}                                                                                     
	}  

	//Webelements of purchase foreign currency

	@FindBy(how=How.LINK_TEXT ,using ="Purchase Foreign Currency")    
	private WebElement link_purchase_foreign_currency ; 

	@FindBy(how=How.ID ,using ="pc_currency")    
	private WebElement Drpdown_Currency ; 

	@FindBy(how=How.ID ,using ="pc_amount")    
	private WebElement txtbox_amount ; 

	@FindBy(how=How.ID ,using ="pc_inDollars_true")    
	private WebElement radio_USD ; 

	@FindBy(how=How.ID ,using ="pc_inDollars_false")    
	private WebElement radio_selected_currency ; 

	@FindBy(how=How.ID ,using ="pc_calculate_costs")    
	private WebElement button_calculated_cost ; 

	@FindBy(how=How.ID ,using ="purchase_cash")    
	private WebElement button_Purchase_Cash ; 

	//Method of purchase foreign currency

	public void Link_Purchase_foreign_currency()                                    
	{                                                                               
		try                                                                         
		{                                                                                                                                                  
			link_purchase_foreign_currency.click();                                                                   
			utils.WriteLogs("Info","click on purchase foreign currency link");                 
		}catch(Exception e)                                                         
		{                                                                           
			e.printStackTrace();                                                    
			utils.WriteLogs("Info","unable to click on purchase foreign currency link");         
		}                                                                           
	}   

	public void drp_Currency(String value)                                    
	{                                                                               
		try                                                                         
		{      Drpdown_Currency.sendKeys(value);   
		       Drpdown_Currency.click();

		utils.WriteLogs("Info","Select from list of country");                 
		}catch(Exception e)                                                         
		{                                                                           
			e.printStackTrace();                                                    
			utils.WriteLogs("Info","unable to select from list of country");         
		}                                                                           
	} 

	public void Txt_Amount(String value)                                    
	{                                                                               
		try                                                                         
		{                                                                                                                                                 
			txtbox_amount.sendKeys(value);                                                                      
			utils.WriteLogs("Info","enter amount");                 
		}catch(Exception e)                                                         
		{                                                                           
			e.printStackTrace();                                                    
			utils.WriteLogs("Info","unable to enter amount");         
		}                                                                           
	}   
	public void radio_USD()                                    
	{                                                                               
		try                                                                         
		{         
			radio_USD.click();
			utils.WriteLogs("Info","click on usd radio button");                 
		}catch(Exception e)                                                         
		{                                                                           
			e.printStackTrace();                                                    
			utils.WriteLogs("Info","unable to click on radio button");         
		}                                                                           
	}   
	public void radio_SelectedCurrency()                                    
	{                                                                               
		try                                                                         
		{         
			radio_selected_currency.click();
			utils.WriteLogs("Info","click on usd radio button");                 
		}catch(Exception e)                                                         
		{                                                                           
			e.printStackTrace();                                                    
			utils.WriteLogs("Info","unable to click on radio button");         
		}                                                                           
	}   

	public void button_CalculateCost()                                    
	{                                                                               
		try                                                                         
		{         
			button_calculated_cost.click();
			utils.WriteLogs("Info","click on calculated cost");                 
		}catch(Exception e)                                                         
		{                                                                           
			e.printStackTrace();                                                    
			utils.WriteLogs("Info","unable to click on calculated cost");         
		}                                                                           
	}   

	public void Purchase_cash()                                    
	{                                                                               
		try                                                                         
		{         
			button_Purchase_Cash.click();
			utils.WriteLogs("Info","click on purchase cash button");                 
		}catch(Exception e)                                                         
		{                                                                           
			e.printStackTrace();                                                    
			utils.WriteLogs("Info","unable to click on purchase cash button");         
		}                                                                           
	}   

	public void KW_PFC_Currency(String curr,String amnt)         
	{                                                                                         
		try { 
			Link_Purchase_foreign_currency();
			drp_Currency(curr);
			Txt_Amount(amnt);
			radio_USD();
			radio_SelectedCurrency();
			button_CalculateCost();
			Purchase_cash();


			utils.WriteLogs("Info","Page navigated to purchase foreign currency");                     
		}catch(Exception e)                                                                   
		{                                                                                     
			e.printStackTrace();                                                              
			utils.WriteLogs("Info","Page not navigated to purchase foreign currency");                 

		}                                                                                     
	}  





















}
























package retailbanking.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import core.utils.utils;

public class AccountSummary_PO 
{
	WebDriver driver;
	public AccountSummary_PO (WebDriver driver)     
	{                                               
		this.driver=driver;                         
	}                                               
	//Page elements 
	
	@FindBy(how=How.LINK_TEXT ,using ="Account Summary")    
	private WebElement account_summary; 
	
	@FindBy(how=How.LINK_TEXT ,using ="Savings")    
	private WebElement link_savings; 
	
	@FindBy(how=How.LINK_TEXT ,using ="Brokerage")    
	private WebElement link_brokerage ;	
	
	@FindBy(how=How.LINK_TEXT ,using ="Checking")    
	private WebElement link_checkings ;
	
	@FindBy(how=How.LINK_TEXT ,using ="Credit Card")    
	private WebElement credit_card ;
	
	@FindBy(how=How.LINK_TEXT ,using ="Loan")    
	private WebElement loan ;
	
	//Methods
	
	public void Savings()                                  
	{                                                                               
		try                                                                         
		{                                                                                                             
			link_savings.click();                                     

			utils.WriteLogs("Info","click on saving link");                 
		}catch(Exception e)                                                         
		{                                                                           
			e.printStackTrace();                                                    
			utils.WriteLogs("Info","unable to click on saving link");         
		}                                                                           
	}   
	
	public void Brokerage()                                  
	{                                                                               
		try                                                                         
		{                                                                                                             
			link_brokerage.click();                                     

			utils.WriteLogs("Info","click on brokerage link");                 
		}catch(Exception e)                                                         
		{                                                                           
			e.printStackTrace();                                                    
			utils.WriteLogs("Info","unable to click on brokerage link");         
		}                                                                           
	}   

	public void Checking()                                  
	{                                                                               
		try                                                                         
		{                                                                                                             
			link_checkings.click();                                     

			utils.WriteLogs("Info","click on checking link");                 
		}catch(Exception e)                                                         
		{                                                                           
			e.printStackTrace();                                                    
			utils.WriteLogs("Info","unable to click on checking link");         
		}                                                                           
	}   

	public void Creditcard()                                  
	{                                                                               
		try                                                                         
		{                                                                                                             
			credit_card.click();                                     

			utils.WriteLogs("Info","click on checking link");                 
		}catch(Exception e)                                                         
		{                                                                           
			e.printStackTrace();                                                    
			utils.WriteLogs("Info","unable to click on checking link");         
		}                                                                           
	}   
	public void Loan()                                  
	{                                                                               
		try                                                                         
		{                                                                                                             
			loan.click();                                     

			utils.WriteLogs("Info","click on checking link");                 
		}catch(Exception e)                                                         
		{                                                                           
			e.printStackTrace();                                                    
			utils.WriteLogs("Info","unable to click on checking link");         
		}                                                                           
	}   
	public void KW_Account_summary()         
	{                                                                                         
		try { 
			Savings();
			Brokerage();
			Checking();
			Creditcard();
			Loan();
		 utils.WriteLogs("Info","Page navigated to pay saved payee");                     
		}catch(Exception e)                                                                   
		{                                                                                     
			e.printStackTrace();                                                              
			utils.WriteLogs("Info","Page not navigated to pay saved payee");                 

		}                                                                                     
	}  

}

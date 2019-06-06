package retailbanking.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import core.utils.utils;

public class Search_PO
{
	WebDriver driver;
	public Search_PO (WebDriver driver)     
	{                                               
		this.driver=driver;                         
	}                                               
	//Page elements 
	
	@FindBy(how=How.ID ,using ="searchTerm")    
	
    private WebElement search ; 

	public void search(String value)                                  
	{                                                                               
		try                                                                         
		{                                                                                                             
			search.sendKeys(value);
			search.clear();

			utils.WriteLogs("Info","click on searchbox");                 
		}catch(Exception e)                                                         
		{                                                                           
			e.printStackTrace();                                                    
			utils.WriteLogs("Info","unable to click on search box");         
		}                                                                           
	}   
















}

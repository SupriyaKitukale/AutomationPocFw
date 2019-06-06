package retailbanking.po;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import core.utils.utils;

public class MyMoneyMap_PO 
{
	WebDriver driver;
	public MyMoneyMap_PO (WebDriver driver)     
	{                                               
		this.driver=driver;                         
	}                                               
	//Page elements 
	
	@FindBy(how=How.XPATH ,using ="//tr[@id='gridview-1021-bd-Spendings']//table//tbody//tr//td[2]")    
      List< WebElement> outflow_webtable ; 
	
	public void outflow()
	{
		try
		{
			String temp;
			double result=0.0,temp1;
			for(int i=0;i<outflow_webtable.size();i++)
			{
			temp=outflow_webtable.get(i).getText();
			temp=temp.replaceAll("$", "");
			temp1=Double.parseDouble(temp);
			result=result+temp1;
			utils.WriteLogs("pass","total is"+result);
			}
	
	}catch(Exception e)
	{
		e.printStackTrace();
		utils.WriteLogs("fail","total is not correct");
Assert.assertFalse(false);
	}
	

}
}
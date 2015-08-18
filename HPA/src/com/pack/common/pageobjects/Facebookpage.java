/**
* Facebook  Class : Contains all the elements 
* in the Facebiik page with the Selenium actions on these elements
*
* @author  Aziza Mustafa
* @version 1.0
* @since   2015-07-26 
*/
package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.pack.utils.ElementActions;

public class Facebookpage {
	private  WebDriver driver;
	
	private  By FUSerNametextBox=By.id("email");
	private  By FPasswordTextBox=By.id("pass");
	private  By FLoginButton=By.id("u_0_2");
	private  By FCancelButton=By.id("u_0_3");
	private  By KeepsLoginCheckBoc=By.id("persist_box");
	
	public Facebookpage(WebDriver driver)
	{
		super();
        this.setDriver(driver);
		
	}
	public  void enterFUserName(String UserName,int WaitSeconds)
	{
		ElementActions UserNameLocator=new ElementActions(driver);
		UserNameLocator.EnterText(FUSerNametextBox, UserName, WaitSeconds);
	    
	}
	public  void enterFPassword(String Password,int WaitSeconds)
	{
		ElementActions PasswordLocator=new ElementActions(driver);
		PasswordLocator.EnterText(FPasswordTextBox, Password, WaitSeconds);
		
	}
	public  void ClickLogin( int WaitSeconds)
	{
		 ElementActions LogInBtn=new ElementActions(driver);
		 LogInBtn.ClickElement(FLoginButton, WaitSeconds);
		
	}
	public  void CheckKeepsLogin(int WaitSeconds)
	{
	   	ElementActions checkBoxLocator=new ElementActions(driver);
	   	checkBoxLocator.ClickElement(KeepsLoginCheckBoc, WaitSeconds);
		
	}
	public  void ClickCancel(int WaitSeconds)
	{
		ElementActions CancelBtn=new ElementActions(driver);
		CancelBtn.ClickElement(FCancelButton, WaitSeconds);
	}

	public  WebDriver getDriver() {
		return driver;
	}
	public  void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}

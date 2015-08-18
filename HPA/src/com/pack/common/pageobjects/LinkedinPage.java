/**
* Linkedin Class : Contains all the elements 
* in the Linkedin page with the Selenium actions on these elements
*
* @author  Aziza Mustafa
* @version 1.0
* @since   2015-07-26 
*/
package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.pack.utils.ElementActions;

public class LinkedinPage {
	private  WebDriver driver;
	
	private  By LUSerNametextBox=By.id("session_key-oauth2SAuthorizeForm");
	private  By LPasswordTextBox=By.id("session_password-oauth2SAuthorizeForm");
	private  By LLoginButton=By.name("authorize");
	private  By LCancelButton=By.xpath("//*[@id='body']/div/form/div[2]/ul/li[2]/a");
	
	public LinkedinPage(WebDriver driver)
	{
		super();
		this.setDriver(driver);
	}
	public  void enterLUserName(String UserName,int WaitSeconds)
	{
		 ElementActions UserNameLocator=new ElementActions(driver);
		 UserNameLocator.EnterText(LUSerNametextBox, UserName, WaitSeconds);
		
	}
	public  void enterLPassword(String Password,int WaitSeconds)
	{
		 ElementActions PasswordLocator=new ElementActions(driver);
		 PasswordLocator.EnterText(LPasswordTextBox, Password, WaitSeconds);
			
	}
	public  void ClickLogin(int WaitSeconds)
	{
		ElementActions LogInBtn=new ElementActions(driver);
		LogInBtn.ClickElement(LLoginButton, WaitSeconds);
		
	}
	public  void ClickCancel(int WaitSeconds)
	{
		ElementActions CancelBtn=new ElementActions(driver);
		CancelBtn.ClickElement(LCancelButton, WaitSeconds);
		
	}
	public  WebDriver getDriver() {
		return driver;
	}
	public  void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	

}

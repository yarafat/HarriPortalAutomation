/**
* Google Class : Contains all the elements 
* in the Google page with the Selenium actions on these elements
*
* @author  Aziza Mustafa
* @version 1.0
* @since   2015-07-26 
*/
package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pack.utils.ElementActions;

public class Google {
	private  WebDriver driver;
	
	private  By GUSerNametextBox=By.id("Email");
	private  By GPasswordTextBox=By.id("Passwd");
	private  By GNextButton=By.id("next");
	private  By GSigninButton=By.id("signIn");
	public Google(WebDriver driver)
	{
		super();
		this.setDriver(driver);
	}
	public  void enterGUserName(String UserName, int WaitSeconds)
	{
		   ElementActions UserNameLocator=new ElementActions(driver);
		   UserNameLocator.EnterText(GUSerNametextBox, UserName, WaitSeconds);
		
	}
	public  void enterGPassword(String Password,int WaitSeconds)
	{
		ElementActions PasswordLocator=new ElementActions(driver);
		PasswordLocator.EnterText(GPasswordTextBox, Password, WaitSeconds);
	
	}
	public  void ClickNext(int WaitSeconds)
	{
		ElementActions NextBtn=new ElementActions(driver);
		NextBtn.ClickElement(GNextButton, WaitSeconds);
		
	}
	public  void ClickSignIn(int WaitSeconds)
	{
		ElementActions SignInBtn=new ElementActions(driver);
		SignInBtn.ClickElement(GSigninButton, WaitSeconds);
		
	}
	public  WebDriver getDriver() {
		return driver;
	}
	public  void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	

}

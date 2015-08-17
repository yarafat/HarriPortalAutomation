/**
* Login Class : Contains all the elements 
* in the Login page with the Selenium actions on these elements
*
* @author  Aziza Mustafa
* @version 1.0
* @since   2015-07-26 
*/
package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.pack.utils.ElementActions;

public class LoginPage {
	
	private  WebDriver driver;
	
	private  String ForgetPassXpath="//*[@id='login-modal']/div/div[2]/div/div/div[3]/div/div/div/div/h-form[1]/form/div[2]/a";
	private  String LoginButtonXpath="//*[@id='login-modal']/div/div[2]/div/div/div[3]/div/div/div/div/h-form[1]/form/div[3]/button";
	private  String SignupLinkXpath="//*[@id='login-modal']/div/div[2]/div/div/div[3]/div/div/div/div/h-form[1]/form/div[5]/a";
	private  String LinkedInButtonXpath="//*[@id='login-modal']/div/div[2]/div/div/div[3]/div/div/div/div/h-form[1]/form/div[7]/button[1]";
	private  String FaceBookButtonXpath="//*[@id='login-modal']/div/div[2]/div/div/div[3]/div/div/div/div/h-form[1]/form/div[7]/button[2]";
	private  String GooglePlusButtonXpath="//*[@id='login-modal']/div/div[2]/div/div/div[3]/div/div/div/div/h-form[1]/form/div[7]/button[3]";
	
	private  By UserNameText=By.id("username");
	private  By PasswordText=By.id("password");
	private  By ForgetPassLink= By.xpath(ForgetPassXpath);
	private  By LoginButton=By.xpath(LoginButtonXpath);
	private  By SignUpLink=By.xpath(SignupLinkXpath);
	private  By LinkedInButton=By.xpath(LinkedInButtonXpath);
	private  By FaceBookButton=By.xpath(FaceBookButtonXpath);
	private  By GooglePlusButton=By.xpath(GooglePlusButtonXpath);
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public  void enterUserName(String userName,int WaitSeconds)
    {
		 ElementActions UserName=new ElementActions(driver);
		 UserName.EnterText(UserNameText, userName, WaitSeconds);
		 
	}
	
	public void enterPassword(String password,int WaitSeconds)
	{
		 ElementActions passwordTxtBox=new ElementActions(driver);
		 passwordTxtBox.EnterText(PasswordText, password, WaitSeconds);
		
	}
	public void clickOnLogin(int WaitSeconds)
	{
		 ElementActions LogInBtn=new ElementActions(driver);
		 LogInBtn.ClickElement(LoginButton, WaitSeconds);
		 
	}
	public  void ClicForgetLink(int WaitSeconds)
	{
		 ElementActions ForgetLink=new ElementActions(driver);
		 ForgetLink.ClickElement(ForgetPassLink, WaitSeconds);
		 
	}
	public  void ClickLinkedInLogin(int WaitSeconds)
	{
		 ElementActions LinkedinBtn=new ElementActions(driver);
		 LinkedinBtn.ClickElement(LinkedInButton, WaitSeconds);
		 
	}
	public  void ClickFaceBookLogin(int WaitSeconds)
	{
		 ElementActions FaceBookBtn=new ElementActions(driver);
		 FaceBookBtn.ClickElement(FaceBookButton, WaitSeconds);
		
	}
	public  void ClickGooglLogin(int WaitSeconds)
	{
		 ElementActions GoogleBtn=new ElementActions(driver);
		 GoogleBtn.ClickElement(GooglePlusButton, WaitSeconds);
		 
	}
	public  void ClickSignUpLink(int WaitSeconds)
	{
		 ElementActions SignUp=new ElementActions(driver);
		 SignUp.ClickElement(SignUpLink, WaitSeconds);
		
	}


}

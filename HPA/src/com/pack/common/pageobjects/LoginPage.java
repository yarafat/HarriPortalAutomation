//Aziza H Mustafa 
package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(UserNameText));		
		WebElement UserName =driver.findElement(UserNameText);
		if(UserName.isDisplayed())
			UserName.sendKeys(userName);
		System.out.println("element was founded and username entered  ");
	}
	
	public void enterPassword(String password,int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordText));
		WebElement passwordTxtBox = driver.findElement(PasswordText);
		if(passwordTxtBox.isDisplayed())
			passwordTxtBox.sendKeys(password);
		System.out.println("element was founded and password entered  ");
	}
	public void clickOnLogin(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LoginButton));
		WebElement LogInBtn = driver.findElement(LoginButton);
		if(LogInBtn.isDisplayed())
			LogInBtn.click();
	}
	public  void ClicForgetLink(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ForgetPassLink));
		WebElement ForgetLink = driver.findElement(ForgetPassLink);
		if(ForgetLink.isDisplayed())
			ForgetLink.click();
	}
	public  void ClickLinkedInLogin(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LinkedInButton));
		WebElement LinkedinBtn = driver.findElement(LinkedInButton);
		if(LinkedinBtn.isDisplayed())
			LinkedinBtn.click();
	}
	public  void ClickFaceBookLogin(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(FaceBookButton));
		WebElement FaceBookBtn = driver.findElement(FaceBookButton);
		if(FaceBookBtn.isDisplayed())
			FaceBookBtn.click();
	}
	public  void ClickGooglLogin(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(GooglePlusButton));
		WebElement GoogleBtn = driver.findElement(GooglePlusButton);
		if(GoogleBtn.isDisplayed())
			GoogleBtn.click();
	}
	public  void ClickSignUpLink(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(SignUpLink));
		WebElement SignUp= driver.findElement(SignUpLink);
		if(SignUp.isDisplayed())
			SignUp.click();
	}


}

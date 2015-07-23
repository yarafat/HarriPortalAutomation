//Aziza H Mustafa 
package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	private static WebDriver driver;
	private static WebDriverWait wait = new WebDriverWait(driver, 5);
	private static String ForgetPassXpath="//*[@id='login-modal']/div/div[2]/div/div/div[3]/div/div/div/div/h-form[1]/form/div[2]/a";
	private static String LoginButtonXpath="//*[@id='login-modal']/div/div[2]/div/div/div[3]/div/div/div/div/h-form[1]/form/div[3]/button";
	private static String SignupLinkXpath="//*[@id='login-modal']/div/div[2]/div/div/div[3]/div/div/div/div/h-form[1]/form/div[5]/a";
	private static String LinkedInButtonXpath="//*[@id='login-modal']/div/div[2]/div/div/div[3]/div/div/div/div/h-form[1]/form/div[7]/button[1]";
	private static String FaceBookButtonXpath="//*[@id='login-modal']/div/div[2]/div/div/div[3]/div/div/div/div/h-form[1]/form/div[7]/button[2]";
	private static String GooglePlusButtonXpath="//*[@id='login-modal']/div/div[2]/div/div/div[3]/div/div/div/div/h-form[1]/form/div[7]/button[3]";
	
	private static By UserNameText=By.id("username");
	private static By PasswordText=By.id("password");
	private static By ForgetPassLink= By.xpath(ForgetPassXpath);
	private static By LoginButton=By.xpath(LoginButtonXpath);
	private static By SignUpLink=By.xpath(SignupLinkXpath);
	private static By LinkedInButton=By.xpath(LinkedInButtonXpath);
	private static By FaceBookButton=By.xpath(FaceBookButtonXpath);
	private static By GooglePlusButton=By.xpath(GooglePlusButtonXpath);
	
	public LoginPage(WebDriver driver)
	{
		super();
		LoginPage.setDriver(driver);
		
	}
	
	public static  void enterUserName(String userName)
    {
		wait.until(ExpectedConditions.visibilityOfElementLocated(UserNameText));
		WebElement UserName = getDriver().findElement(UserNameText);
		if(UserName.isDisplayed())
			UserName.sendKeys(userName);
	}
	
	public static void enterPassword(String password)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordText));
		WebElement passwordTxtBox = getDriver().findElement(PasswordText);
		if(passwordTxtBox.isDisplayed())
			passwordTxtBox.sendKeys(password);
	}
	public static void clickOnLogin()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(LoginButton));
		WebElement LogInBtn = getDriver().findElement(LoginButton);
		if(LogInBtn.isDisplayed())
			LogInBtn.click();
	}
	public static void ClicForgetLink()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(ForgetPassLink));
		WebElement ForgetLink = getDriver().findElement(ForgetPassLink);
		if(ForgetLink.isDisplayed())
			ForgetLink.click();
	}
	public static void ClickLinkedInLogin()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(LinkedInButton));
		WebElement LinkedinBtn = getDriver().findElement(LinkedInButton);
		if(LinkedinBtn.isDisplayed())
			LinkedinBtn.click();
	}
	public static void ClickFaceBookLogin()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(FaceBookButton));
		WebElement FaceBookBtn = getDriver().findElement(FaceBookButton);
		if(FaceBookBtn.isDisplayed())
			FaceBookBtn.click();
	}
	public static void ClickGooglLogin()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(GooglePlusButton));
		WebElement GoogleBtn = getDriver().findElement(GooglePlusButton);
		if(GoogleBtn.isDisplayed())
			GoogleBtn.click();
	}
	public static void ClickSignUpLink()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(SignUpLink));
		WebElement SignUp= getDriver().findElement(SignUpLink);
		if(SignUp.isDisplayed())
			SignUp.click();
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		LoginPage.driver = driver;
	}

}

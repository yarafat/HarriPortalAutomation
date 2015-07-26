package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkedinPage {
	private static WebDriver driver;
	private static WebDriverWait wait = new WebDriverWait(driver, 5);
	private static By LUSerNametextBox=By.id("session_key-oauth2SAuthorizeForm");
	private static By LPasswordTextBox=By.id("session_password-oauth2SAuthorizeForm");
	private static By LLoginButton=By.name("authorize");
	private static By LCancelButton=By.xpath("//*[@id='body']/div/form/div[2]/ul/li[2]/a");
	
	public LinkedinPage(WebDriver driver)
	{
		super();
		LinkedinPage.setDriver(driver);
	}
	public static void enterLUserName(String UserName)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(LUSerNametextBox));
		WebElement UserNameLocator = getDriver().findElement(LUSerNametextBox);
		if(UserNameLocator.isDisplayed())
			UserNameLocator.sendKeys(UserName);
	}
	public static void enterLPassword(String Password)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(LPasswordTextBox));
		WebElement PasswordLocator = getDriver().findElement(LPasswordTextBox);
		if(PasswordLocator.isDisplayed())
			PasswordLocator.sendKeys(Password);
		
	}
	public static void ClickLogin()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(LLoginButton));
		WebElement LogInBtn = getDriver().findElement(LLoginButton);
		if(LogInBtn.isDisplayed())
			LogInBtn.click();
	}
	public static void ClickCancel()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(LCancelButton));
		WebElement LogInBtn = getDriver().findElement(LCancelButton);
		if(LogInBtn.isDisplayed())
			LogInBtn.click();
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		LinkedinPage.driver = driver;
	}
	

}

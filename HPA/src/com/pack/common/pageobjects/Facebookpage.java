package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebookpage {
	private static WebDriver driver;
	private static WebDriverWait wait = new WebDriverWait(driver, 5);
	private static By FUSerNametextBox=By.id("email");
	private static By FPasswordTextBox=By.id("pass");
	private static By FLoginButton=By.id("u_0_2");
	private static By FCancelButton=By.id("u_0_3");
	private static By KeepsLoginCheckBoc=By.id("persist_box");
	
	public Facebookpage(WebDriver driver)
	{
		super();
		Facebookpage.setDriver(driver);
		
	}
	public static void enterFUserName(String UserName)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(FUSerNametextBox));
		WebElement UserNameLocator = getDriver().findElement(FUSerNametextBox);
		if(UserNameLocator.isDisplayed())
			UserNameLocator.sendKeys(UserName);
	}
	public static void enterFPassword(String Password)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(FPasswordTextBox));
		WebElement PasswordLocator = getDriver().findElement(FPasswordTextBox);
		if(PasswordLocator.isDisplayed())
			PasswordLocator.sendKeys(Password);
		
	}
	public static void ClickLogin()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(FLoginButton));
		WebElement LogInBtn = getDriver().findElement(FLoginButton);
		if(LogInBtn.isDisplayed())
			LogInBtn.click();
	}
	public static void CheckKeepsLogin()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(KeepsLoginCheckBoc));
		WebElement checkBoxLocator=getDriver().findElement(KeepsLoginCheckBoc);
		if(checkBoxLocator.isDisplayed())
		{
			checkBoxLocator.click();
		}
		
	}
	public static void ClickCancel()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(FCancelButton));
		WebElement LogInBtn = getDriver().findElement(FCancelButton);
		if(LogInBtn.isDisplayed())
			LogInBtn.click();
	}

	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		Facebookpage.driver = driver;
	}

}

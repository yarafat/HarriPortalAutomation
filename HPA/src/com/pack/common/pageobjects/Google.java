package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google {
	private static WebDriver driver;
	private static WebDriverWait wait = new WebDriverWait(driver, 5);
	private static By GUSerNametextBox=By.id("Email");
	private static By GPasswordTextBox=By.id("Passwd");
	private static By GNextButton=By.name("next");
	private static By GSigninButton=By.id("signIn");
	public Google(WebDriver driver)
	{
		super();
		Google.setDriver(driver);
	}
	public static void enterGUserName(String UserName)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(GUSerNametextBox));
		WebElement UserNameLocator = getDriver().findElement(GUSerNametextBox);
		if(UserNameLocator.isDisplayed())
			UserNameLocator.sendKeys(UserName);
	}
	public static void enterGPassword(String Password)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(GPasswordTextBox));
		WebElement PasswordLocator = getDriver().findElement(GPasswordTextBox);
		if(PasswordLocator.isDisplayed())
			PasswordLocator.sendKeys(Password);
		
	}
	public static void ClickNext()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(GNextButton));
		WebElement NextBtn = getDriver().findElement(GNextButton);
		if(NextBtn.isDisplayed())
			NextBtn.click();
	}
	public static void ClickSignIn()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(GSigninButton));
		WebElement SignInBtn = getDriver().findElement(GSigninButton);
		if(SignInBtn.isDisplayed())
			SignInBtn.click();
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		Google.driver = driver;
	}
	

}

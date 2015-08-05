package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JoinUsPage {
	private  WebDriver driver;
	private String FbBtnXpath="//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[1]/div/div[3]/div[2]/button";
	private String LInBtnXpath="//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[1]/div/div[3]/div[4]/button";
	private String EmailBtnXpath="//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[1]/div/div[3]/button";
	private String LoginLinkXpath="//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[1]/div/div[3]/p[2]/a";
	 private By SignupWithFacebookBtn=By.xpath(FbBtnXpath);
	 private By SignupWithLinkedInBtn=By.xpath(LInBtnXpath);
	 private By SignUpWithEmailBtn=By.xpath(EmailBtnXpath);
	 private By LoginLink=By.xpath(LoginLinkXpath);
	 
	
	public JoinUsPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void ClickRegWithFB(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(SignupWithFacebookBtn));
		WebElement FBBtn = driver.findElement(SignupWithFacebookBtn);
		if(FBBtn.isDisplayed())
			FBBtn.click();
	}
	public void ClickRegWithLinkedin(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(SignupWithLinkedInBtn));
		WebElement LInBtn = driver.findElement(SignupWithLinkedInBtn);
		if(LInBtn.isDisplayed())
			LInBtn.click();
	}
	public void ClickRegWithEmail(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(SignUpWithEmailBtn));
		WebElement EmailBtn = driver.findElement(SignUpWithEmailBtn);
		if(EmailBtn.isDisplayed())
			EmailBtn.click();
	}
	public void ClickLoginLink(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LoginLink));
		WebElement LoginLinkLocator = driver.findElement(LoginLink);
		if(LoginLinkLocator.isDisplayed())
			LoginLinkLocator.click();
	}

}

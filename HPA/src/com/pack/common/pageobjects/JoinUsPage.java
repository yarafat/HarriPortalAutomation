/**
* JoinUsPage  Class : Contains all the elements 
* in the JoinUsPage page with the Selenium actions on these elements
*
* @author  Aziza Mustafa
* @version 1.0
* @since   2015-07-26 
*/
package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pack.utils.ElementActions;

public class JoinUsPage {
	private  WebDriver driver;
	
	/* for join us first modal */
	private String FbBtnXpath="//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[1]/div/div[3]/div[2]/button";
	private String LInBtnXpath="//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[1]/div/div[3]/div[4]/button";
	private String EmailBtnXpath="//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[1]/div/div[3]/button";
	private String LoginLinkXpath="//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[1]/div/div[3]/p[2]/a";
    private By SignupWithFacebookBtn=By.xpath(FbBtnXpath);
    private By SignupWithLinkedInBtn=By.xpath(LInBtnXpath);
    private By SignUpWithEmailBtn=By.xpath(EmailBtnXpath);
    private By LoginLink=By.xpath(LoginLinkXpath);
	 
	/*X button for all modules has the same Xpath */
	private String CloseBtnXpath="//*[@id='join-modal']/div/div[2]/div/button";
	private By CloseModal=By.xpath(CloseBtnXpath);
	private String OkXpath="//*[@id='harriApp']/div[4]/div[2]/div/div[2]/button[1]";
	private By OkBtn=By.xpath(OkXpath);
	private String CancelXpath="//*[@id='harriApp']/div[4]/div[2]/div/div[2]/button[2]";
	private By CancelBtn=By.xpath(CancelXpath); 
	
	
	/* user basic info */
    private By FUserName=By.id("firstname");
    private By LUserName =By.id("lastname");
    private By UserEmail=By.id("email");
    private By UserPhone=By.id("phone");
    private By Password=By.id("password");
    private By ConfirmPassword=By.id("confirm_password");
    private By FirstInfoContinue=By.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[2]/div[2]/form/div[7]/button");
    
    /* user type */
    private String JSXpath="//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[3]/div/form/div[1]/div[2]/div[1]/label/span";
    private String EmpXpath="//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[3]/div/form/div[1]/div[2]/div[3]/label/span";
    private String ContinueSecondStageXpath="//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[3]/div/form/div[3]/button";
    private By JS=By.xpath(JSXpath);
    private By Emp=By.xpath(EmpXpath);
    private By ContinueSecond=By.xpath(ContinueSecondStageXpath);
    
    /**/
    private String LastContinueXpath="//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[19]/div/form/div[3]/button";
    private By FContinue=By.xpath(LastContinueXpath);
    
    public JoinUsPage(WebDriver driver)
	{
		this.driver = driver;
	}
    /*this general method for closing the opened modal , Note: all X button in this SBSL have the same Xpath */
	 public void clickCloseModal(int WaitSeconds)
	 {
		 ElementActions ClickCloseModal=new ElementActions(driver);
		 ClickCloseModal.ClickElement(CloseModal, WaitSeconds);
		 
	 }
	 public void ClickOK(int WaitSeconds)
	 {
		 ElementActions ClickOKBtn=new ElementActions(driver);
		 ClickOKBtn.ClickElement(OkBtn, WaitSeconds);
	 }
	 public void ClickCancel(int WaitSeconds)
	 {
		 ElementActions ClickCancelBtn=new ElementActions(driver);
		 ClickCancelBtn.ClickElement(CancelBtn, WaitSeconds);
	 }
	/* Login page Options*/
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
	
	
	/* user basic info stage/login by email */
	public void enterFirstName(String FName, int WaitSeconds)
	{
		 WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
			wait.until(ExpectedConditions.visibilityOfElementLocated(FUserName));		
			WebElement FirstUserName =driver.findElement(FUserName);
			if(FirstUserName.isDisplayed())
				FirstUserName.sendKeys(FName);
			System.out.println("element was founded and Fusername entered  ");
	}
	public void enterLastName(String LName, int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LUserName));		
		WebElement LastUserName =driver.findElement(LUserName);
		if(LastUserName.isDisplayed())
			LastUserName.sendKeys(LName);
		System.out.println("element was founded and Lusername entered  ");
	}
	public void enterEmail(String Email, int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(UserEmail));		
		WebElement UserEmailAddress =driver.findElement(UserEmail);
		if(UserEmailAddress.isDisplayed())
			UserEmailAddress.sendKeys(Email);
		System.out.println("element was founded and email entered  ");
	}
	public void enterPhone(String PhoneNum, int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(UserPhone));		
		WebElement UserPhoneNumber =driver.findElement(UserPhone);
		if(UserPhoneNumber.isDisplayed())
			UserPhoneNumber.sendKeys(PhoneNum);
		System.out.println("element was founded and Phone entered  ");
	}
	public void enterPass(String Pass, int WaitSeconds)
	{
		Actions actions = new Actions(driver);
		WebElement WebelementLocator = driver.findElement(Password);
		actions.moveToElement(WebelementLocator);
		actions.click();
		actions.sendKeys(Pass);
		actions.build().perform();
		
	}
	public void confirmPass(String Password, int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ConfirmPassword));		
		WebElement ConfriemPass =driver.findElement(ConfirmPassword);
		if(ConfriemPass.isDisplayed())
			ConfriemPass.sendKeys(Password);
		System.out.println("element was founded and Password Confirmed  ");
	}
	public void ClickContineFirst(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(FirstInfoContinue));
		WebElement Continue = driver.findElement(FirstInfoContinue);
		if(Continue.isDisplayed())
			Continue.click();
	}
    
	
	public void chooseJS(int WaitSeconds )
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(JS));
		WebElement Jslbl = driver.findElement(JS);
		if(Jslbl.isDisplayed())
			Jslbl.click();
	}
	public void ChooseEmp(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Emp));
		WebElement Emplbl = driver.findElement(Emp);
		if(Emplbl.isDisplayed())
			Emplbl.click();
	}
	public void ClickContinueSeconStage(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ContinueSecond));
		WebElement Continue = driver.findElement(ContinueSecond);
		if(Continue.isDisplayed())
			Continue.click();
	}
	/* click the continue button on the next stage where there are no control just the continue button*/
	public void ClickContinueBeforeEmpType(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(FContinue));
		WebElement Continue = driver.findElement(FContinue);
		if(Continue.isDisplayed())
			Continue.click();
	}
	public WebDriver getDriver() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setDriver(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	

}
//Aziza H Mustafa
package com.pack.common.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

public class EmployerQuickReg {
	
	private static WebDriver driver;
	private static WebDriverWait wait = new WebDriverWait(driver, 5);
	private static String  LoginLinkXpath="//*[@id='emp-quick-reg-cont']/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a";
	private static String FirstNametxtXpath="//*[@id='app-quick-reg-form']/div[1]/div[1]/div[1]/div/input";
	private static String LastNametxtXpath="//*[@id='app-quick-reg-form']/div[1]/div[2]/div[1]/div/input";
	private static String EmailtxtXpath="//*[@id='app-quick-reg-form']/div[2]/div[1]/div[1]/div/input";
	private static String PhonetxtXpath="//*[@id='app-quick-reg-form']/div[2]/div[2]/div[1]/div/input";
	private static String PasswordtxtXpath="//*[@id='app-quick-reg-form']/div[3]/div[1]/div[1]/div/input";
	private static String PasswordConftxtXpath="//*[@id='app-quick-reg-form']/div[3]/div[2]/div[1]/div/input";
	private static String TermofServiceLinkXpath="//*[@id='app-quick-reg-form']/div[5]/div/a[1]";
	private static String PrivacyPolicLinkXpath="//*[@id='app-quick-reg-form']/div[5]/div/a[2]";
	private static String FirstContinueButtonXpath="//*[@id='app-quick-reg-form']/div[7]/div/button";
	private static String LastContinueButtonXpath="//div[contains(text(),' Continue')]";
	private static String CheckGroupBoxXpath="//*[@id='emp-quick-reg-cont']/div[2]/div/div[2]/div/div/div/div[2]/h-form/div/form/div[6]/div/div/label/div/div";
	private static String UploadPicButtonXpath="//*[@id='emp-quick-reg-cont']/div[2]/div/div[2]/div/div/div/div[2]/h-form/div/form/h-form/div/ng-form/div[2]/div[2]/div[1]";
	
	private static By LoginLink=By.xpath(LoginLinkXpath);
	private static By FirstNameText=By.xpath(FirstNametxtXpath);
	private static By LastNameText=By.xpath(LastNametxtXpath);
	private static By EmailText=By.xpath(EmailtxtXpath);
	private static By PhoneNumText=By.xpath(PhonetxtXpath);
	private static By PasswordText=By.xpath(PasswordtxtXpath);
	private static By PasswordConfirmText=By.xpath(PasswordConftxtXpath);
	private static By BusinessDropDown=By.id("select2-chosen-10");
	private static By BusinessSearchBox=By.id("s2id_autogen12_search");
	private static By TermofServiceLink=By.xpath(TermofServiceLinkXpath);
	private static By PrivacyPolicylink=By.xpath(PrivacyPolicLinkXpath);
	private static By FirstContinueButton=By.xpath(FirstContinueButtonXpath);
	private static By HecsDropDown=By.id("select2-chosen-12");
	private static By CuisineDropDown=By.id("select2-chosen-14");
	private static By LastContinueButton=By.xpath(LastContinueButtonXpath);
	private static By CheckBox=By.xpath(CheckGroupBoxXpath);
	private static By GroupNameText=By.id("group_name");
	private static By UploadPicButton=By.xpath(UploadPicButtonXpath);
	public EmployerQuickReg(WebDriver driver)
	{
		super();
	    EmployerQuickReg.setDriver(driver);
	   
	}
	public static  String EmployerQuickRegPageTitle() {
		String pageTitle = getDriver().getTitle();
		return pageTitle;
	}
	
	public static void ClickLoginLink()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(LoginLink));
		WebElement Login=getDriver().findElement(LoginLink);
		if(Login.isDisplayed())
		{
			Login.click();
			
		}
	}
		
	public static void enterFirstName(String FName)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(FirstNameText));
		WebElement FirstName=getDriver().findElement(FirstNameText);
		if(FirstName.isDisplayed())
		{
			FirstName.sendKeys(FName);
			
		}
	}
	public static void enterLastname(String LName)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(LastNameText));
		WebElement LastName=getDriver().findElement(LastNameText);
		if(LastName.isDisplayed())
		{
			LastName.sendKeys(LName);
			
		}
	}
	public static void enterEmail(String Email)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(EmailText));
		WebElement EmailLocator=getDriver().findElement(EmailText);
		if(EmailLocator.isDisplayed())
		{
			EmailLocator.sendKeys(Email);
			
		}
	}
	public static void enterPhoneNumber(String Phone)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(PhoneNumText));
		WebElement PhoneNum=getDriver().findElement(PhoneNumText);
		if(PhoneNum.isDisplayed())
		{
			PhoneNum.sendKeys(Phone);
			
		}
	}
	public static void enterPassword(String Password)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordText));
		WebElement PassLocator=getDriver().findElement(PasswordText);
		if(PassLocator.isDisplayed())
		{
			PassLocator.sendKeys(Password);
			
		}
	}
	public static void enterConfirmPass(String ConfPassword)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordConfirmText));
		WebElement PassConfLocator=getDriver().findElement(PasswordConfirmText);
		if(PassConfLocator.isDisplayed())
		{
			PassConfLocator.sendKeys(ConfPassword);
			
		}
	}
	public static void SelectBusiness(String BusinessName, String Address)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(BusinessDropDown));
		WebElement BusinessDroplocator=getDriver().findElement(BusinessDropDown);
		 WebElement Item;	
		if(BusinessDroplocator.isDisplayed())
		{
			BusinessDroplocator.click();
			WebElement BusinessSearchText = (new WebDriverWait(getDriver(), 10))
					   .until(ExpectedConditions.elementToBeClickable(BusinessSearchBox));
			if(BusinessSearchText.isDisplayed()||BusinessSearchText.isEnabled())
			{
				BusinessSearchText.sendKeys(BusinessName);
				
				if(Address!=null && !Address.isEmpty())
				{
				       Item=(new WebDriverWait(getDriver(), 60))
						   .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//small[contains(text(),"+Address+")]")));
				}
				else
				{
				       Item=(new WebDriverWait(getDriver(), 60))
						   .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//strong[contains(text(),"+BusinessName+")]")));
				}
			
				 Item.click();
				
				
			}
		}
	}
    public static void SelectHecs(String HecsText)	
    {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(HecsDropDown));
    	WebElement HecsDrop=getDriver().findElement(HecsDropDown);
    	HecsDrop.click();
    	WebElement	 Item=(new WebDriverWait(getDriver(), 60))
				   .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),"+HecsText+")]")));
    	
    	Item.click();
    }
    public static void SelectCuisine(String CuisineText)
    {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(CuisineDropDown));
    	WebElement CuisineDrop=getDriver().findElement(CuisineDropDown);
    	CuisineDrop.click();
    	WebElement	 Item=(new WebDriverWait(getDriver(), 60))
				   .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),"+CuisineText+")]")));
    	
    	Item.click();
    }
    
    public static void SelectBrandLogo(String LogoPath)
    {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(UploadPicButton));
    	    	
    	//click select button
    	WebElement UploadButtonLocator=getDriver().findElement(UploadPicButton);
    	if(UploadButtonLocator.isDisplayed())
    	{
    		UploadButtonLocator.click();
    	}
    	try {
			Thread.sleep(60000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	setClipboardData(LogoPath);
    	//native key strokes for CTRL, V and ENTER keys
    	Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
	    	robot.keyPress(KeyEvent.VK_V);
	    	robot.keyRelease(KeyEvent.VK_V);
	    	robot.keyRelease(KeyEvent.VK_CONTROL);
	    	robot.keyPress(KeyEvent.VK_ENTER);
	    	robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    public static void setClipboardData(String string) 
    {
    	
    	   StringSelection stringSelection = new StringSelection(string);
    	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }
	public static void ClickTerm()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(TermofServiceLink));
		WebElement Term=getDriver().findElement(TermofServiceLink);
		if(Term.isDisplayed())
		{
			Term.click();
			
		}
	}
	public static void ClickPrivacy()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(PrivacyPolicylink));
		WebElement Privacy=getDriver().findElement(PrivacyPolicylink);
		if(Privacy.isDisplayed())
		{
			Privacy.click();
			
		}
	}
	public static void ClickContinueStageOne()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(FirstContinueButton));
		WebElement Continue=getDriver().findElement(FirstContinueButton);
		if(Continue.isDisplayed())
		{
			Continue.click();
			
		}
	}
	public static void ClickContinueFinal()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(LastContinueButton));
		WebElement Continue=getDriver().findElement(LastContinueButton);
		if(Continue.isDisplayed())
		{
			Continue.click();
			
		}
	}
	public static void CheckGroupBox()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(CheckBox));
		WebElement checkBoxLocator=getDriver().findElement(CheckBox);
		if(checkBoxLocator.isDisplayed())
		{
			checkBoxLocator.click();
		}
	}
	public static void enterGroupName(String GroupName)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(GroupNameText));
		WebElement GroupNametextLocator=getDriver().findElement(GroupNameText);
		if(GroupNametextLocator.isDisplayed())
		{
			GroupNametextLocator.sendKeys(GroupName);
		}
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		EmployerQuickReg.driver = driver;
	}

}

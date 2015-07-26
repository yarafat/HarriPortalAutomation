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
	
	private  WebDriver driver;
	
	private  String  LoginLinkXpath="//*[@id='emp-quick-reg-cont']/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a";
	private  String FirstNametxtXpath="//*[@id='app-quick-reg-form']/div[1]/div[1]/div[1]/div/input";
	private  String LastNametxtXpath="//*[@id='app-quick-reg-form']/div[1]/div[2]/div[1]/div/input";
	private  String EmailtxtXpath="//*[@id='app-quick-reg-form']/div[2]/div[1]/div[1]/div/input";
	private  String PhonetxtXpath="//*[@id='app-quick-reg-form']/div[2]/div[2]/div[1]/div/input";
	private  String PasswordtxtXpath="//*[@id='app-quick-reg-form']/div[3]/div[1]/div[1]/div/input";
	private  String PasswordConftxtXpath="//*[@id='app-quick-reg-form']/div[3]/div[2]/div[1]/div/input";
	private  String TermofServiceLinkXpath="//*[@id='app-quick-reg-form']/div[5]/div/a[1]";
	private  String PrivacyPolicLinkXpath="//*[@id='app-quick-reg-form']/div[5]/div/a[2]";
	private  String FirstContinueButtonXpath="//*[@id='app-quick-reg-form']/div[7]/div/button";
	private  String LastContinueButtonXpath="//div[contains(text(),' Continue')]";
	private  String CheckGroupBoxXpath="//*[@id='emp-quick-reg-cont']/div[2]/div/div[2]/div/div/div/div[2]/h-form/div/form/div[6]/div/div/label/div/div";
	private  String UploadPicButtonXpath="//*[@id='emp-quick-reg-cont']/div[2]/div/div[2]/div/div/div/div[2]/h-form/div/form/h-form/div/ng-form/div[2]/div[2]/div[1]";
	
	private  By LoginLink=By.xpath(LoginLinkXpath);
	private  By FirstNameText=By.xpath(FirstNametxtXpath);
	private  By LastNameText=By.xpath(LastNametxtXpath);
	private  By EmailText=By.xpath(EmailtxtXpath);
	private  By PhoneNumText=By.xpath(PhonetxtXpath);
	private  By PasswordText=By.xpath(PasswordtxtXpath);
	private  By PasswordConfirmText=By.xpath(PasswordConftxtXpath);
	private  By BusinessDropDown=By.id("select2-chosen-10");
	private  By BusinessSearchBox=By.id("s2id_autogen12_search");
	private  By TermofServiceLink=By.xpath(TermofServiceLinkXpath);
	private  By PrivacyPolicylink=By.xpath(PrivacyPolicLinkXpath);
	private  By FirstContinueButton=By.xpath(FirstContinueButtonXpath);
	private  By HecsDropDown=By.id("select2-chosen-12");
	private  By CuisineDropDown=By.id("select2-chosen-14");
	private  By LastContinueButton=By.xpath(LastContinueButtonXpath);
	private  By CheckBox=By.xpath(CheckGroupBoxXpath);
	private  By GroupNameText=By.id("group_name");
	private  By UploadPicButton=By.xpath(UploadPicButtonXpath);
	
	public EmployerQuickReg(WebDriver driver)
	{
		super();
	    this.setDriver(driver);
	   
	}
	public   String EmployerQuickRegPageTitle() {
		String pageTitle = getDriver().getTitle();
		return pageTitle;
	}
	
	public  void ClickLoginLink(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LoginLink));
		WebElement Login=getDriver().findElement(LoginLink);
		if(Login.isDisplayed())
		{
			Login.click();
			
		}
	}
		
	public  void enterFirstName(String FName,int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(FirstNameText));
		WebElement FirstName=getDriver().findElement(FirstNameText);
		if(FirstName.isDisplayed())
		{
			FirstName.sendKeys(FName);
			
		}
	}
	public  void enterLastname(String LName,int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LastNameText));
		WebElement LastName=getDriver().findElement(LastNameText);
		if(LastName.isDisplayed())
		{
			LastName.sendKeys(LName);
			
		}
	}
	public  void enterEmail(String Email,int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(EmailText));
		WebElement EmailLocator=getDriver().findElement(EmailText);
		if(EmailLocator.isDisplayed())
		{
			EmailLocator.sendKeys(Email);
			
		}
	}
	public  void enterPhoneNumber(String Phone,int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(PhoneNumText));
		WebElement PhoneNum=getDriver().findElement(PhoneNumText);
		if(PhoneNum.isDisplayed())
		{
			PhoneNum.sendKeys(Phone);
			
		}
	}
	public  void enterPassword(String Password,int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordText));
		WebElement PassLocator=getDriver().findElement(PasswordText);
		if(PassLocator.isDisplayed())
		{
			PassLocator.sendKeys(Password);
			
		}
	}
	public  void enterConfirmPass(String ConfPassword,int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordConfirmText));
		WebElement PassConfLocator=getDriver().findElement(PasswordConfirmText);
		if(PassConfLocator.isDisplayed())
		{
			PassConfLocator.sendKeys(ConfPassword);
			
		}
	}
	public  void SelectBusiness(String BusinessName, String Address,int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
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
    public  void SelectHecs(String HecsText,int WaitSeconds)	
    {
    	WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(HecsDropDown));
    	WebElement HecsDrop=getDriver().findElement(HecsDropDown);
    	HecsDrop.click();
    	WebElement	 Item=(new WebDriverWait(getDriver(), 60))
				   .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),"+HecsText+")]")));
    	
    	Item.click();
    }
    public  void SelectCuisine(String CuisineText,int WaitSeconds)
    {
    	WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(CuisineDropDown));
    	WebElement CuisineDrop=getDriver().findElement(CuisineDropDown);
    	CuisineDrop.click();
    	WebElement	 Item=(new WebDriverWait(getDriver(), 60))
				   .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),"+CuisineText+")]")));
    	
    	Item.click();
    }
    
    public  void SelectBrandLogo(String LogoPath,int WaitSeconds)
    {
    	WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
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
    public  void setClipboardData(String string) 
    {
    	   StringSelection stringSelection = new StringSelection(string);
    	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }
	public  void ClickTerm(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(TermofServiceLink));
		WebElement Term=getDriver().findElement(TermofServiceLink);
		if(Term.isDisplayed())
		{
			Term.click();
			
		}
	}
	public  void ClickPrivacy(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(PrivacyPolicylink));
		WebElement Privacy=getDriver().findElement(PrivacyPolicylink);
		if(Privacy.isDisplayed())
		{
			Privacy.click();
			
		}
	}
	public  void ClickContinueStageOne(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(FirstContinueButton));
		WebElement Continue=getDriver().findElement(FirstContinueButton);
		if(Continue.isDisplayed())
		{
			Continue.click();
			
		}
	}
	public  void ClickContinueFinal(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(LastContinueButton));
		WebElement Continue=getDriver().findElement(LastContinueButton);
		if(Continue.isDisplayed())
		{
			Continue.click();
			
		}
	}
	public  void CheckGroupBox(int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(CheckBox));
		WebElement checkBoxLocator=getDriver().findElement(CheckBox);
		if(checkBoxLocator.isDisplayed())
		{
			checkBoxLocator.click();
		}
	}
	public  void enterGroupName(String GroupName, int WaitSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(GroupNameText));
		WebElement GroupNametextLocator=getDriver().findElement(GroupNameText);
		if(GroupNametextLocator.isDisplayed())
		{
			GroupNametextLocator.sendKeys(GroupName);
		}
	}
	public  WebDriver getDriver() {
		return driver;
	}
	public  void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}

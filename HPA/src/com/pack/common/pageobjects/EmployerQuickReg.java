/**
* Employer Quick Registration Class : Contains all the elements 
* in the Employer Quick Registration page with the Selenium actions on these elements
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

import com.pack.utils.ElementActions;
import com.pack.utils.GeneralSelectors;
public class EmployerQuickReg {
	
	private  WebDriver driver;
	
	private  String  LoginLinkXpath="//*[@id='emp-quick-reg-cont']/div[2]/div/div[2]/div/div/div/div[1]/div[2]/a";
	private  String FirstNametxtXpath="//*[@id='app-quick-reg-form']/div[1]/div[1]/div[1]/div/input";
	private  String LastNametxtXpath="//*[@id='app-quick-reg-form']/div[1]/div[2]/div[1]/div/input";
	private  String EmailtxtXpath="//*[@id='app-quick-reg-form']/div[2]/div[1]/div[1]/div/input";
	private  String PhonetxtXpath="//*[@id='app-quick-reg-form']/div[2]/div[2]/div[1]/div/input";
	//private  String PasswordtxtXpath="//*[@id='app-quick-reg-form']/div[3]/div[1]/div[1]/div/input";
	private  String PasswordConftxtXpath="//*[@id='app-quick-reg-form']/div[3]/div[2]/div[1]/div/input";
	private  String TermofServiceLinkXpath="//*[@id='app-quick-reg-form']/div[5]/div/a[1]";
	private  String PrivacyPolicLinkXpath="//*[@id='app-quick-reg-form']/div[5]/div/a[2]";
	private  String FirstContinueButtonXpath="//*[@id='app-quick-reg-form']/div[7]/div/button";
	private  String LastContinueButtonXpath="//*[@id='emp-quick-reg-cont']/div[2]/div/div[2]/div/div/div/div[2]/h-form/div/form/div[7]";
			
			
			/*"//div[contains(text(),' Continue')]";*/
	private  String CheckGroupBoxXpath="//*[@id='emp-quick-reg-cont']/div[2]/div/div[2]/div/div/div/div[2]/h-form/div/form/div[6]/div/div/label/div/div";
	private  String UploadPicButtonXpath="//*[@id='emp-quick-reg-cont']/div[2]/div/div[2]/div/div/div/div[2]/h-form/div/form/h-form/div/ng-form/div[2]/div[2]/div[1]";
	
	
	
	private  By LoginLink=By.xpath(LoginLinkXpath);
	private  By FirstNameText=By.xpath(FirstNametxtXpath);
	private  By LastNameText=By.xpath(LastNametxtXpath);
	private  By EmailText=By.xpath(EmailtxtXpath);
	private  By PhoneNumText=By.xpath(PhonetxtXpath);
	private  By PasswordText=By.id("password");
	private  By PasswordConfirmText=By.xpath(PasswordConftxtXpath);
	private  By BusinessDropDown=By.id("select2-chosen-10");
	private  By BusinessSearchBox=By.id("s2id_autogen10_search");
	private  By TermofServiceLink=By.xpath(TermofServiceLinkXpath);
	private  By PrivacyPolicylink=By.xpath(PrivacyPolicLinkXpath);
	private  By FirstContinueButton=By.xpath(FirstContinueButtonXpath);
	private  By HecsDropDown=By.id("select2-chosen-12");
	private  By CuisineDropDown=By.id("select2-chosen-14");
	private  By LastContinueButton=By.xpath(LastContinueButtonXpath);
	private  By CheckBox=By.xpath(CheckGroupBoxXpath);
	private  By GroupNameText=By.id("group_name");
	private  By UploadPicButton=By.xpath(UploadPicButtonXpath);
	private  By BrandDescText=By.id("description");
	public EmployerQuickReg(WebDriver driver)
	{
		super();
	    this.setDriver(driver);
	   
	}
	public String EmployerQuickRegPageTitle() {
		String pageTitle = getDriver().getTitle();
		return pageTitle;
	}
	
	public  void ClickLoginLink(int WaitSeconds)
	{
		 ElementActions Login=new ElementActions(driver);
		 Login.ClickElement(LoginLink, WaitSeconds);
		
	}
	
	public  void enterFirstName(String FName,int WaitSeconds)
	{
		ElementActions FirstName=new ElementActions(driver);
		FirstName.EnterText(FirstNameText, FName, WaitSeconds);
		
	}
	public  void enterLastname(String LName,int WaitSeconds)
	{
		ElementActions LastName=new ElementActions(driver);
		LastName.EnterText(LastNameText, LName, WaitSeconds);
		
	}
	public  void enterEmail(String Email,int WaitSeconds)
	{
		ElementActions EmailLocator=new ElementActions(driver);
		EmailLocator.EnterText(EmailText, Email, WaitSeconds);
		
	}
	public  void enterPhoneNumber(String Phone,int WaitSeconds)
	{
		ElementActions PhoneNum=new ElementActions(driver);
		PhoneNum.EnterText(PhoneNumText, Phone, WaitSeconds);
		
	}
	public  void enterPassword(String Password,int WaitSeconds)
	{
	//	ElementActions PassLocator=new ElementActions(driver);
		Actions actions = new Actions(driver);
		WebElement WebelementLocator = driver.findElement(PasswordText);
		actions.moveToElement(WebelementLocator);
		actions.click();
		actions.sendKeys(Password);
		actions.build().perform();
	//	PassLocator.EnterText(PasswordText, Password, WaitSeconds);
		
	}
	public  void enterConfirmPass(String ConfPassword,int WaitSeconds)
	{
		ElementActions PassConfLocator=new ElementActions(driver);
		PassConfLocator.EnterText(PasswordConfirmText, ConfPassword, WaitSeconds);
		
	}
	public  void SelectBusiness(String BusinessName, String Address,int WaitSeconds)
	{
		 
		GeneralSelectors business=new GeneralSelectors(getDriver());
		business.SelectBusiness(BusinessDropDown, BusinessSearchBox, BusinessName, Address, WaitSeconds);
		
	}
    public  void SelectHecs(String HecsText,int WaitSeconds) throws InterruptedException	
    {
    	GeneralSelectors Hecs=new GeneralSelectors(getDriver());
    	Hecs.SelectHecs(HecsDropDown, HecsText, WaitSeconds);
    	
    }
    public  void SelectCuisine(String CuisineText,int WaitSeconds)
    {
    	GeneralSelectors Cuisine=new GeneralSelectors(getDriver());
    	Cuisine.SelectCuisine(CuisineDropDown, CuisineText, WaitSeconds);
    
    }
    
    public  void SelectBrandLogo(String LogoPath,int WaitSeconds)
    {
    	GeneralSelectors BrandLogo=new GeneralSelectors(getDriver());
    	BrandLogo.SelectLogo(UploadPicButton, LogoPath, WaitSeconds);
    	
    }
  
	public  void ClickTerm(int WaitSeconds)
	{
		 ElementActions Term=new ElementActions(driver);
		 Term.ClickElement(TermofServiceLink, WaitSeconds);
		
	}
	public  void ClickPrivacy(int WaitSeconds)
	{
		 ElementActions Privacy=new ElementActions(driver);
		 Privacy.ClickElement(PrivacyPolicylink, WaitSeconds);
		 
	}
	public  void ClickContinueStageOne(int WaitSeconds)
	{
		 ElementActions Continue=new ElementActions(driver);
		 Continue.ClickElement(FirstContinueButton, WaitSeconds);
		 
	}
	public  void ClickContinueFinal(int WaitSeconds)
	{
		 ElementActions Continue=new ElementActions(driver);
		 Continue.ClickElement(LastContinueButton, WaitSeconds);
		
	}
	public  void CheckGroupBox(int WaitSeconds)
	{
		 ElementActions checkBoxLocator=new ElementActions(driver);
		 checkBoxLocator.ClickElement(CheckBox, WaitSeconds);
		
	}
	public  void enterGroupName(String GroupName, int WaitSeconds)
	{
		 ElementActions GroupNametextLocator=new ElementActions(driver);
		 GroupNametextLocator.EnterText(GroupNameText, GroupName, WaitSeconds);
	     
	}
	public void enterBrandDescription(String Desc, int WaitSeconds)
	{
		ElementActions BrandDesctextLocator=new ElementActions(driver);
		BrandDesctextLocator.EnterText(BrandDescText, Desc, WaitSeconds);
		
	}
	public  WebDriver getDriver() {
		return driver;
	}
	public  void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}

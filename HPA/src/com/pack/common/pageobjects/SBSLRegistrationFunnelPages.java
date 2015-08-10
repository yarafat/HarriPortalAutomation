package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pack.utils.GeneralSelectors;

public class SBSLRegistrationFunnelPages {
	private  WebDriver driver;
	
	/* Employer Type SBSL*/
	private String SBSLXpath="//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[4]/div/form/div[2]/div[1]/label/span";
	private String ContinueSBSlXpath="//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[4]/div/form/div[4]/button";
	private By SBSLRadioBtn=By.xpath(SBSLXpath);
	private By ContinueSBSLBtn=By.xpath(ContinueSBSlXpath);
	
	/*About Your Company*/
	private String SelectProfileLinkXpath="//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[5]/div/div[1]/div/div[2]";
	private String ContinueBrandInfo="//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[5]/div/div[2]/form/div[5]/button";
	private By BusinessDropDown=By.id("select2-chosen-10");
	private By BusinessSearchBox=By.id("s2id_autogen10_search");
	private By HecsDropDown=By.id("select2-chosen-12");
	private By CuisineDropDown=By.id("select2-chosen-14");
	private By BrandCommunicationEmail=By.name("email");
	private By BrandDesc=By.name("description");
	private By SelectPhotoLink=By.xpath(SelectProfileLinkXpath);
	private By ContinueBrandInfoBtn=By.xpath(ContinueBrandInfo);
	private By BrandPhone=By.name("phone");
	
	/*Media For Selected Brand*/
	private By UploadLogoPic=By.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[7]/div[2]/ng-form/div[2]/div[2]/div[1]");
	private By ClickContinueMsedia=By.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[7]/div[2]/ng-form/div[12]/button");
	 public SBSLRegistrationFunnelPages(WebDriver driver)
		{
			this.driver = driver;
		}
	 /* Employer type SBSL choose methods */
	 public void ChooseSBSL(int WaitSeconds)
	 {

			WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
			wait.until(ExpectedConditions.visibilityOfElementLocated(SBSLRadioBtn));
			WebElement SBSL = driver.findElement(SBSLRadioBtn);
			if(SBSL.isDisplayed())
				SBSL.click();
	 }
	 public void ClickContinueSBSL(int WaitSeconds)
	 {

			WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
			wait.until(ExpectedConditions.visibilityOfElementLocated(ContinueSBSLBtn));
			WebElement Continue = driver.findElement(ContinueSBSLBtn);
			if(Continue.isDisplayed())
				Continue.click();
	 }
	 
	 
	 /*About Your Company methods */
	 public void SelectBusiness(String BusinessName, String Address,int WaitSeconds)
		{
		    GeneralSelectors business=new GeneralSelectors(driver);
			business.SelectBusiness(BusinessDropDown, BusinessSearchBox, BusinessName, Address, WaitSeconds);
		}
     public void SelectHecs(String HecsText,int WaitSeconds) throws InterruptedException	
	    {
	    	GeneralSelectors Hecs=new GeneralSelectors(driver);
	    	Hecs.SelectHecs(HecsDropDown, HecsText, WaitSeconds);
	    }
	 public void SelectCuisine(String CuisineText,int WaitSeconds)
	    {
	    	GeneralSelectors Cuisine=new GeneralSelectors(driver);
	    	Cuisine.SelectCuisine(CuisineDropDown, CuisineText, WaitSeconds);
	    }
	 public void SelectBrandLogo(String LogoPath,int WaitSeconds)
	    {
	    	GeneralSelectors BrandLogo=new GeneralSelectors(driver);
	    	BrandLogo.SelectLogo(SelectPhotoLink, LogoPath, WaitSeconds);
	    }	  
	 public void enterPhoneNumber(String Phone,int WaitSeconds)
		{
			WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
			wait.until(ExpectedConditions.visibilityOfElementLocated(BrandPhone));
			WebElement PhoneNum=driver.findElement(BrandPhone);
			if(PhoneNum.isDisplayed())
			{
				PhoneNum.sendKeys(Phone);
				
			}
		}
	 public void enterCommunicationEmail(String Email,int WaitSeconds)
		{
			WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
			wait.until(ExpectedConditions.visibilityOfElementLocated(BrandCommunicationEmail));
			WebElement EmailLocator=driver.findElement(BrandCommunicationEmail);
			if(EmailLocator.isDisplayed())
			{
				EmailLocator.sendKeys(Email);
				
			}
		}
	 public void enterBrandDescription(String Desc, int WaitSeconds)
		{
			WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
			wait.until(ExpectedConditions.visibilityOfElementLocated(BrandDesc));
			WebElement BrandDesctextLocator=driver.findElement(BrandDesc);
			if(BrandDesctextLocator.isDisplayed())
			{
				BrandDesctextLocator.sendKeys(Desc);
			}
		}
	 public void ClickContineBrandInfo(int WaitSeconds)
	  {
		  WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
			wait.until(ExpectedConditions.visibilityOfElementLocated(ContinueBrandInfoBtn));
			WebElement Continue = driver.findElement(ContinueBrandInfoBtn);
			if(Continue.isDisplayed())
				Continue.click();
	  }
	 
	 
	 /*Media For Selected Brand*/
	 public void ClickUploadBrandPic(String LogoPath,int WaitSeconds)
	 {
		 GeneralSelectors BrandLogo=new GeneralSelectors(driver);
	     BrandLogo.SelectLogo(UploadLogoPic, LogoPath, WaitSeconds);
	 }
	 public void ClickContinueMedia(int WaitSeconds)
	 {
		 WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClickContinueMsedia));
			WebElement Continue = driver.findElement(ClickContinueMsedia);
			if(Continue.isDisplayed())
				Continue.click();
	 }
	 
	 
	 

}

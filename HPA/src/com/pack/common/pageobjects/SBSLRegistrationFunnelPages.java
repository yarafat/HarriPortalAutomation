/**
* SBSLRegistrationFunnelPages  Class : Contains all the elements 
* in the SBSLRegistrationFunnelPages Pages  with the Selenium actions on these elements
*
* @author  Aziza Mustafa
* @version 1.0
* @since   2015-08-6
*/
package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.pack.utils.ElementActions;
import com.pack.utils.GeneralSelectors;

public class SBSLRegistrationFunnelPages {
	private  WebDriver driver;
	
	/* Employer Type SBSL*/
	private String SBSLXpath="//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[4]/div/form/div[2]/div[1]/label/span";
	private String ContinueSBSlXpath="//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[4]/div/form/div[4]/button";
    private By SBSLRadioBtn=By.xpath(SBSLXpath);
	private By ContinueSBSLBtn=By.xpath(ContinueSBSlXpath);
	
	/*X button for all modules has the same Xpath */
	private String CloseBtnXpath="//*[@id='join-modal']/div/div[2]/div/button";
	private By CloseModal=By.xpath(CloseBtnXpath);
	private String OkXpath1="//*[@id='harriApp']/div[4]/div[2]/div/div[2]/button[1]";
	private String OkXpath2="//*[@id='harriApp']/div[5]/div[2]/div/div[2]/button[1]";
	private By OkBtn1=By.xpath(OkXpath1);
	private By OkBtn2=By.xpath(OkXpath2);
	private String CancelXpath="//*[@id='harriApp']/div[4]/div[2]/div/div[2]/button[2]";
	private By CancelBtn=By.xpath(CancelXpath);
	
	/*About Your Company*/
	private String SelectProfileLinkXpath="//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[5]/div/div[1]/div/div[2]";
	private String ContinueBrandInfo="//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[5]/div/div[2]/form/div[5]/button";
	private By BusinessDropDown=By.id("select2-chosen-6");
	private By BusinessSearchBox=By.id("s2id_autogen6_search");
	private By HecsDropDown=By.id("select2-chosen-8");
	private By CuisineDropDown=By.id("select2-chosen-10");
	private By BrandCommunicationEmail=By.id("email");
	private By BrandDesc=By.name("description");
	private By SelectPhotoLink=By.xpath(SelectProfileLinkXpath);
	private By ContinueBrandInfoBtn=By.xpath(ContinueBrandInfo);
	private By BrandPhone=By.name("phone");
	/*Media For Selected Brand*/
	private By UploadLogoPic=By.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[7]/div[2]/ng-form/div[2]/div[2]/div[1]");
	private By ClickContinueMedia=By.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[7]/div[2]/ng-form/div[12]/button");
   
	public SBSLRegistrationFunnelPages(WebDriver driver)
		{
			this.driver = driver;
		}
	 /* Employer type SBSL choose methods */
	 public void ChooseSBSL(int WaitSeconds)
	 {
		 ElementActions SelectSBML=new ElementActions(driver);
		 SelectSBML.ClickElement(SBSLRadioBtn, WaitSeconds);

	 }
	 public void ClickContinueSBSL(int WaitSeconds)
	 {
		 ElementActions ClickContinue=new ElementActions(driver);
		 ClickContinue.ClickElement(ContinueSBSLBtn, WaitSeconds);

	  }
	 
	 
	 
	 /*this general method for closing the opened modal , Note: all X button in this SBSL have the same Xpath */
	 public void clickCloseModal(int WaitSeconds)
	 {
		 ElementActions ClickCloseModal=new ElementActions(driver);
		 ClickCloseModal.ClickElement(CloseModal, WaitSeconds);
		 
	 }
	 public void ClickOK1(int WaitSeconds)
	 {
		 ElementActions ClickOKBtn=new ElementActions(driver);
		 ClickOKBtn.ClickElement(OkBtn1, WaitSeconds);
	 }
	 public void ClickOK2(int WaitSeconds)
	 {
		 ElementActions ClickOKBtn=new ElementActions(driver);
		 ClickOKBtn.ClickElement(OkBtn2, WaitSeconds);
	 }
	 public void ClickCancel(int WaitSeconds)
	 {
		 ElementActions ClickCancelBtn=new ElementActions(driver);
		 ClickCancelBtn.ClickElement(CancelBtn, WaitSeconds);
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
		    ElementActions EnterBrandPhone=new ElementActions(driver);
		    EnterBrandPhone.EnterText(BrandPhone, Phone, WaitSeconds);
		}
	 public void enterCommunicationEmail(String Email,int WaitSeconds)
		{
		    ElementActions EnterBrandCommEmail=new ElementActions(driver);
		    EnterBrandCommEmail.EnterText(BrandCommunicationEmail, Email, WaitSeconds);
		}
	 public void enterBrandDescription(String Desc, int WaitSeconds)
		{
		   ElementActions EnterDesc=new ElementActions(driver);
		   EnterDesc.EnterText(BrandDesc, Desc, WaitSeconds);
		}
	 public void ClickContineBrandInfo(int WaitSeconds)
	  {
		 ElementActions ClickContinue=new ElementActions(driver);
		 ClickContinue.ClickElement(ContinueBrandInfoBtn, WaitSeconds);
		 
	  }
	 
	 
	 /*Media For Selected Brand*/
	 public void ClickUploadBrandPic(String LogoPath,int WaitSeconds)
	 {
		 GeneralSelectors BrandLogo=new GeneralSelectors(driver);
	     BrandLogo.SelectLogo(UploadLogoPic, LogoPath, WaitSeconds);
	 }
	 public void ClickContinueMedia(int WaitSeconds)
	 {
		 ElementActions ClickContinue=new ElementActions(driver);
		 ClickContinue.ClickElement(ClickContinueMedia, WaitSeconds);
	 }
	 
	 
	 

}

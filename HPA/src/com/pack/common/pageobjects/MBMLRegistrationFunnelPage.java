/**
* MBMLRegistrationFunnelPage  Class : Contains all the elements 
* in the MBMLRegistrationFunnel Pages  with the Selenium actions on these elements
*
* @author  Aziza Mustafa
* @version 1.0
* @since   2015-08-10 
*/
package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pack.utils.ElementActions;
import com.pack.utils.GeneralSelectors;

public class MBMLRegistrationFunnelPage {
	private  WebDriver driver;
	/* Employer Type MBML*/
	private String MBMLXpath="//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[4]/div/form/div[2]/div[5]/label/span";
	private String ContinueMBMlXpath="//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[4]/div/form/div[4]/button";
	private By MBMLRadioBtn=By.xpath(MBMLXpath);
	private By ContinueMBMLBtn=By.xpath(ContinueMBMlXpath);
	
	/*X button for all modules has the same Xpath */
	private String CloseBtnXpath="//*[@id='join-modal']/div/div[2]/div/button";
	private By CloseModal=By.xpath(CloseBtnXpath);
	
	/*About Your Group*/
	private By GroupDDlLocator=By.id("select2-chosen-12");
	private By GroupSearchTextBoxLOcator=By.id("s2id_autogen12_search");
	private By UploadGroupLogo=By.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[6]/div/div[1]/div/div[2]");
    private By ContinueGroup=By.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[6]/div/div[2]/form/div[4]/button");
	
    /*Brand Media*/
	private By UploadLogoPic=By.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[7]/div[2]/ng-form/div[2]/div[2]/div[1]");
	private By ClickContinueMedia=By.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[7]/div[2]/ng-form/div[12]/button");
	
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
	
	 /* Brand Locations */
	private By LocationDDLLocator=By.id("select2-chosen-14");
	private By LocationSearchBoxLocator=By.id("s2id_autogen14_search");
	private By LocationContinueBtn=By.id("save-locations");
		
		
    public MBMLRegistrationFunnelPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	/* Employer type MBML choose methods */
	 public void ChooseMBML(int WaitSeconds)
	 {
		 ElementActions SelectSBML=new ElementActions(driver);
		 SelectSBML.ClickElement(MBMLRadioBtn, WaitSeconds);

	 }
	 public void ClickContinueMBML(int WaitSeconds)
	 {
		 ElementActions ClickContinue=new ElementActions(driver);
		 ClickContinue.ClickElement(ContinueMBMLBtn, WaitSeconds);

	 }
	 
	 /*this general method for closing the opened modal , Note: all X button in this SBSL have the same Xpath */
	 public void clickCloseModal(int WaitSeconds)
	 {
		 ElementActions ClickCloseModal=new ElementActions(driver);
		 ClickCloseModal.ClickElement(CloseModal, WaitSeconds);
		 
	 }
	 
	 /*About Your Group*/
	 public void SelectGroup(String GroupName, String Address,int WaitSeconds)
	 {
		    GeneralSelectors Group=new GeneralSelectors(driver);
		    Group.SelectBusiness(GroupDDlLocator, GroupSearchTextBoxLOcator, GroupName, Address, WaitSeconds);
	 }
	 public void SelectGroupLogo(String LogoPath,int WaitSeconds)
	 {
		    GeneralSelectors BrandLogo=new GeneralSelectors(driver);
	    	BrandLogo.SelectLogo(UploadGroupLogo, LogoPath, WaitSeconds);
	 }
	 public void continueGroup(int WaitSeconds)
	 {
		 ElementActions ClickContinue=new ElementActions(driver);
		 ClickContinue.ClickElement(ContinueGroup, WaitSeconds);
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
	 
	 /* Brand Locations */
	 public void SelectBrandLocation(String EnteredLcation, String TargedLocation, int WaitSeconds)
	 {
		 GeneralSelectors Location=new GeneralSelectors(driver);
		 Location.SelectLocation(LocationDDLLocator, LocationSearchBoxLocator, EnteredLcation, TargedLocation, WaitSeconds);
	 }
	 public void clickContinueLocations(int WaitSeconds)
	 {
		 ElementActions ClickContinue=new ElementActions(driver);
		 ClickContinue.ClickElement(LocationContinueBtn, WaitSeconds);
		 
	 }
	 
	 
}

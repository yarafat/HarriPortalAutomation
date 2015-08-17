package com.pack.common.actions;

import org.openqa.selenium.WebDriver;

import com.pack.common.pageobjects.ImageCroppingPopUp;
import com.pack.common.pageobjects.SBSLRegistrationFunnelPages;
import com.pack.entities.Brand;
import com.pack.entities.Errors;

public class SBSLRegistrationActions extends SBSLRegistrationFunnelPages {
	private WebDriver driver;
	private Errors Error;
	private ImageCroppingPopUp Crop;
	private SBSLRegistrationFunnelPages SBSL;
	public SBSLRegistrationActions(WebDriver driver)
	{
		super(driver);
		this.setDriver(driver);
		Error = new Errors();
		Crop=new ImageCroppingPopUp(driver);
		SBSL=new SBSLRegistrationFunnelPages(driver);
		Error.setError(true, "Success");
	}
	/*Select SBSL Type Stage*/
	public Object SelectEmpTypeSBSL()
	{
		try
		{
			
			if(SBSL!=null)
			{
				SBSL.ChooseSBSL(5);
				SBSL.ClickContinueSBSL(5);
				
			}
			else {Error.setError(false, "Error: SBSL pages Pointer is NULL");}
			
		}
		catch(Exception e)
		{
			Error.setError(false, e.getMessage());
			
		}
		return Error;
	}
	/* Select business and fill its required data  */
    public Object BrandInfo(Brand BrandInfo)
    {
    	try
		{
			
			if(SBSL!=null)
			{
				if(BrandInfo.getProfileLogoPath()!=null)
				{
			    	SBSL.SelectBrandLogo(BrandInfo.getProfileLogoPath(), 5);
				    Crop.ClickSave(5);
				}
				SBSL.SelectBusiness(BrandInfo.getBrandName(), BrandInfo.getBrandLocation(), 5);
				SBSL.SelectHecs(BrandInfo.getHecs(), 5);
				SBSL.SelectCuisine(BrandInfo.getCuisine(), 5);
		        if(BrandInfo.getBusinessEmail()!=null)
		        {
		        	SBSL.enterCommunicationEmail(BrandInfo.getBusinessEmail(), 5);
		        }
		        if(BrandInfo.getDescription()!=null)
		        {
		        	SBSL.enterBrandDescription(BrandInfo.getDescription(), 5);
		        }
		        SBSL.ClickContineBrandInfo(5);
		        
							
			}
			else {Error.setError(false, "Error: SBSL pages Pointer is NULL");}
			
		}
		catch(Exception e)
		{
			Error.setError(false, e.getMessage());
			
		}
		return Error;
    	
    }
    /* Add media to the selected brand */
    public Object BrandMedia(Brand BrandInfo)
    {
    	try
		{
			
			if(SBSL!=null)
			{
				if(BrandInfo.getProfileLogoPath()!=null)
				{
			     SBSL.ClickUploadBrandPic(BrandInfo.getProfileLogoPath(), 10);
				}
			     SBSL.ClickContinueMedia(5);
				
			}
			else {Error.setError(false, "Error: SBSL pages Pointer is NULL");}
			
		}
		catch(Exception e)
		{
			Error.setError(false, e.getMessage());
			
		}
		return Error;
    }
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
    
}

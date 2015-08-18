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
	public Object SelectEmpTypeSBSL(Boolean IsDropped)
	{
		try
		{
			
			if(SBSL!=null)
			{
				SBSL.ChooseSBSL(5);
				if(IsDropped)
				{
					SBSL.clickCloseModal(5);
				}
				else
				{
				  SBSL.ClickContinueSBSL(5);
				}
				
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
    public Object BrandInfo(Brand BrandInfo, Boolean IsDropped)
    {
    	try
		{
			
			if(SBSL!=null)
			{
				if(BrandInfo.getMedia()!=null && BrandInfo.getMedia().getProfileUrl()!=null)
				{
			    	SBSL.SelectBrandLogo(BrandInfo.getMedia().getProfileUrl(), 5);
				    Crop.ClickSave(5);
				}
				SBSL.SelectBusiness(BrandInfo.getBrandName(), (BrandInfo.getBrandLocation())[0].toString(), 5);
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
		        if(IsDropped)
				{
					SBSL.clickCloseModal(5);
				}
		        else
		        {
		        SBSL.ClickContineBrandInfo(5);
		        }
							
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
    public Object BrandMedia(Brand BrandInfo, Boolean IsDropped)
    {
    	try
		{
			
			if(SBSL!=null)
			{
				if(BrandInfo.getMedia()!=null&& BrandInfo.getMedia().getProfileUrl()!=null)
				{
			     SBSL.ClickUploadBrandPic(BrandInfo.getMedia().getProfileUrl(), 10);
				}
				if(IsDropped)
				{
					SBSL.clickCloseModal(5);
				}
				else
				{
			     SBSL.ClickContinueMedia(5);
				}
				
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

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
				
				if(IsDropped)
				{
					SBSL.clickCloseModal(5);
					SBSL.ClickOK1(10);
				
				}
				else
				{
					SBSL.ChooseSBSL(5);
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
		        if(IsDropped)
				{
					SBSL.clickCloseModal(5);
					SBSL.ClickOK1(10);
				}
		        else
		        {

					if(BrandInfo.getMedia()!=null && BrandInfo.getMedia().getProfileUrl()!=null)
					{
				    	SBSL.SelectBrandLogo(BrandInfo.getMedia().getProfileUrl(), 10);
				    	Thread.sleep(6000);
					    Crop.ClickSave(60,"//*[@id='harriApp']/div[1]/div[2]/div[1]/image-cropping/div/div[1]/div[2]/div/div/div[5]/div/div[4]");
					}
					SBSL.SelectBusiness(BrandInfo.getBrandName(), (BrandInfo.getBrandLocation())[0].toString(), 10);
					SBSL.SelectHecs(BrandInfo.getHecs(), 10);
					SBSL.SelectCuisine(BrandInfo.getCuisine(), 10);
			        /*if(BrandInfo.getBusinessEmail()!=null && !BrandInfo.getBusinessEmail().isEmpty())
			        {
			        	//System.out.println("communecation email :"+BrandInfo.getBusinessEmail().toString() );
			        	SBSL.enterCommunicationEmail(BrandInfo.getBusinessEmail(),10);
			        }
			        if(BrandInfo.getDescription()!=null && !BrandInfo.getDescription().isEmpty())
			        {
			        	SBSL.enterBrandDescription(BrandInfo.getDescription(), 10);
			        }*/
		            SBSL.ClickContineBrandInfo(10);
		            
		        }
							
			}
			else {Error.setError(false, "Error: SBSL pages Pointer is NULL");}
			
		}
		catch(Exception e)
		{
			//System.out.println(e.getMessage().toString());
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
				
				if(IsDropped)
				{
					SBSL.clickCloseModal(5);
					SBSL.ClickOK2(10);
				}
				else
				{
					if(BrandInfo.getMedia()!=null&& BrandInfo.getMedia().getProfileUrl()!=null)
					{
				     SBSL.ClickUploadBrandPic(BrandInfo.getMedia().getProfileUrl(), 10);
					}
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

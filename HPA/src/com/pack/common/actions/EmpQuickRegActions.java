package com.pack.common.actions;

import org.openqa.selenium.WebDriver;

import com.pack.common.pageobjects.EmployerQuickReg;
import com.pack.common.pageobjects.ImageCroppingPopUp;
import com.pack.entities.Brand;
import com.pack.entities.Errors;
import com.pack.entities.User;

public class EmpQuickRegActions extends EmployerQuickReg {
	private Errors Error;
	private EmployerQuickReg Emp;
	private WebDriver driver;
	private ImageCroppingPopUp Crop;
	public EmpQuickRegActions(WebDriver driver)
	{
		super(driver);
		this.setDriver(driver);
		Emp=new EmployerQuickReg(getDriver());
	    Error = new Errors();
	    Crop=new ImageCroppingPopUp(getDriver());
		Error.setError(true, "Success");
		System.out.println("EmpQuickRegActions constructor  ");
	}
	public Object EmpRegFirstStage(User EmpUserInfo,Brand BrandInfo)
	{
		try
		{
			System.out.println("Before check emp");
			if(Emp!=null)
			{
				Emp.enterFirstName(EmpUserInfo.getFirstUserName(), 5);
				Emp.enterLastname(EmpUserInfo.getLastUserName(), 5);
				Emp.enterEmail(EmpUserInfo.getEmail(), 5);
				Emp.enterPhoneNumber(EmpUserInfo.getPhoneNumber(),5);
				Emp.SelectBusiness(BrandInfo.getBrandName(), (BrandInfo.getBrandLocation())[0].toString(), 20);
				Emp.enterPassword(EmpUserInfo.getPassword(), 5);
				Emp.enterConfirmPass(EmpUserInfo.getPassword(), 5);
				Emp.ClickContinueStageOne(5);
				
			}
			else {Error.setError(false, "Error: Employer Quick Reg Page Pointer is NULL");}
			
		}
		catch(Exception e)
		{
			Error.setError(false, e.getMessage());
			
		}
		return Error;
	}
	public Object EmpQuickRegFullStages(User EmpUserInfo, Brand BrandInfo)
	{
		try
		{
			Error=(Errors)EmpRegFirstStage(EmpUserInfo,BrandInfo);
			Thread.sleep(6000);
			if(Error.getStatus())
			{
				Emp.SelectHecs(BrandInfo.getHecs(), 60);
				Emp.SelectCuisine(BrandInfo.getCuisine(), 60);
				if(EmpUserInfo.getDescription()!=null)
				{
				Emp.enterBrandDescription(EmpUserInfo.getDescription(), 10);
				}
				//We should use the media object here
				if(BrandInfo.getMedia()!=null && BrandInfo.getMedia().getProfileUrl()!=null)
				{
				//We should use the media object here
				Emp.SelectBrandLogo(BrandInfo.getMedia().getProfileUrl().toString(), 10);
			    Crop.ClickSave(5);
				}
				if(BrandInfo.getGroupName()!=null)
				{
					Emp.CheckGroupBox(10);
					Emp.enterGroupName(BrandInfo.getGroupName(), 10);
				}
				Emp.ClickContinueFinal(10);				

			}
			
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

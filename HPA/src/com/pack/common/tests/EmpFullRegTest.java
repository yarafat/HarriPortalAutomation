/**
* Employer Full  Registration page tests Class : Contains all the tests
* in the Emp Full Registration Page 
*
* @author  Aziza Mustafa
* @version 1.0
* @since   2015-10-28
*/
package com.pack.common.tests;

import java.io.FileNotFoundException;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.actions.EmpRegFirstFunnelActions;
import com.pack.common.actions.SBSLRegistrationActions;
import com.pack.common.pageobjects.HomePage;
import com.pack.entities.Brand;
import com.pack.entities.User;
import com.pack.entities.Errors;
import com.pack.utils.BrandParser;
import com.pack.utils.CandidateParser;
import com.pack.utils.EmailsGenerator;

public class EmpFullRegTest extends TestBaseSetup{
	private WebDriver driver;
	private Errors Actual;	
		@BeforeClass
		public void setUp() {
			driver=getDriver();
		}
		private User SetEmpInfo(User empInfo) throws FileNotFoundException
		{
			EmailsGenerator Email=new EmailsGenerator();
			Email.SetEmail("EMPLOYER");
			CandidateParser ParsEMpUserInfo=new CandidateParser(3);
		    empInfo=ParsEMpUserInfo.parse();
			
			if(empInfo!=null)
			{	
				empInfo.setEmail(Email.getEmail());
		
			}
			return empInfo;
		}
		private Brand SetBrandInfo(Brand BrandInfo) throws FileNotFoundException
		{
			BrandParser ParsBrandInfo=new BrandParser(1);
			BrandInfo=ParsBrandInfo.parse();
			return BrandInfo;
		}
		
		@Test
		public void SBSLTest()
		{
			HomePage Home;
		    User NewEmp;
			Brand brand;
			EmpRegFirstFunnelActions EmpFirstStage;
			SBSLRegistrationActions SBSL;
			Actual=new Errors();
			    try
			    {
			    	System.out.println("Employer Full Registration functionality details...");
					System.out.println("Test: Single Brand Single Location ");
					Home=new HomePage(driver);
					EmpFirstStage=new EmpRegFirstFunnelActions(driver);
					SBSL=new SBSLRegistrationActions(driver);
					NewEmp=new User();
					brand=new Brand();
					Home.clickJoinLink();
					EmpFirstStage.ClickRegWithEmail(7);
					EmpFirstStage.EmpFirstStage(SetEmpInfo(NewEmp), false);
					Thread.sleep(6000);
					//Assert.assertTrue(driver.findElement(By.xpath("//*[@id='app-quick-reg-form']/div[1]/div[1]/div[1]/div/input")).isDisplayed(), "Error: Registration Modal is not being opened");
				    Actual=(Errors)SBSL.SelectEmpTypeSBSL(false);
				    Thread.sleep(6000);
				    
					if(Actual.getStatus())
					{
						brand=SetBrandInfo(brand);
						Actual=(Errors)SBSL.BrandInfo(brand, false);
						Thread.sleep(6000);
						SBSL.BrandMedia(brand, true);
						Thread.sleep(6000);
					   Assert.assertTrue(driver.findElement(By.xpath("//*[@id='top']/div/nav/div/span/ul/li[4]/a")).isDisplayed(), "Error: SBSL registered but not completly");
					
					}
					else 
					{
						System.out.println("Error: " + Actual.getMessage());
					}
			    }
			    catch(Exception e)
			    {}
		}

}

/**
* Employer Quick Registration page tests Class : Contains all the tests
* in the Emp Quick Registration Page 
*
* @author  Aziza Mustafa
* @version 1.0
* @since   2015-07-28
*/
package com.pack.common.tests;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.actions.EmpQuickRegActions;
import com.pack.common.pageobjects.HomePage;
import com.pack.entities.Brand;
import com.pack.utils.BrandParser;
import com.pack.utils.CandidateParser;
import com.pack.utils.EmailsGenerator;
import com.pack.entities.User;
import com.pack.entities.Errors;
import com.pack.common.pageobjects.Employer;
public class EmployerQuickRegTest extends TestBaseSetup{
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


	
	public void TestEmpRegFirstStage()
	{
		HomePage Home;
	    EmpQuickRegActions EmpReg;
	    Employer Emp;
	    User NewEmp;
	    Brand brand;
	    Actual=new Errors();
	    try
	    {
	    	System.out.println("Employer Quick Registration functionality details...");
			System.out.println("Test: Employer Quick Registration First Stage ");
			Home=new HomePage(driver);
			EmpReg=new EmpQuickRegActions(driver);
			Emp=new Employer(driver);
			NewEmp=new User();
		    brand=new Brand();

			Home.clickEmployersLink();
		    Emp.ClickBuildemployerProfile(7);
			Thread.sleep(6000);
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='app-quick-reg-form']/div[1]/div[1]/div[1]/div/input")).isDisplayed(), "Error: Registration Modal is not being opened");
		    Actual=(Errors)EmpReg.EmpRegFirstStage(SetEmpInfo(NewEmp),SetBrandInfo(brand));
			Thread.sleep(6000);
			if(Actual.getStatus())
			{
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='emp-quick-reg-cont']/div[2]/div/div[2]/div/div/div/div[2]/h-form/div/form/div[2]/div[1]/input")).isDisplayed(), "Error: Second Stage is not being opened");
			}
			else 
			{
				System.out.println("Error: " + Actual.getMessage());
			}
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Error: " + e.getMessage());
	    }
	}
	
	@Test
	public void TestEmpQuickRegFullstages()
	{
		HomePage Home;
	    EmpQuickRegActions EmpReg;
	    Employer Emp;
	    User NewEmp;
	    Brand brand;
	    Actual=new Errors();
	    try
	    {
	    	System.out.println("Employer Quick Registration functionality details...");
			System.out.println("Test: Employer Quick Registration ");
			Home=new HomePage(driver);
			EmpReg=new EmpQuickRegActions(driver);
			Emp=new Employer(driver);
			NewEmp=new User();
			brand=new Brand();
			Home.clickEmployersLink();
		    Emp.ClickBuildemployerProfile(7);
			Thread.sleep(6000);
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='app-quick-reg-form']/div[1]/div[1]/div[1]/div/input")).isDisplayed(), "Error: Registration Modal is not being opened");
		    Actual=(Errors)EmpReg.EmpQuickRegFullStages(SetEmpInfo(NewEmp),SetBrandInfo(brand));
			Thread.sleep(6000);
			if(Actual.getStatus())
			{
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='top']/div/nav/div/span/ul/li[4]/a")).isDisplayed(), "Error: Second Stage is not being opened");
			
			}
			else 
			{
				System.out.println("Error: " + Actual.getMessage());
			}
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Error: " + e.getMessage());
	    }
	}
	

}

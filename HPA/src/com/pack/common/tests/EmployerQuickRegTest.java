/**
* Employer Quick Registration page tests Class : Contains all the tests
* in the Emp Quick Registration Page 
*
* @author  Aziza Mustafa
* @version 1.0
* @since   2015-07-28
*/
package com.pack.common.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.actions.EmpQuickRegActions;
import com.pack.common.pageobjects.HomePage;
import com.pack.utils.EmailsGenerator;
import com.pack.utils.Errors;
import com.pack.utils.User;
import com.pack.common.pageobjects.Employer;
public class EmployerQuickRegTest extends TestBaseSetup{
private WebDriver driver;
private Errors Actual;	
	@BeforeClass
	public void setUp() {
		driver=getDriver();
	}
	private User SetEmpInfo(User empInfo)
	{
		EmailsGenerator Email=new EmailsGenerator();
		Email.SetEmail("EMPLOYER");
		if(empInfo!=null)
		{
			empInfo.setFirstUserName("Test");
			empInfo.setLastUserName("Test");
			empInfo.setPhoneNumber("0597395494");
			empInfo.setEmail(Email.getEmail());
			empInfo.setPassword("123123");
			empInfo.setBrandName("Redline tuning");
			empInfo.setBrandLocation("Ha-Banai Street 29, Holon, 58857, Israel");
			empInfo.setDescription("Redline Tuning are an Essex based "
					+ "engine tuning company, which specialise in vehicle "
					+ "performance enhancements. With over 10 years experience, "
					+ "fully qualified Ford main agent technicians and the very"
					+ "latest in leading computer diagnostics, you’ll feel safe in the "
					+ "knowledge your car couldn’t be in better hands.");
			empInfo.setHecs("Event/Catering");
			empInfo.setCuisine("American");
			empInfo.setProfileLogoPath("C:\\Users\\Harri\\Desktop\\test.jpg");
			empInfo.setGroupName("HarriTest");
		}
		return empInfo;
	}
	
	public void TestEmpRegFirstStage()
	{
		HomePage Home;
	    EmpQuickRegActions EmpReg;
	    Employer Emp;
	    User NewEmp;
	    Actual=new Errors();
	    try
	    {
	    	System.out.println("Employer Quick Registration functionality details...");
			System.out.println("Test: Employer Quick Registration First Stage ");
			Home=new HomePage(driver);
			EmpReg=new EmpQuickRegActions(driver);
			Emp=new Employer(driver);
			NewEmp=new User();
			
			Home.clickEmployersLink();
		    Emp.ClickBuildemployerProfile(7);
			Thread.sleep(6000);
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='app-quick-reg-form']/div[1]/div[1]/div[1]/div/input")).isDisplayed(), "Error: Registration Modal is not being opened");
		    Actual=(Errors)EmpReg.EmpRegFirstStage(SetEmpInfo(NewEmp));
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
	    Actual=new Errors();
	    try
	    {
	    	System.out.println("Employer Quick Registration functionality details...");
			System.out.println("Test: Employer Quick Registration ");
			Home=new HomePage(driver);
			EmpReg=new EmpQuickRegActions(driver);
			Emp=new Employer(driver);
			NewEmp=new User();
			Home.clickEmployersLink();
		    Emp.ClickBuildemployerProfile(7);
			Thread.sleep(6000);
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='app-quick-reg-form']/div[1]/div[1]/div[1]/div/input")).isDisplayed(), "Error: Registration Modal is not being opened");
		    Actual=(Errors)EmpReg.EmpQuickRegFullStages(SetEmpInfo(NewEmp));
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
	

}

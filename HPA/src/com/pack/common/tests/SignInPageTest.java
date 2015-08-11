package com.pack.common.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobjects.HomePage;
import com.pack.common.pageobjects.JSFullRegistration;
import com.pack.common.pageobjects.JoinUsPage;
import com.pack.common.pageobjects.MainRegistration;

//import com.pack.common.pageobjects.BasePage;
//import com.pack.common.pageobjects.SignInPage;

public class SignInPageTest extends TestBaseSetup{
private WebDriver driver;
private JSFullRegistration user;
private MainRegistration main;
private HomePage home;
private JoinUsPage join;
private String[] skills={"Microsoft Office","Inventory Management","Social Media"};
//private SignInPage signInPage;
//private BasePage basePage;
	
	@BeforeClass
	public void setUp() {
		driver=getDriver();
		user=new JSFullRegistration(driver);
		main=new MainRegistration(driver);
		home =new HomePage(driver);
		join=new JoinUsPage(driver);
		
	}
		
	@Test
	public void verifySignInFunction() throws Exception {
		System.out.println("Sign In functionality details...");
		home.clickJoinLink();
		Thread.sleep(4000);
		join.ClickRegWithEmail(4000);
		
		main.FillFirstName("sireen");
		main.FillLastName("adeela");
		main.FillEmail("test2@wedd12345.com");
		main.FillPhone("123123123");
		main.FillPassword("123123");
		main.ConfirmPassword("123123");
		main.ClickContinueButton();
		user.SelectJSType();
		user.ClickUserTypeContinue();
		user.ClickConfirmationContinue();
		user.SetWorkHistory("Meltshop ny", "111 Fulton Street, New York, NY 10038, United States");
		user.ClickWorkHistoryContinue();
		user.SelectPosition("Busser", false);
		user.SetWorkHistoryStartMonth("April");
		user.SetWorkHistoryStartYear("2010");
		user.IstillWorkHere();
		user.ClickWorkDetailsContinue();
		user.SelectEducation("Birziet University", null);
		user.ClickEducationContinue();
		user.SelectDegree("Secondary");
		user.SetAreaOfStudy("test");
		user.SetEducationStartMonth("March");
		user.SetEducationStartYear("2009");
		user.SetCurrentlyAtSchool();
		user.ClickEducationDetailsContinue();
		user.SelectSkills(skills);
		user.ClickSkillsContinue();
		user.SelectAvailability(false, true, false);
		user.ClickAvailabilityContinue();
		user.SetFirstWord("lalala");
		user.SetSecondWord("lololo");
		user.SetThirdWord("lelele");
		user.ClickAboutContinue();
		user.UploadImage("C:\\Users\\LENOVO\\Pictures\\sireen.jpg");
		user.MediaContinue();
		user.SetReferennceName("ada");
		user.SetReferenncePhone("123123123");
		user.SetReferennceCompany("company");
		user.SetReferennceEmail("ref@test");
		user.ClickReferencesContinue();
		
		
	//	basePage = new BasePage(driver);
	//	signInPage = basePage.clickSignInBtn();
		//Assert.assertTrue(signInPage.verifySignInPageTitle(), "Sign In page title doesn't match");
		//Assert.assertTrue(signInPage.verifySignInPageText(), "Page text not matching");
		//Assert.assertTrue(signInPage.verifySignIn(), "Unable to sign in");

	}

}
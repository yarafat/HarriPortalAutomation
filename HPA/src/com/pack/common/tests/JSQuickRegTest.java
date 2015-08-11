package com.pack.common.tests;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import com.pack.base.TestBaseSetup;
import com.pack.common.actions.JSFullRegistrationActions;
import com.pack.common.pageobjects.JSQuickRegistration;
import com.pack.utils.EmailsGenerator;
import com.pack.entities.User;
import com.pack.entities.UserAbout;
import com.pack.entities.UserEducation;
import com.pack.entities.UserMedia;
import com.pack.entities.UserReferences;
import com.pack.entities.UserWorkHistory;

public class JSQuickRegTest extends TestBaseSetup {
	private JSQuickRegistration JSQuickRegPage;
	private WebDriver driver;
	private JSFullRegistrationActions action;
	private User testUser;
	private String[] skills = { "Inventory Management", "Social Media" };
	private UserEducation testUserEdu;
	private UserWorkHistory testUserHis;
	private UserAbout testUserAbout;
	private UserMedia testUserMeida;
	private UserReferences testUserRef;
	private EmailsGenerator UserEmail = new EmailsGenerator();
	String Email;

	@BeforeClass
	public void setUp() {
		driver = getDriver();
		action = new JSFullRegistrationActions(driver);
		JSQuickRegPage=new JSQuickRegistration(driver);

		testUser = new User();
		testUser.setFirstUserName("Sireen");
		testUser.setLastUserName("Suliman Adeela");
		UserEmail.SetEmail("Sireen");
		Email = UserEmail.getEmail();
		testUser.setEmail(Email);
		testUser.setPhoneNumber("123123123");
		testUser.setPassword("123123");
		testUser.SetConfirmPassword("123123");

		testUserHis = new UserWorkHistory();
		testUserHis.setCompany("Meltshop ny");
		testUserHis
				.setCompanyAddress("111 Fulton Street, New York, NY 10038, United States");
		testUserHis.setPosition("Marketing Manager");
		testUserHis.setStartMonth("March");
		testUserHis.setStartYear("2012");
		testUserHis.setStillWorkHere(true);

		testUserEdu = new UserEducation();
		testUserEdu.setInstitution("Birziet University");
		testUserEdu.setDegree("Secondary");
		testUserEdu.setAreaOfStudy("Computer System Engineering");
		testUserEdu.setStartMonth("April");
		testUserEdu.setStartYear("2009");
		testUserEdu.setStillAtShcool(true);

		testUserRef = new UserReferences();
		testUserRef.setName("First Reference");
		testUserRef.setPhone("+97264647478");
		testUserRef.setCompany("Company Name");
		testUserRef.setEmail("reference@test.com");

		testUserMeida = new UserMedia();
		testUserMeida.setProfileUrl("C:\\Users\\LENOVO\\Pictures\\sireen.jpg");

		testUserAbout = new UserAbout();
		testUserAbout.setWord1("first word");
		testUserAbout.setWord2("second word");
		testUserAbout.setWord3("third word");
		testUserAbout.setBio("Bio");

	}

	@Test
	public void VerifyFirstStageFunctionality() throws Exception {
		System.out.println("Vefifying JS Quick Registration First Stage..");
	}

	@Test
	public void VerifySecondStageFunctionality() throws Exception {
		System.out.println("Vefifying JS Quick Registration Second Stage..");


	}

}

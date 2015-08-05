package com.pack.common.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import com.pack.base.TestBaseSetup;
import com.pack.common.actions.JSQuickRegistrationAction;
import com.pack.utils.EmailsGenerator;
import com.pack.utils.User;
import com.pack.utils.UserAbout;
import com.pack.utils.UserEducation;
import com.pack.utils.UserMedia;
import com.pack.utils.UserReferences;
import com.pack.utils.UserWorkHistory;

public class JSQuickRegTest extends TestBaseSetup {
	private WebDriver driver;
	private JSQuickRegistrationAction action;
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
		action = new JSQuickRegistrationAction(driver);

		testUser = new User();
		testUser.setFirstUserName("Sireen");
		testUser.setLastUserName("Suliman Adeela");
		UserEmail.SetEmail("Sireen");
		Email = UserEmail.getEmail();
		testUser.setEmail(Email);
		testUser.setPhoneNumber("123123123");
		testUser.setPassword("123123");
		testUser.setConfirmPassword("123123");

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
}

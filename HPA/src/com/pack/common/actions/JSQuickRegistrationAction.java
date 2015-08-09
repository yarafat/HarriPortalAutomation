package com.pack.common.actions;

import org.openqa.selenium.WebDriver;

import com.pack.common.pageobjects.JSQuickRegistration;
import com.pack.entities.User;
import com.pack.entities.UserAbout;
import com.pack.entities.UserEducation;
import com.pack.entities.UserMedia;
import com.pack.entities.UserReferences;
import com.pack.entities.UserWorkHistory;

public class JSQuickRegistrationAction {
	private JSQuickRegistration jsPage;

	public JSQuickRegistrationAction(WebDriver driver) {
		super();
		jsPage = new JSQuickRegistration(driver);
		// TODO Auto-generated constructor stub
	}

	public void FirstStage(User JSuser) throws Exception {
		jsPage.SetFirstName(JSuser.getFirstUserName());
		jsPage.SetLastName(JSuser.getLastUserName());
		jsPage.SetEmailAddress(JSuser.getEmail());
		jsPage.SetPhoneNumber(JSuser.getPhoneNumber());
		jsPage.SetPassword(JSuser.getPassword());
		jsPage.ConfirmPassword(JSuser.getConfirmPassword());
		jsPage.ClickContinueButton();
	}

	public void FillWorkHistory(UserWorkHistory WorkHistory) throws Exception {
		jsPage.SelectWorkHistory(WorkHistory.getCompany(),
				WorkHistory.getCompanyAddress());
		jsPage.SelectPosition(WorkHistory.getPosition(),WorkHistory.isNewPosition());
		jsPage.SetWorkHistoryStartMonth(WorkHistory.getStartMonth());
		jsPage.SetWorkHistoryStartYear(WorkHistory.getStartYear());

		if (WorkHistory.isStillWorkHere()) {
			jsPage.IstillWorkHere();
		} else {
			jsPage.SetWorkHistoryEndMonth(WorkHistory.getEndMonth());
			jsPage.SetWorkHistoryEndMonth(WorkHistory.getEndMonth());
		}

	}

	public void FillEducation(UserEducation Education) throws Exception {
		jsPage.ExpandEducation();
		jsPage.SelectEducation(Education.getInstitution(),Education.getLocation());
		jsPage.SelectDegree(Education.getDegree());
		jsPage.SetAreaOfStudy(Education.getAreaOfStudy());
		jsPage.SetEducationStartMonth(Education.getStartMonth());
		jsPage.SetEducationStartYear(Education.getStartYear());

		if (Education.isStillAtShcool()) {
			jsPage.SetCurrentlyAtSchool();
		} else {
			jsPage.SetEducationEndMonth(Education.getEndMonth());
			jsPage.SetEducationEndYear(Education.getEndYear());
		}

	}

	public void FillUserAbout(UserAbout about) {
		jsPage.ExpandAbout();
		jsPage.SetFirstWord(about.getWord1());
		jsPage.SetSecondWord(about.getWord2());
		jsPage.SetThirdWord(about.getWord3());
		jsPage.SetBio(about.getBio());
	}

	public void FillUserMedia(UserMedia media) throws Exception {
		jsPage.UploadImage(media.getProfileUrl());
	}

	public void FillSkills(String[] skills) {
		jsPage.ExpandSkills();
		jsPage.SelectSkills(skills);
	}

	public void FillReferences(UserReferences references) {
		jsPage.SetReferennceName(references.getName());
		jsPage.SetReferenncePhone(references.getPhone());
		jsPage.SetReferennceCompany(references.getCompany());
		jsPage.SetReferennceEmail(references.getEmail());
	}

	public void SecondStage(UserWorkHistory UserWorkHistory,
			UserMedia UserMedia, UserEducation UserEdu, UserReferences UserRef,
			String[] UserSkills, UserAbout UserAbout) throws Exception {
		FillWorkHistory(UserWorkHistory);
		FillUserMedia(UserMedia);
		jsPage.SelectAvailability(true, true, false);
		FillEducation(UserEdu);
		FillReferences(UserRef);
		FillSkills(UserSkills);
		FillUserAbout(UserAbout);
	}

}

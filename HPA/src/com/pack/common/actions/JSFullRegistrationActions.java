package com.pack.common.actions;

import org.openqa.selenium.WebDriver;

import com.pack.common.pageobjects.HomePage;
import com.pack.common.pageobjects.JSFullRegistration;
import com.pack.common.pageobjects.JoinUsPage;
import com.pack.common.pageobjects.MainRegistration;
import com.pack.entities.User;
import com.pack.entities.Media;
import com.pack.entities.UserAbout;
import com.pack.entities.UserEducation;
import com.pack.entities.UserReferences;
import com.pack.entities.UserWorkHistory;

public class JSFullRegistrationActions {
	private JSFullRegistration jsPage;
	private MainRegistration main;
	private JoinUsPage join;
	private HomePage home;

	public JSFullRegistrationActions(WebDriver driver) {
		super();
		jsPage = new JSFullRegistration(driver);
		main = new MainRegistration(driver);
		join = new JoinUsPage(driver);
		home = new HomePage(driver);
		// TODO Auto-generated constructor stub
	}

	public void MainModal(User testCan) throws Exception {
		main.FillFirstName(testCan.getFirstUserName());
		main.FillLastName(testCan.getLastUserName());
		main.FillEmail(testCan.getEmail());
		main.FillPhone(testCan.getPhoneNumber());
		main.FillPassword(testCan.getPassword());
		//main.ConfirmPassword(testCan.getConfirmPassword());
		main.ClickContinueButton();
	}

	public void UserTypeModal() {
		jsPage.SelectJSType();
		jsPage.ClickUserTypeContinue();
		jsPage.ClickConfirmationContinue();
	}

	public void WorkHistoryModal(UserWorkHistory WorkHis) {
		jsPage.FillWorkHistory(WorkHis.getCompany(),
				WorkHis.getCompanyAddress());
		jsPage.ClickWorkHistoryContinue();
	}

	public void WorkHistoryDetailsModal(UserWorkHistory WorkHistory)
			throws Exception {
		jsPage.SelectPosition(WorkHistory.getPosition(),
				WorkHistory.isNewPosition());
		jsPage.SetWorkHistoryStartMonth(WorkHistory.getStartMonth());
		jsPage.SetWorkHistoryStartYear(WorkHistory.getStartYear());

		if (WorkHistory.isStillWorkHere()) {
			jsPage.IstillWorkHere();
		} else {
			jsPage.SetWorkHistoryEndMonth(WorkHistory.getEndMonth());
			jsPage.SetWorkHistoryEndMonth(WorkHistory.getEndMonth());
		}
		jsPage.ClickWorkDetailsContinue();
	}

	public void EducationModal(UserEducation Education) {
		jsPage.SelectEducation(Education.getInstitution(),
				Education.getLocation());
		jsPage.ClickEducationContinue();

	}

	public void EducationDetailsModal(UserEducation Education) throws Exception {
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
		jsPage.ClickEducationDetailsContinue();
	}

	public void SkillsModal(String[] skills) {
		jsPage.SelectSkills(skills);
		jsPage.ClickSkillsContinue();
	}

	public void AvailablityModal(boolean Parttime, boolean Anytime,
			boolean Fulltime) {
		jsPage.SelectAvailability(Anytime, Fulltime, Parttime);
		jsPage.ClickAvailabilityContinue();

	}

	public void AboutModal(UserAbout About) {
		jsPage.SetFirstWord(About.getWord1());
		jsPage.SetSecondWord(About.getWord2());
		jsPage.SetThirdWord(About.getWord3());
		jsPage.ClickAboutContinue();

	}

	public void MediaModal(Media media) throws Exception {
		jsPage.UploadImage(media.getProfileUrl());
		jsPage.MediaContinue();
	}

	public void ReferencesModal(UserReferences References) throws Exception {
		jsPage.SetReferennceName(References.getName());
		jsPage.SetReferenncePhone(References.getPhone());
		jsPage.SetReferennceCompany(References.getCompany());
		jsPage.SetReferennceEmail(References.getEmail());
		jsPage.ClickReferencesContinue();
	}

	public void FullRegistration(User candidate,
			UserWorkHistory UserWorkHistory, Media UserMedia,
			UserEducation UserEdu, UserReferences UserRef, String[] UserSkills,
			UserAbout UserAbout, boolean Parttime, boolean Fulltime,
			boolean Anytime) throws Exception {
		home.clickJoinLink();
		join.ClickRegWithEmail(10);
		MainModal(candidate);
		UserTypeModal();
		WorkHistoryModal(UserWorkHistory);
		WorkHistoryDetailsModal(UserWorkHistory);
		EducationModal(UserEdu);
		EducationDetailsModal(UserEdu);
		SkillsModal(UserSkills);
		AvailablityModal(Parttime, Anytime, Fulltime);
		AboutModal(UserAbout);
		MediaModal(UserMedia);
		ReferencesModal(UserRef);

	}

}

package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JSFullRegistration {
	protected WebDriver driver;
	private WebDriverWait wait;
	private String NewEntry = "Keep typing to create your own entry";
	private By LookingForJobs = By.id("user_type-0");
	private By UserTypeContinueButton = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[3]/div/form/div[3]/button");
	private By ThirdcontinueButton = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[19]/div/form/div[3]/button");

	private By WorkExperience = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[9]/div/form/div[2]/div/span/span[1]/div");
	private By WorkExperienceTextbox = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[9]/div/form/div[2]/div/span/span[1]/div/div[2]/div/input");
	private By WorkExperienceContinue = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[9]/div/form/div[4]/div[2]/button");
	private By MyFirstJob = By.xpath("//*[@id='first_job']/label/div/i");
	private By Position = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[10]/div[2]/form/div[2]/span/span[1]/div");
	private By PositionTextbox = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[10]/div[2]/form/div[2]/span/span[1]/div/div[2]/div/input");
	private By WorkHisStartMonth = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[10]/div[2]/form/div[3]/div[1]/month-date-picker/div/div/div[1]/span/span[1]/div");
	private By WorkHisStartYear = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[10]/div[2]/form/div[3]/div[1]/month-date-picker/div/div/div[2]/span/span[1]/div");
	private By WorkHisEndMonth = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[10]/div[2]/form/div[3]/div[2]/div[1]/month-date-picker/div/div/div[1]/span/span[1]/div");
	private By WorkHisEndYear = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[10]/div[2]/form/div[3]/div[2]/div[1]/month-date-picker/div/div/div[2]/span/span[1]/div");
	private By WorkHisStartMonthTextBox = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[10]/div[2]/form/div[3]/div[1]/month-date-picker/div/div/div[1]/span/span[1]/div/div[2]/div/input");
	private By WorkHisStartYearTextBox = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[10]/div[2]/form/div[3]/div[1]/month-date-picker/div/div/div[2]/span/span[1]/div/div[2]/div/input");
	private By WorkHisEndMonthTextBox = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[10]/div[2]/form/div[3]/div[2]/div[1]/month-date-picker/div/div/div[1]/span/span[1]/div/div[2]/div/input");
	private By WorkHisEndYearTextBox = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[10]/div[2]/form/div[3]/div[2]/div[1]/month-date-picker/div/div/div[2]/span/span[1]/div/div[2]/div/input");
	private By WorkHisDescription = By.id("description");
	private By WorkHistoryDetailsContinue = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[10]/div[2]/form/div[7]/button");
	private By IStillWorkHere = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[10]/div[2]/form/div[4]/div/label/div/i");

	private By Eduction = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[11]/div/form/div[2]/span/span[1]/div");
	private By EducationTextBox = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[11]/div/form/div[2]/span/span[1]/div/div[2]/div/input");
	private By EductionContinue = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[11]/div/form/div[6]/button[2]");
	private By EducationSkip = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[11]/div/form/div[6]/button[1]");
	private By Degree = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[12]/div/form/div[2]/div[1]/span/span[1]/div");
	private By DegreeTextBox = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[12]/div/form/div[2]/div[1]/span/span[1]/div/div[2]/div/input");
	private By AreaOfStudy = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[12]/div/form/div[2]/div[2]/input");
	private By EduStartMonth = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[12]/div/form/div[3]/div[1]/month-date-picker/div/div/div[1]/span/span[1]/div");
	private By EducationStartYear = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[12]/div/form/div[3]/div[1]/month-date-picker/div/div/div[2]/span/span[1]/div");
	private By EducationEndMonth = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[12]/div/form/div[3]/div[2]/div[1]/month-date-picker/div/div/div[1]/span/span[1]/div");
	private By EducationEndYear = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[12]/div/form/div[3]/div[2]/div[1]/month-date-picker/div/div/div[2]/span/span[1]/div");
	private By EducationStartMonth_textBox = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[12]/div/form/div[3]/div[1]/month-date-picker/div/div/div[1]/span/span[1]/div/div[2]/div/input");
	private By EducationStartYear_textBox = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[12]/div/form/div[3]/div[1]/month-date-picker/div/div/div[2]/span/span[1]/div/div[2]/div/input");
	private By EducationEndMonth_textBox = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[12]/div/form/div[3]/div[2]/div[1]/month-date-picker/div/div/div[1]/span/span[1]/div/div[2]/div/input");
	private By EducationEndYear_textBox = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[12]/div/form/div[3]/div[2]/div[1]/month-date-picker/div/div/div[2]/span/span[1]/div/div[2]/div/input");
	private By EducationDetails_Continue = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[12]/div/form/div[6]/button");
	private By StillAtSchool = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[12]/div/form/div[4]/div/label/div/i");

	private By Skills = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[13]/div/form/div[1]/span/span[1]/div/ul/li/input");
	private By SkillsContinue = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[13]/div/form/div[3]/button");
	private By AnyTime = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[14]/div/form/div[2]/div[1]/div/label/div/i");
	private By FullTime = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[14]/div/form/div[2]/div[2]/div/label/div/i");
	private By PartTime = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[14]/div/form/div[2]/div[3]/div/label/div/i");
	private By AvailabilityContinue = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[14]/div/form/div[5]/button");
	private By Word1 = By.id("word1");
	private By Word2 = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[15]/div/form/div[2]/div/div/div[2]/input");
	private By Word3 = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[15]/div/form/div[2]/div/div/div[3]/input");
	private By Bio = By.id("bio");
	private By AboutContinue = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[15]/div/form/div[4]/button");
	private By ImageUpload = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[16]/div[2]/form/div[2]/div[2]/div[1]/input");
	private By SavePhoto = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/div[2]/image-cropping/div/div[2]/div/div/div[5]/div/div[4]");
	private By MediaContinue = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[16]/div[2]/form/div[11]/button");
	private By ReferenceName = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[18]/div/form/div[2]/div/div[1]/div[1]/input");
	private By ReferencePhone = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[18]/div/form/div[2]/div/div[1]/div[2]/input");
	private By ReferenceCompany = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[18]/div/form/div[2]/div/div[2]/div[1]/input");
	private By ReferenceEmail = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[18]/div/form/div[2]/div/div[2]/div[2]/input");
	private By ReferencesContinue = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[18]/div/form/div[5]/button");

	public JSFullRegistration(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 20);
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void SelectJSType() {
		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(LookingForJobs));
			driver.findElement(LookingForJobs).click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickUserTypeContinue() {
		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(UserTypeContinueButton));
			driver.findElement(UserTypeContinueButton).click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickConfirmationContinue() {
		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(ThirdcontinueButton));
			driver.findElement(ThirdcontinueButton).click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ThisIsMyFirstJob() {
		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(MyFirstJob));
			driver.findElement(MyFirstJob).click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void FillWorkHistory(String SelectedCompany, String SelectedLocation) {
		try {
			WebElement work_history = driver.findElement(WorkExperience);
			work_history.click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(WorkExperienceTextbox));
			WebElement work_history_txtbox = driver
					.findElement(WorkExperienceTextbox);
			work_history_txtbox.sendKeys(SelectedCompany);
			if (SelectedLocation == null) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By
						.xpath("//small[contains(text(),'" + NewEntry + "')]")));
				driver.findElement(
						By.xpath("//small[contains(text(),'" + NewEntry + "')]"))
						.click();

			} else {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By
						.xpath("//small[contains(text(),'" + SelectedLocation
								+ "')]")));
				driver.findElement(
						By.xpath("//small[contains(text(),'" + SelectedLocation
								+ "')]")).click();
			}
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickWorkHistoryContinue() {
		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(WorkExperienceContinue));
			driver.findElement(WorkExperienceContinue).click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SelectPosition(String SelectedPosition, boolean NewPosition)
			throws Exception {
		try {
			Thread.sleep(6000);
			WebElement work_history = driver.findElement(Position);
			work_history.click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(PositionTextbox));
			WebElement work_history_txtbox = driver
					.findElement(PositionTextbox);
			work_history_txtbox.sendKeys(SelectedPosition);
			if (NewPosition) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By
						.xpath("//strong[contains(text(),'" + SelectedPosition
								+ "')]")));
				driver.findElement(
						By.xpath("//strong[contains(text(),'"
								+ SelectedPosition + "')]")).click();
			} else {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By
						.xpath("//*[contains(text(),'" + SelectedPosition
								+ "')]")));
				driver.findElement(
						By.xpath("//*[contains(text(),'" + SelectedPosition
								+ "')]")).click();
			}
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetWorkHistoryStartMonth(String workStarMonth) {
		try {
			WebElement start_month = driver.findElement(WorkHisStartMonth);
			start_month.click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(WorkHisStartMonthTextBox));
			WebElement start_month_txtbox = driver
					.findElement(WorkHisStartMonthTextBox);
			start_month_txtbox.sendKeys(workStarMonth);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//*[contains(text(),'" + workStarMonth + "')]")));
			driver.findElement(
					By.xpath("//*[contains(text(),'" + workStarMonth + "')]"))
					.click();
			System.out.println("Element was found and clicked successfully");

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetWorkHistoryEndMonth(String workEndMonth) {
		try {
			WebElement end_month = driver.findElement(WorkHisEndMonth);
			end_month.click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(WorkHisEndMonthTextBox));
			WebElement end_month_txtbox = driver
					.findElement(WorkHisEndMonthTextBox);
			end_month_txtbox.sendKeys(workEndMonth);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//*[@id='select2-drop']/ul/li/div")));
			driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li/div"))
					.click();
			System.out.println("Element was found and clicked successfully");

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetWorkHistoryEndYear(String workEndYear) {
		try {
			WebElement End_year = driver.findElement(WorkHisEndYear);
			End_year.click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(WorkHisEndYearTextBox));
			WebElement End_year_txtbox = driver
					.findElement(WorkHisEndYearTextBox);
			End_year_txtbox.sendKeys(workEndYear);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//*[@id='select2-drop']/ul/li/div")));
			driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li/div"))
					.click();
			System.out.println("Element was found and clicked successfully");

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetWorkHistoryStartYear(String workStartYear) {
		try {
			WebElement start_year = driver.findElement(WorkHisStartYear);
			start_year.click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(WorkHisStartYearTextBox));
			WebElement start_year_txtbox = driver
					.findElement(WorkHisStartYearTextBox);
			start_year_txtbox.sendKeys(workStartYear);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//*[@id='select2-drop']/ul/li/div")));
			driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li/div"))
					.click();
			System.out.println("Element was found and clicked successfully");

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetWorkHistoryDescription(String des) {
		try {
			WebElement description = driver.findElement(WorkHisDescription);
			description.sendKeys(des);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void IstillWorkHere() {
		try {
			WebElement i_still_work_here = driver.findElement(IStillWorkHere);
			i_still_work_here.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickWorkDetailsContinue() {
		try {
			WebElement i_still_work_here = driver
					.findElement(WorkHistoryDetailsContinue);
			i_still_work_here.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SelectSkills(String[] skills) {
		try {
			WebElement skills_input = driver.findElement(Skills);
			skills_input.click();
			for (int i = 0; i < skills.length; i++) {
				skills_input.sendKeys(skills[i]);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By
						.xpath("//*[contains(text(),'" + skills[i] + "')]")));
				driver.findElement(
						By.xpath("//*[contains(text(),'" + skills[i] + "')]"))
						.click();
			}

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickSkillsContinue() {
		try {
			WebElement skills_continue = driver.findElement(SkillsContinue);
			skills_continue.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}

	public void SelectEducation(String SelectedInstitution,
			String InstitutionLocation) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(Eduction));
			WebElement education = driver.findElement(Eduction);
			education.click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(EducationTextBox));
			WebElement education_txtbox = driver.findElement(EducationTextBox);
			education_txtbox.sendKeys(SelectedInstitution);
			if (InstitutionLocation == null) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By
						.xpath("//*[contains(text(),'" + SelectedInstitution
								+ "')]")));
				driver.findElement(
						By.xpath("//*[contains(text(),'" + SelectedInstitution
								+ "')]")).click();
			} else {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By
						.xpath("//small[contains(text(),'"
								+ InstitutionLocation + "')]")));
				driver.findElement(
						By.xpath("//small[contains(text(),'"
								+ InstitutionLocation + "')]")).click();
			}
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SelectDegree(String degree) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(Degree));
			WebElement degree_dropdown = driver.findElement(Degree);
			degree_dropdown.click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(DegreeTextBox));
			WebElement degree_textbox = driver.findElement(DegreeTextBox);
			degree_textbox.sendKeys(degree);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//*[contains(text(),'" + degree + "')]")));
			driver.findElement(
					By.xpath("//*[contains(text(),'" + degree + "')]")).click();
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}

	public void SetAreaOfStudy(String areaofstudy) throws Exception {
		try {
			WebElement area_of_study = driver.findElement(AreaOfStudy);
			// area_of_study.clear();
			area_of_study.sendKeys(areaofstudy);
			System.out.println("Keys were sent successfully");
			// Thread.sleep(3000);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetCurrentlyAtSchool() {
		try {
			WebElement still_at_school = driver.findElement(StillAtSchool);
			still_at_school.click();

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}

	public void SetEducationStartMonth(String eduStartMont) {
		try {
			WebElement education_start_month = driver
					.findElement(EduStartMonth);
			education_start_month.click();

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(EducationStartMonth_textBox));
			WebElement start_month_txtbox = driver
					.findElement(EducationStartMonth_textBox);
			start_month_txtbox.sendKeys(eduStartMont);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//*[contains(text(),'" + eduStartMont + "')]")));
			driver.findElement(
					By.xpath("//*[contains(text(),'" + eduStartMont + "')]"))
					.click();
			System.out.println("Element was found and clicked successfully");

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}

	public void SetEducationStartYear(String eduStartYear) {
		try {
			WebElement education_start_year = driver
					.findElement(EducationStartYear);
			education_start_year.click();

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(EducationStartYear_textBox));
			WebElement start_year_txtbox = driver
					.findElement(EducationStartYear_textBox);
			start_year_txtbox.sendKeys(eduStartYear);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//*[contains(text(),'" + eduStartYear + "')]")));
			driver.findElement(
					By.xpath("//*[contains(text(),'" + eduStartYear + "')]"))
					.click();
			System.out.println("Element was found and clicked successfully");

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetEducationEndMonth(String eduEndMonth) {
		try {
			WebElement education_end_month = driver
					.findElement(EducationEndMonth);
			education_end_month.click();

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(EducationEndMonth_textBox));
			WebElement end_month_txtbox = driver
					.findElement(EducationEndMonth_textBox);
			end_month_txtbox.sendKeys(eduEndMonth);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//*[contains(text(),'" + eduEndMonth + "')]")));
			driver.findElement(
					By.xpath("//*[contains(text(),'" + eduEndMonth + "')]"))
					.click();
			System.out.println("Element was found and clicked successfully");

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetEducationEndYear(String eduEndYear) {
		try {
			WebElement education_end_year = driver
					.findElement(EducationEndYear);
			education_end_year.click();

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(EducationEndYear_textBox));
			WebElement end_year_txtbox = driver
					.findElement(EducationEndYear_textBox);
			end_year_txtbox.sendKeys(eduEndYear);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//*[contains(text(),'" + eduEndYear + "')]")));
			driver.findElement(
					By.xpath("//*[contains(text(),'" + eduEndYear + "')]"))
					.click();
			System.out.println("Element was found and clicked successfully");

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickEducationContinue() {
		try {
			WebElement edu_continue = driver.findElement(EductionContinue);
			edu_continue.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickEducationDetailsContinue() {
		try {
			WebElement edu_details_continue = driver
					.findElement(EducationDetails_Continue);
			edu_details_continue.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickSkipEducation() {
		try {
			WebElement edu_skip = driver.findElement(EducationSkip);
			edu_skip.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SelectAvailability(boolean Anytime, boolean Fulltime,
			boolean Parttime) {
		try {
			if (Anytime) {
				WebElement anytime = driver.findElement(AnyTime);
				anytime.click();
			}
			if (Fulltime) {
				WebElement fulltime = driver.findElement(FullTime);
				fulltime.click();
			}
			if (Parttime) {
				WebElement parttime = driver.findElement(PartTime);
				parttime.click();
			}
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}

	public void ClickAvailabilityContinue() {
		try {
			WebElement availability_continue = driver
					.findElement(AvailabilityContinue);
			availability_continue.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}

	public void SetFirstWord(String word1) {
		try {
			WebElement first_word = driver.findElement(Word1);
			first_word.sendKeys(word1);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetSecondWord(String word2) {
		try {
			WebElement second_word = driver.findElement(Word2);
			second_word.sendKeys(word2);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetThirdWord(String word3) {
		try {
			WebElement third_word = driver.findElement(Word3);
			third_word.sendKeys(word3);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetBio(String bio) {
		try {
			WebElement QR_bio = driver.findElement(Bio);
			QR_bio.sendKeys(bio);
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickAboutContinue() {
		try {
			WebElement about_continue = driver.findElement(AboutContinue);
			about_continue.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}

	public void UploadImage(String ImageURL) throws Exception {
		try {
			WebElement uploadInputField = driver.findElement(ImageUpload);
			uploadInputField.sendKeys(ImageURL);
			wait.until(ExpectedConditions
					.invisibilityOfElementLocated(SavePhoto));
			Thread.sleep(3000);
			WebElement SaveButton = driver.findElement(SavePhoto);
			SaveButton.click();
			Thread.sleep(7000);
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void MediaContinue() {
		try {
			WebElement media_continue = driver.findElement(MediaContinue);
			media_continue.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetReferennceName(String Referencename) {
		try {
			WebElement reference_name = driver.findElement(ReferenceName);
			reference_name.sendKeys(Referencename);
			System.out.println("Keys were sent successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetReferenncePhone(String Referencephone) {
		try {
			WebElement reference_phone = driver.findElement(ReferencePhone);
			reference_phone.sendKeys(Referencephone);
			System.out.println("Keys were sent successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetReferennceCompany(String Referencecompany) {
		try {
			WebElement reference_company = driver.findElement(ReferenceCompany);
			reference_company.sendKeys(Referencecompany);
			System.out.println("Keys were sent successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void SetReferennceEmail(String Referenceemail) {
		try {
			WebElement reference_email = driver.findElement(ReferenceEmail);
			reference_email.sendKeys(Referenceemail);
			System.out.println("Keys were sent successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickReferencesContinue() {
		try {
			WebElement reference_continue = driver
					.findElement(ReferencesContinue);
			reference_continue.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}

}

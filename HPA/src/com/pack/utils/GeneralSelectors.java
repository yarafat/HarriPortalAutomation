/**
 * GeneralSelectors  Class : Contains all the general Selectors elements 
 * actions
 *
 * @author  Aziza Mustafa
 * @version 1.0
 * @since   2015-08-7
 */
package com.pack.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralSelectors {
	private WebDriver driver;

	public GeneralSelectors(WebDriver driver) {
		this.driver = driver;

	}

	public void SelectBusiness(By BusinessDropDown, By BusinessSearchBox,
			String BusinessName, String Address, int WaitSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(BusinessDropDown));
		WebElement BusinessDroplocator = driver.findElement(BusinessDropDown);
		WebElement Item;
		if (BusinessDroplocator.isDisplayed()) {
			BusinessDroplocator.click();
			WebElement BusinessSearchText = (new WebDriverWait(driver, 10))
					.until(ExpectedConditions
							.visibilityOfElementLocated(BusinessSearchBox));
			if (BusinessSearchText.isDisplayed()
					|| BusinessSearchText.isEnabled()) {
				BusinessSearchText.sendKeys(BusinessName);

				if (Address != null && !Address.isEmpty()) {
					Item = (new WebDriverWait(driver, 60))
							.until(ExpectedConditions
									.presenceOfElementLocated(By
											.xpath("//small[contains(text(),'"
													+ Address + "')]")));
				} else {
					Item = (new WebDriverWait(driver, 60))
							.until(ExpectedConditions
									.presenceOfElementLocated(By
											.xpath("//strong[contains(text(),'"
													+ BusinessName + "')]")));
				}

				Item.click();

			}
		}
	}

	public void SelectPosition(By PositionDropDown, String PositionName,
			int WaitSeconds) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(PositionDropDown));
		Thread.sleep(6000);
		WebElement PositionsDrop = driver.findElement(PositionDropDown);
		PositionsDrop.click();
		Thread.sleep(6000);
		WebElement Item = (new WebDriverWait(driver, 60))
				.until(ExpectedConditions.presenceOfElementLocated(By
						.xpath("//*[contains(text(),'" + PositionName + "')]")));

		Item.click();
	}

	public void SelectHecs(By HecsDropDown, String HecsText, int WaitSeconds)
			throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(HecsDropDown));
		Thread.sleep(6000);
		WebElement HecsDrop = driver.findElement(HecsDropDown);
		HecsDrop.click();
		Thread.sleep(6000);
		WebElement Item = (new WebDriverWait(driver, 60))
				.until(ExpectedConditions.presenceOfElementLocated(By
						.xpath("//div[contains(text(),'" + HecsText + "')]")));

		Item.click();
	}

	public void SelectCuisine(By CuisineDropDown, String CuisineText,
			int WaitSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(CuisineDropDown));
		WebElement CuisineDrop = driver.findElement(CuisineDropDown);
		CuisineDrop.click();
		WebElement Item = (new WebDriverWait(driver, 60))
				.until(ExpectedConditions.visibilityOfElementLocated(By
						.xpath("//div[contains(text(),'" + CuisineText + "')]")));

		Item.click();
	}

	public void SelectLogo(By UploadPicButton, String LogoPath, int WaitSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(UploadPicButton));

		// click select button
		WebElement UploadButtonLocator = driver.findElement(UploadPicButton);
		if (UploadButtonLocator.isDisplayed()) {
			UploadButtonLocator.click();
		}
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		setClipboardData(LogoPath);
		// native key strokes for CTRL, V and ENTER keys
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void setClipboardData(String string) {
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard()
				.setContents(stringSelection, null);
	}

	public void SelectLocation(By LocationsDDlLocator,
			By LocationSearchBoxLocator, String EnteredLcation,
			String TargedLocation, int WaitSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, WaitSeconds);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(LocationsDDlLocator));
		WebElement LocationDroplocator = driver
				.findElement(LocationsDDlLocator);
		WebElement Item;
		if (LocationDroplocator.isDisplayed()) {
			LocationDroplocator.click();
			WebElement LocationSearchText = (new WebDriverWait(driver, 10))
					.until(ExpectedConditions
							.visibilityOfElementLocated(LocationSearchBoxLocator));
			if (LocationSearchText.isDisplayed()
					|| LocationSearchText.isEnabled()) {
				LocationSearchText.sendKeys(EnteredLcation);

				if (TargedLocation != null && !TargedLocation.isEmpty()) {
					Item = (new WebDriverWait(driver, 60))
							.until(ExpectedConditions
									.presenceOfElementLocated(By
											.xpath("//div[contains(text(),'"
													+ TargedLocation + "')]")));
				} else {
					Item = (new WebDriverWait(driver, 60))
							.until(ExpectedConditions
									.presenceOfElementLocated(By
											.xpath("//span[contains(text(),'"
													+ EnteredLcation + "')]")));
				}

				Item.click();

			}
		}

	}

	public void SelectPosition(String SelectedPosition, boolean NewPosition,
			By WorkHistoryPositionDropdown, By WorkHistoryPositionTextBox,
			int seconds) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(WorkHistoryPositionDropdown));
			WebElement work_history = driver
					.findElement(WorkHistoryPositionDropdown);
			work_history.click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(WorkHistoryPositionTextBox));
			WebElement work_history_txtbox = driver
					.findElement(WorkHistoryPositionTextBox);
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

	public void SelectWorkHistory(String SelectedName, String SelectedLocation,
			By WorkHistoryDropdown, By WorkHistoryTextBox, int seconds) {
		String NewEntry = "Keep typing to create your own entry";
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		try {
			WebElement work_history = driver.findElement(WorkHistoryDropdown);
			work_history.click();
			wait.until(ExpectedConditions
					.elementToBeClickable(WorkHistoryTextBox));
			WebElement work_history_txtbox = driver
					.findElement(WorkHistoryTextBox);
			work_history_txtbox.sendKeys(SelectedName);
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

	public void SelectEducation(String SelectedInstitution,
			String InstitutionLocation, By EducationDropDown,
			By EducationTextBox, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(EducationDropDown));
			WebElement education = driver.findElement(EducationDropDown);
			education.click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(EducationTextBox));
			WebElement education_txtbox = driver.findElement(EducationTextBox);
			education_txtbox.sendKeys(SelectedInstitution);
			if (InstitutionLocation.isEmpty()) {
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

	public void SelectDegree(String degree, By Degree, By DegreeTextBox,
			int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
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

	public void SelectSkills(String[] skills, By SkillsInputTxt, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(SkillsInputTxt));
			WebElement skills_input = driver.findElement(SkillsInputTxt);
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

	public void SelectAvailability(boolean Anytime, boolean Fulltime,
			boolean Parttime, By AnyTime, By FullTime, By PartTime, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		try {
			if (Anytime) {
				wait.until(ExpectedConditions
						.visibilityOfElementLocated(AnyTime));
				WebElement anytime = driver.findElement(AnyTime);
				anytime.click();
			}
			if (Fulltime) {
				wait.until(ExpectedConditions
						.visibilityOfElementLocated(FullTime));
				WebElement fulltime = driver.findElement(FullTime);
				fulltime.click();
			}
			if (Parttime) {
				wait.until(ExpectedConditions
						.visibilityOfElementLocated(PartTime));
				WebElement parttime = driver.findElement(PartTime);
				parttime.click();
			}
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}

	public void UploadImage(String ImageURL, By SavePhoto, By ImageUpload,
			int seconds) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(ImageUpload));
			WebElement uploadInputField = driver.findElement(ImageUpload);
			uploadInputField.sendKeys(ImageURL);
			wait.until(ExpectedConditions
					.invisibilityOfElementLocated(SavePhoto));
			Thread.sleep(6000);
			WebElement SaveButton = driver.findElement(SavePhoto);
			SaveButton.click();
			Thread.sleep(7000);
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

}

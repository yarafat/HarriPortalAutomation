package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainRegistration {
	protected WebDriver driver;
	private WebDriverWait wait;
	private By Firstname = By.id("firstname");
	private By Lasttname = By.id("lastname");
	private By Phone = By.id("phone");
	private By Email = By.id("email");
	private By Password = By.id("password");
	private By ConfirmPassword = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[2]/div[2]/form/div[3]/div[2]/input");
	private By Username = By.id("username");
	private By MainContinueButton = By
			.xpath("//*[@id='join-modal']/div/div[2]/div/div/div/div/div/h-form[2]/div[2]/form/div[7]/button");

	public MainRegistration(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 20);
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void FillFirstName(String fname) {
		try {
			WebElement firstname = driver.findElement(Firstname);
			firstname.sendKeys(fname);
			System.out.println("keys were sent successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void FillLastName(String lname) {
		try {
			WebElement lastname = driver.findElement(Lasttname);
			lastname.sendKeys(lname);
			System.out.println("keys were sent successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void FillEmail(String email) {
		try {
			WebElement user_email = driver.findElement(Email);
			user_email.sendKeys(email);
			System.out.println("keys were sent successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void FillPhone(String phone) {
		try {
			WebElement user_phone = driver.findElement(Phone);
			user_phone.sendKeys(phone);
			System.out.println("keys were sent successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void FillPassword(String password) {
		try {
			WebElement pass = driver.findElement(Password);
			pass.sendKeys(password);
			System.out.println("keys were sent successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ConfirmPassword(String confirmpass) {
		try {
			WebElement confirm = driver.findElement(ConfirmPassword);
			confirm.sendKeys(confirmpass);
			System.out.println("keys were sent successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ChangeUserName(String username) {
		try {
			WebElement user_name = driver.findElement(Username);
			user_name.sendKeys(username);
			System.out.println("keys were sent successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void ClickContinueButton() {
		try {
			WebElement continue_btn = driver.findElement(MainContinueButton);
			continue_btn.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}
}

package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmployerDashboard {
	protected WebDriver driver;
	private By IwantToDropDown = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/div/div/div[2]/div/div/ng-include/div/div/div[3]/div[3]/div/i");
	private By PostJob = By
			.xpath("//*[@id='harriApp']/div[1]/div[2]/div/div/div[2]/div/div/ng-include/div/div/div[3]/div[3]/ul/li[1]/a");

	public EmployerDashboard(WebDriver driver) {
		this.driver = driver;

	}

	public void ClickIWantTo() throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(IwantToDropDown));
			WebElement IwantTo = driver.findElement(IwantToDropDown);
			IwantTo.click();
			Thread.sleep(6000);
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

	public void PostAJob() throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(PostJob));
			WebElement postjob = driver.findElement(PostJob);
			postjob.click();
			System.out.println("Element was found and clicked successfully");
			Thread.sleep(6000);
		}

		catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}

}

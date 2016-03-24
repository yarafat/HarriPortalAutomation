package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JobCreate {
	protected WebDriver driver;
	private WebDriverWait wait;
	
	private By JobBrandName = By.id("select2-chosen-2");
	private By JobBrandTextBox = By.id("s2id_autogen2_search");
	private By JobPosition = By.id("select2-chosen-4");
	private By JobAddress = By
			.xpath("//*[@id='blp_form']/div/div[1]/div[6]/button");
	private By AliasCheckBox = By
			.xpath("//*[@id='blp_form']/div/div[2]/div/div[2]/div/label/div/i");
	private By AliasTextBox = By.id("");

	// *[@id="select2-drop"]/div/input

	public JobCreate(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 20);
	}

	public void SetBrandName(String BrandName) throws Exception {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(JobBrandName));
			WebElement JobBrand = driver.findElement(JobBrandName);
			JobBrand.click();
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(JobBrandTextBox));
			WebElement brand_textbox = driver.findElement(JobBrandTextBox);
			brand_textbox.sendKeys(BrandName);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//span[contains(text(),'" + BrandName + "')]")));
			driver.findElement(
					By.xpath("//span[contains(text(),'" + BrandName + "')]")).click();
			Thread.sleep(6000);
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}

}

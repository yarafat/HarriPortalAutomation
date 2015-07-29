package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationPage {
	protected WebDriver driver;
	private WebDriverWait wait;
	private By ApplyByText = By
			.xpath("//*[@id='application-cont']/div[2]/div/div/div/div[3]/div[2]/div/div[5]/div/div/div/div[3]/div[10]/h-form/form/div[3]/span/div[1]/div[3]");
	private By ApplyByVideo = By.id("videoRecording");
	private By ApplyByText_textArea = By.id("text-answer");

	public ApplicationPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
	}

	public void ClickAnswerByTest() {
		try {
			WebElement answer_with_text = driver.findElement(ApplyByText);
			answer_with_text.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}

	public void ClickAnswerByText() {
		try {
			WebElement answer_with_video = driver.findElement(ApplyByVideo);
			answer_with_video.click();
			System.out.println("Element was found and clicked successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}

	}
	
	public void SendTextAnswer(String answer){
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(ApplyByText_textArea));
			WebElement answer_with_video = driver.findElement(ApplyByText_textArea);
			answer_with_video.sendKeys(answer);
			System.out.println("keys were sent successfully");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
			throw (ex);
		}
	}

}

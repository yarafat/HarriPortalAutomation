package com.pack.common.actions;

import org.openqa.selenium.WebDriver;

import com.pack.common.pageobjects.JobCreate;
import com.pack.entities.job;

public class JobCreateAction {

	private JobCreate jobcreatepage;

	public JobCreateAction(WebDriver driver) {
		super();
		jobcreatepage = new JobCreate(driver);
	}
	
	
	public void JobCreateFirstStage(job job) throws Exception{
		jobcreatepage.SetBrandName(job.getBrand());
		
	}

}

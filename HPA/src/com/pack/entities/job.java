/**
 * 
 */
package com.pack.entities;

import java.util.Arrays;

/**
 * @author Yaser
 *
 */
public class job {
	
	private String brand ;
	private String position ;
	private String address ;
	private int experience;
	private  String [] skills;
	private  Boolean [] availability ;
	private String startTime;
	private String compensation ;
	private String description ;
	private JobOpenCall openCall;
	private JobInterviewQuestion interviewQuestion;
	private String trackingUrl;
	private JobSchedule schedule;
	
	public job() {
		super();
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the experience
	 */
	public int getExperience() {
		return experience;
	}

	/**
	 * @param experience the experience to set
	 */
	public void setExperience(int experience) {
		this.experience = experience;
	}

	/**
	 * @return the skills
	 */
	public String[] getSkills() {
		return skills;
	}

	/**
	 * @param skills the skills to set
	 */
	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	

	/**
	 * @return the availability
	 */
	public Boolean[] getAvailability() {
		return availability;
	}

	/**
	 * @param availability the availability to set
	 */
	public void setAvailability(Boolean[] availability) {
		this.availability = availability;
	}

	/**
	 * @return the startTime
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the compensation
	 */
	public String getCompensation() {
		return compensation;
	}

	/**
	 * @param compensation the compensation to set
	 */
	public void setCompensation(String compensation) {
		this.compensation = compensation;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the openCall
	 */
	public JobOpenCall getOpenCall() {
		return openCall;
	}

	/**
	 * @param openCall the openCall to set
	 */
	public void setOpenCall(JobOpenCall openCall) {
		this.openCall = openCall;
	}

	/**
	 * @return the interviewQuestion
	 */
	public JobInterviewQuestion getInterviewQuestion() {
		return interviewQuestion;
	}

	/**
	 * @param interviewQuestion the interviewQuestion to set
	 */
	public void setInterviewQuestion(JobInterviewQuestion interviewQuestion) {
		this.interviewQuestion = interviewQuestion;
	}

	/**
	 * @return the trackingUrl
	 */
	public String getTrackingUrl() {
		return trackingUrl;
	}

	/**
	 * @param trackingUrl the trackingUrl to set
	 */
	public void setTrackingUrl(String trackingUrl) {
		this.trackingUrl = trackingUrl;
	}

	/**
	 * @return the schedule
	 */
	public JobSchedule getSchedule() {
		return schedule;
	}

	/**
	 * @param schedule the schedule to set
	 */
	public void setSchedule(JobSchedule schedule) {
		this.schedule = schedule;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "job [brand=" + brand + ", position=" + position + ", address="
				+ address + ", experience=" + experience + ", skills="
				+ Arrays.toString(skills) + ", availability="
				+ Arrays.toString(availability) + ", startTime=" + startTime
				+ ", compensation=" + compensation + ", description="
				+ description + ", openCall=" + openCall.toString()
				+ ", interviewQuestion=" + interviewQuestion.toString() + ", trackingUrl="
				+ trackingUrl + ", schedule=" + schedule.toString() + "]";
	}
	
	

}

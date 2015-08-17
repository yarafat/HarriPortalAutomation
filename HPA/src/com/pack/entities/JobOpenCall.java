/**
 * 
 */
package com.pack.entities;

/**
 * @author Yaser
 *
 */
public class JobOpenCall {
	
	private String title;
	private String date;
	private String startTime;
	private String endTime;
	private String address;
	private String additionalInformation;
	private boolean sendReminder;
	
	public JobOpenCall() {
		super();

	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
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
	 * @return the endTime
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
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
	 * @return the additionalInformation
	 */
	public String getAdditionalInformation() {
		return additionalInformation;
	}

	/**
	 * @param additionalInformation the additionalInformation to set
	 */
	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	/**
	 * @return the sendReminder
	 */
	public boolean isSendReminder() {
		return sendReminder;
	}

	/**
	 * @param sendReminder the sendReminder to set
	 */
	public void setSendReminder(boolean sendReminder) {
		this.sendReminder = sendReminder;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "JobOpenCall [title=" + title + ", date=" + date
				+ ", startTime=" + startTime + ", endTime=" + endTime
				+ ", address=" + address + ", additionalInformation="
				+ additionalInformation + ", sendReminder=" + sendReminder
				+ "]";
	}
	
	
	
	
}

/**
 * 
 */
package com.pack.entities;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Yaser
 *
 */
public class Candidate {
	
	private String FirstUserName;
	private String LastUserName;
	private String Password;
	private String ConfirmPassword;
	private String Email;
	private String Slug;
	private String phoneNumber;
	private LinkedList<UserWorkHistory> wh_linkedList = new LinkedList<UserWorkHistory>();
	private LinkedList<UserReferences> ref_linkedList = new LinkedList<UserReferences>();
	private Media  candidate_media;
	private LinkedList<UserEducation> edu_linkedList = new LinkedList<UserEducation>();
	private UserAbout  candidate_about;
	
	public Candidate(){
		
	}
	public Candidate(String firstUserName, String lastUserName,
			String password, String confirmPassword, String email, String slug,
			String phoneNumber, LinkedList<UserWorkHistory> wh_linkedList,
			LinkedList<UserReferences> ref_linkedList,
			Media candidate_media,
			LinkedList<UserEducation> edu_linkedList, UserAbout candidate_about) {
		super();
		FirstUserName = firstUserName;
		LastUserName = lastUserName;
		Password = password;
		ConfirmPassword = confirmPassword;
		Email = email;
		Slug = slug;
		this.phoneNumber = phoneNumber;
		this.wh_linkedList = wh_linkedList;
		this.ref_linkedList = ref_linkedList;
		this.candidate_media = candidate_media;
		this.edu_linkedList = edu_linkedList;
		this.candidate_about = candidate_about;
	}
	/**
	 * @return the firstUserName
	 */
	public String getFirstUserName() {
		return FirstUserName;
	}
	/**
	 * @param firstUserName the firstUserName to set
	 */
	public void setFirstUserName(String firstUserName) {
		FirstUserName = firstUserName;
	}
	/**
	 * @return the lastUserName
	 */
	public String getLastUserName() {
		return LastUserName;
	}
	/**
	 * @param lastUserName the lastUserName to set
	 */
	public void setLastUserName(String lastUserName) {
		LastUserName = lastUserName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}
	/**
	 * @return the confirmPassword
	 */
	public String getConfirmPassword() {
		return ConfirmPassword;
	}
	/**
	 * @param confirmPassword the confirmPassword to set
	 */
	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}
	/**
	 * @return the slug
	 */
	public String getSlug() {
		return Slug;
	}
	/**
	 * @param slug the slug to set
	 */
	public void setSlug(String slug) {
		Slug = slug;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the wh_linkedList
	 */
	public LinkedList<UserWorkHistory> getCandidateWorkHistory() {
		return wh_linkedList;
	}
	/**
	 * @param wh_linkedList the wh_linkedList to set
	 */
	public void setCandidateWorkHistory(LinkedList<UserWorkHistory> wh_linkedList) {
		this.wh_linkedList = wh_linkedList;
	}
	/**
	 * @return the ref_linkedList
	 */
	public LinkedList<UserReferences> getCandidateReferences() {
		return ref_linkedList;
	}
	/**
	 * @param ref_linkedList the ref_linkedList to set
	 */
	public void setCandidateReferences(LinkedList<UserReferences> ref_linkedList) {
		this.ref_linkedList = ref_linkedList;
	}
	/**
	 * @return the candidate_media
	 */
	public Media getCandidate_media() {
		return candidate_media;
	}
	/**
	 * @param candidate_media the candidate_media to set
	 */
	public void setCandidate_media(Media candidate_media) {
		this.candidate_media = candidate_media;
	}
	/**
	 * @return the edu_linkedList
	 */
	public LinkedList<UserEducation> getCandidateEducation() {
		return edu_linkedList;
	}
	/**
	 * @param edu_linkedList the edu_linkedList to set
	 */
	public void setCandidateEducation(LinkedList<UserEducation> edu_linkedList) {
		this.edu_linkedList = edu_linkedList;
	}
	/**
	 * @return the candidate_about
	 */
	public UserAbout getCandidate_about() {
		return candidate_about;
	}
	/**
	 * @param candidate_about the candidate_about to set
	 */
	public void setCandidate_about(UserAbout candidate_about) {
		this.candidate_about = candidate_about;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Candidate [FirstUserName=" + FirstUserName + ", LastUserName="
				+ LastUserName + ", Password=" + Password
				+ ", ConfirmPassword=" + ConfirmPassword + ", Email=" + Email
				+ ", Slug=" + Slug + ", phoneNumber=" + phoneNumber
				+ ", wh_linkedList=" + wh_linkedList + ", ref_linkedList="
				+ ref_linkedList + ", candidate_media=" + candidate_media
				+ ", edu_linkedList=" + edu_linkedList + ", candidate_about="
				+ candidate_about + "]";
	}
	
	
	
}

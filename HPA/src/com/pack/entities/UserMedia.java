package com.pack.entities;

import java.util.Arrays;

public class UserMedia {
	private String ProfileUrl;
	private String CoverUrl;
	private String[] AdditionalMedia;
	
	public UserMedia() {
	}
	
	public String getProfileUrl() {
		return ProfileUrl;
	}
	public void setProfileUrl(String profileUrl) {
		ProfileUrl = profileUrl;
	}
	public String getCoverUrl() {
		return CoverUrl;
	}
	public void setCoverUrl(String coverUrl) {
		CoverUrl = coverUrl;
	}
	public String[] getAdditionalMedia() {
		return AdditionalMedia;
	}
	public void setAdditionalMedia(String[] additionalMedia) {
		AdditionalMedia = additionalMedia;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserMedia [ProfileUrl=" + ProfileUrl + ", CoverUrl=" + CoverUrl
				+ ", AdditionalMedia=" + Arrays.toString(AdditionalMedia) + "]";
	}
	

}

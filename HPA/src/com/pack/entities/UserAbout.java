package com.pack.entities;

public class UserAbout {
	private String word1;
	private String word2;
	private String word3;
	private String Bio;

	public UserAbout() {
	}

	public String getWord1() {
		return word1;
	}

	public void setWord1(String word1) {
		this.word1 = word1;
	}

	public String getWord2() {
		return word2;
	}

	public void setWord2(String word2) {
		this.word2 = word2;
	}

	public String getWord3() {
		return word3;
	}

	public void setWord3(String word3) {
		this.word3 = word3;
	}

	public String getBio() {
		return Bio;
	}

	public void setBio(String bio) {
		Bio = bio;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserAbout [word1=" + word1 + ", word2=" + word2 + ", word3="
				+ word3 + ", Bio=" + Bio + "]";
	}

	
}

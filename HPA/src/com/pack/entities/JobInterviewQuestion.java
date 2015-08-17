/**
 * 
 */
package com.pack.entities;

/**
 * @author Yaser
 *
 */
public class JobInterviewQuestion {
	
	private String question;
	private boolean answerWithVideo;
	
	public JobInterviewQuestion() {
		super();
	}
	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}
	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}
	/**
	 * @return the answerWithVideo
	 */
	public boolean isAnswerWithVideo() {
		return answerWithVideo;
	}
	/**
	 * @param answerWithVideo the answerWithVideo to set
	 */
	public void setAnswerWithVideo(boolean answerWithVideo) {
		this.answerWithVideo = answerWithVideo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "JobInterviewQuestion [question=" + question
				+ ", answerWithVideo=" + answerWithVideo + "]";
	}
	
	

}

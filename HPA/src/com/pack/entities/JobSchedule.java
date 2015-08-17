/**
 * 
 */
package com.pack.entities;

/**
 * @author Yaser
 *
 */
public class JobSchedule {
	
 private boolean postImmediately;
 private String schedulePost ;
 
public JobSchedule() {
	super();
}

/**
 * @return the postImmediately
 */
public boolean isPostImmediately() {
	return postImmediately;
}

/**
 * @param postImmediately the postImmediately to set
 */
public void setPostImmediately(boolean postImmediately) {
	this.postImmediately = postImmediately;
}

/**
 * @return the schedulePost
 */
public String getSchedulePost() {
	return schedulePost;
}

/**
 * @param schedulePost the schedulePost to set
 */
public void setSchedulePost(String schedulePost) {
	this.schedulePost = schedulePost;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "JobSchedule [postImmediately=" + postImmediately
			+ ", schedulePost=" + schedulePost + "]";
}

 
 
 

}

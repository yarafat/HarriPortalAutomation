/**
* Error Class 
*
* @author  Aziza Mustafa
* @version 1.0
* @since   2015-07-24
*/
package com.pack.utils;

public class Errors {
	private  Boolean Status=true;
	private  String Message ="Success";
	public Errors()
	{}
	public  void setError(Boolean status,String message) {
		Status = status;
		Message = message;
	}
	public  Boolean getStatus() {
		return Status;
	}
	
	public  String getMessage() {
		return Message;
	}
	

}

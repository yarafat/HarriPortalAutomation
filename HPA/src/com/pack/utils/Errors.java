//Aziza H Mustafa
package com.pack.utils;

public class Errors {
	private static Boolean Status=true;
	private static String Message ="Success";
	public Errors()
	{}
	public static void setError(Boolean status,String message) {
		Status = status;
		Message = message;
	}
	public static Boolean getStatus() {
		return Status;
	}
	
	public static String getMessage() {
		return Message;
	}
	

}

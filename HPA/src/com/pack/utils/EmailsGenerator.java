/**
* EmailsGenerator class for generate dynamic emails based on date time 
* @author  Aziza Mustafa
* @version 1.0
* @since   2015-07-28 
*/
package com.pack.utils;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class EmailsGenerator {
	private String Email;
	public EmailsGenerator()
	{}
	public String getEmail() {
		return Email;
	}
	public void SetEmail(String SpecialText)//special text for creating email contains special text
	{
			this.Email=SpecialText+Generate();		
	}
	public void SetEmail()
	{
		this.Email=Generate();
	}
	public String Generate()
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
        String Date=dateFormat.format(cal.getTime());
        Date=  Date.replaceAll("[^a-zA-Z0-9]+", " ").trim();
        String Email="."+Date+"@Test.Com";
        
        return Email;
        		
	}
	
	
	

}

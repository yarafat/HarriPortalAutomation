package com.pack.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




/**
 * @author Yaser
 *
 */
public class JobParser {
	private  XSSFSheet sheet;
	private  int job_number;
	private static  FileInputStream file;
	private  Row row;


	public JobParser(int job_number) throws FileNotFoundException {
		super();
		this.job_number = job_number;
	}

	public  void parse() {
		try {

			FileInputStream file = new FileInputStream(new File(
					"job.xlsx"));
			// Create Workbook instance holding reference to .xlsx file
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			// Get first/desired sheet from the workbook
			sheet = workbook.getSheetAt(0);
			// Get the job row that we need to parse
			row = sheet.getRow(job_number);

			// Parse the job skills section
			parse_skills();
			// Parse the job availability section
			parse_availability();
			// Parse the job open call section
		    parse_job_open_call();
			// Parse the job interview question section
			parse_job_interview_question();
			// Parse the job schedule question section
			parse_job_schedule();
					   
			file.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	

	private void parse_job_schedule() {
		// TODO Auto-generated method stub
		
	}

	private void parse_job_interview_question() {
		// TODO Auto-generated method stub
		
	}

	private void parse_job_open_call() {
		// TODO Auto-generated method stub
		
	}

	private void parse_availability() {
		// TODO Auto-generated method stub
		
	}

	private void parse_skills() {
		// TODO Auto-generated method stub
		
	}

	

	
	/**
	 * @return the file
	 */
	public  FileInputStream getFile() {
		return file;
	}

	/**
	 * @param file
	 *            the file to set
	 */
	public  void setFile(FileInputStream file) {
		JobParser.file = file;
	}

}

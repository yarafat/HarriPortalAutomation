package com.pack.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.pack.entities.JobInterviewQuestion;
import com.pack.entities.JobOpenCall;
import com.pack.entities.JobSchedule;


/**
 * @author Yaser
 *
 */
public class JobParser {
	private static XSSFSheet sheet;
	private static int job_number;
	private static FileInputStream file;
	private static Row row;
	private static String[] skills;
	private static String[] availability;
	private static JobOpenCall openCall;
	private static JobInterviewQuestion interviewQuestion;
	private static JobSchedule schedule;

	public JobParser(int job_number) throws FileNotFoundException {
		super();
		JobParser.job_number = job_number;
	}

	public static void main(String[] args) {
		parse();
	}

	public static void parse() {
		try {

			FileInputStream file = new FileInputStream(new File("job.xlsx"));
			// Create Workbook instance holding reference to .xlsx file
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			// Get first/desired sheet from the workbook
			sheet = workbook.getSheetAt(0);
			// Get the job row that we need to parse
			row = sheet.getRow(job_number);
			for (int i = 0; i < 13; i++) {
				row.getCell(i).setCellType(1);
			}

			// Parse the job skills section
			parse_skills();
			for (int i = 0; i < skills.length; i++) {
				System.out.println(skills[i]);
			}
			// Parse the job availability section
			parse_availability();
			for (int i = 0; i < availability.length; i++) {
				System.out.println(availability[i]);
			}
			// Parse the job open call section
			parse_job_open_call();
			System.out.println(openCall.toString());
			// Parse the job interview question section
			parse_job_interview_question();
			System.out.println(interviewQuestion.toString());
			// Parse the job schedule question section
			parse_job_schedule();
			System.out.println(schedule.toString());
			file.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void parse_job_schedule() {
		try

		{

			// Create the job schedule
			String[] job_schedule_string = row.getCell(12).toString()
					.split("\\|");
			// set job schedule object

			boolean postImmediately = (job_schedule_string[0]
					.equalsIgnoreCase("true")) ? true : false;
			schedule.setPostImmediately(postImmediately);
			schedule.setSchedulePost(job_schedule_string[1]);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void parse_job_interview_question() {
		try

		{

			// Create the job interview question
			String[] job_interview_question_string = row.getCell(10).toString()
					.split("\\|");
			// set job interview question object
			interviewQuestion.setQuestion(job_interview_question_string[0]);
			boolean answerWithVideo = (job_interview_question_string[1]
					.equalsIgnoreCase("true")) ? true : false;
			interviewQuestion.setAnswerWithVideo(answerWithVideo);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void parse_job_open_call() {

		try

		{

			// Create the open call string
			String[] openCall_string = row.getCell(9).toString().split("\\|");
			// set the open call object
			openCall.setTitle(openCall_string[0]);
			openCall.setDate(openCall_string[1]);
			openCall.setStartTime(openCall_string[2]);
			openCall.setEndTime(openCall_string[3]);
			openCall.setAddress(openCall_string[4]);
			openCall.setAdditionalInformation(openCall_string[5]);
			boolean sendReminder = (openCall_string[7].equalsIgnoreCase("true")) ? true
					: false;
			openCall.setSendReminder(sendReminder);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void parse_availability() {

		try

		{

			// Create and set the about object
			String[] availability_string = row.getCell(5).toString()
					.split("\\|");

			if (availability_string.length < 1)
				System.out.println("availability should not be empty");
			else

				availability = availability_string.clone();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void parse_skills() {
		try

		{

			// Create and set the about object
			String[] skills_string = row.getCell(4).toString().split("\\|");

			if (skills_string.length < 3)
				System.out.println("Skills should be 3 or more");
			else

				skills = skills_string.clone();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @return the file
	 */
	public FileInputStream getFile() {
		return file;
	}

	/**
	 * @param file
	 *            the file to set
	 */
	public void setFile(FileInputStream file) {
		JobParser.file = file;
	}

}

package com.pack.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.pack.entities.User;
import com.pack.entities.UserAbout;
import com.pack.entities.UserEducation;
import com.pack.entities.Media;
import com.pack.entities.UserReferences;
import com.pack.entities.UserWorkHistory;

/**
 * @author Yaser
 *
 */
public class CandidateParser {
	private  XSSFSheet sheet;
	private  int candidate_number;
	private  User candidate;
	private  UserEducation user_education;
	private  UserAbout user_about;
	private  Media user_media;
	private  UserReferences user_references;
	private  LinkedList<UserWorkHistory> work_history_linkedList = new LinkedList<UserWorkHistory>();
	private  LinkedList<UserReferences> references_linkedList = new LinkedList<UserReferences>();
	private static  FileInputStream file;
	private  Row row;
	private  LinkedList<UserEducation> education_linkedList = new LinkedList<UserEducation>();

	public CandidateParser(int candidate_number) throws FileNotFoundException {
		this.candidate_number = candidate_number;
	}

	public  User parse() {
		try {

			FileInputStream file = new FileInputStream(new File(
					"candidate.xlsx"));
			// Create Workbook instance holding reference to .xlsx file
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			// Get first/desired sheet from the workbook
			sheet = workbook.getSheetAt(0);
			// Get the candidate row that we need to parse
			row = sheet.getRow(candidate_number);
			// Change the type of the cells to string before reading
			for (int i = 0; i < 7; i++) {
				 row.getCell(i,Row.CREATE_NULL_AS_BLANK).setCellType(1);
			}
			// Parse the work_history section

			parse_user_workHistory();
			// Print work history values
			for (int i = 0; i < work_history_linkedList.size(); i++) {
				System.out.println(work_history_linkedList.get(i).toString());
			}
			// Parse the references section
			parse_user_references();
			// Print references values
			for (int i = 0; i < references_linkedList.size(); i++) {
				System.out.println(references_linkedList.get(i).toString());
			}
			// Parse the candidate media section
			parse_user_media();
			// Print user media values
			System.out.println(user_media.toString());
			// Parse the education section
			 parse_user_education();
			// Print education values
			 for (int i = 0; i < education_linkedList.size(); i++) {
					System.out.println(education_linkedList.get(i).toString());
				}
		    // Parse the candidate about section
			 parse_user_about();
			// Print user about values
				System.out.println(user_about.toString());
		    // set the candidate data
			 candidate = new User();
			 candidate.setFirstUserName(row.getCell(0).toString());
			 candidate.setLastUserName(row.getCell(1).toString());
			 candidate.setPassword(row.getCell(2).toString());
			 candidate.setConfirmPassword(row.getCell(3).toString());
			 candidate.setEmail(row.getCell(4).toString());
			 candidate.setSlug(row.getCell(5).toString());
			 candidate.setPhoneNumber(row.getCell(6).toString());
			
			 candidate.setCandidateWorkHistory(work_history_linkedList);
			 candidate.setCandidateReferences(references_linkedList);
			 candidate.setCandidate_media(user_media);
			 candidate.setCandidateEducation(education_linkedList);
			 candidate.setCandidate_about(user_about);
			 // Print candidate details
			 System.out.println(candidate.toString());
			file.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return candidate;
	}

	public UserAbout parse_user_about() {
		try

		{
			// Get the needed candidate from the candidates sheet
			Row row = sheet.getRow(candidate_number);

			// Create and set the about object
			String[] about_string = row.getCell(11).toString().split("\\|");

			System.out.println(" about_string values : ");
			for (int i = 0; i < about_string.length; i++) {
				System.out.println(about_string[i]);
			}
			if (about_string.length < 4)
				System.out.println("Missing attributes in the about section");
			else if (about_string.length == 4) {
				user_about = new UserAbout();
				user_about.setBio(about_string[0]);
				user_about.setWord1(about_string[1]);
				user_about.setWord2(about_string[2]);
				user_about.setWord3(about_string[3]);
			} else
				System.out
						.println("About Attributes count is more than expected");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user_about;
	}

	public  UserEducation parse_user_education() {
		try

		{

			// Get the needed candidate from the candidates sheet
			Row row = sheet.getRow(candidate_number);

			// Create and set the education object
			String[] education_string = row.getCell(10).toString().split("\\|");
			for (int j = 0; j < education_string.length; j++) {

				System.out.println(" education_string " + j + " values : ");
				String[] education_items = education_string[j].split(",");
				for (int i = 0; i < education_items.length; i++) {
					System.out.println(education_items[i]);
				}
				System.out.println("Length :"+education_items.length);
				if (education_items.length < 9)
					System.out
							.println("Missing attributes in the education section");
				else if (education_items.length == 9)

				{

					user_education = new UserEducation();
					user_education.setInstitution(education_items[0]);
					user_education.setLocation(education_items[1]);
					user_education.setDegree(education_items[2]);
					user_education.setAreaOfStudy(education_items[3]);
					user_education.setStartMonth(education_items[4]);
					user_education.setStartYear(education_items[5]);
					user_education.setEndMonth(education_items[6]);
					user_education.setEndYear(education_items[7]);
					boolean stillAtSchool = (education_items[8]
							.equalsIgnoreCase("true")) ? true : false;
					user_education.setStillAtShcool(stillAtSchool);

					education_linkedList.add(user_education);
				} else
					System.out
							.println("Education Attributes count is more than expected");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user_education;
	}

	public  Media parse_user_media() {
		try

		{

			// Get the needed candidate from the candidates sheet
			Row row = sheet.getRow(candidate_number);

			// Create and set the media object
			String[] media_string = row.getCell(9).toString().split("\\|");

			System.out.println(" media_string values : ");
			for (int i = 0; i < media_string.length; i++) {
				System.out.println(media_string[i]);
			}
			if (media_string.length < 3)
				System.out
						.println("Missing attributes in the user media section");
			else if (media_string.length == 3)

			{
				user_media = new Media();
				user_media.setProfileUrl(media_string[0]);
				user_media.setCoverUrl(media_string[1]);
				String[] media_string_additionalPaths = media_string[2]
						.split(",");
				user_media.setAdditionalMedia(media_string_additionalPaths);
			} else

				System.out
						.println("User Media Attributes count is more than expected");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user_media;
	}

	public  UserReferences parse_user_references() {
		String[] references_string;
		try

		{

			// Get the needed candidate from the candidates sheet
			Row row = sheet.getRow(candidate_number);

			// Create and set the about object
			references_string = row.getCell(8).toString().split("\\|");
			
			for (int j = 0; j < references_string.length; j++) {

				System.out.println(" references_string " + j + " values : ");
				String[] references_items = references_string[j].split(",");
				for (int i = 0; i < references_items.length; i++) {
					System.out.println(references_items[i]);
				}
				if (references_items.length < 4)
					System.out
							.println("Missing attributes in the References section");
				else if (references_items.length == 4) {
					user_references = new UserReferences();
					user_references.setName(references_items[0]);
					user_references.setPhone(references_items[1]);
					user_references.setEmail(references_items[2]);
					user_references.setCompany(references_items[3]);

					references_linkedList.add(user_references);
				} else
					System.out
							.println("References Attributes count is more than expected");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user_references;
	}

	public  UserWorkHistory parse_user_workHistory() {
		UserWorkHistory user_workHistory = new UserWorkHistory();
		try

		{

			// Get the needed candidate from the candidates sheet
			Row row = sheet.getRow(candidate_number);

			// Create and set the work_history objects
			String[] workHistory_string = row.getCell(7).toString()
					.split("\\|");
			for (int j = 0; j < workHistory_string.length; j++) {

				System.out.println("workHistory_string " + j + " values : ");
				String[] work_history_items = workHistory_string[j].split(";");
				/*for (int i = 0; i < work_history_items.length; i++) {
					System.out.println(work_history_items[i]);
				}*/
				if (work_history_items.length < 8)
					System.out
							.println("Missing attributes in the workHistory section");
				else if (work_history_items.length == 8) {

					

					user_workHistory.setCompany(work_history_items[0]);
					user_workHistory.setCompanyAddress(work_history_items[1]);
					user_workHistory.setPosition(work_history_items[2]);
					user_workHistory.setStartMonth(work_history_items[3]);
					user_workHistory.setStartYear(work_history_items[4]);
					user_workHistory.setEndMonth(work_history_items[5]);
					user_workHistory.setEndYear(work_history_items[6]);
					boolean stillWorkHere = (work_history_items[7]
							.equalsIgnoreCase("true")) ? true : false;
					user_workHistory.setStillWorkHere(stillWorkHere);

					work_history_linkedList.add(user_workHistory);
				} else
					System.out
							.println("workHistory Attributes count is more than expected");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user_workHistory;
	}

	/**
	 * @return the candidateID
	 */
	public int getCandidateID() {
		return candidate_number;
	}

	/**
	 * @param candidateID
	 *            the candidateID to set
	 */
	public void setCandidateID(int candidateID) {
		this.candidate_number = candidateID;
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
		CandidateParser.file = file;
	}

}

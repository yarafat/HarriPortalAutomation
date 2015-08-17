package com.pack.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import com.pack.entities.Brand;

import com.pack.entities.Media;


/**
 * @author Yaser
 *
 */
public class BrandParser {
	private  XSSFSheet sheet;
	private  int brand_number;
	private  Brand brand;
	private  Media brand_media;
	private static  FileInputStream file;
	private  Row row;


	public BrandParser(int brand_number) throws FileNotFoundException {
		this.brand_number = brand_number;
	}

	public  void parse() {
		try {

			FileInputStream file = new FileInputStream(new File(
					"brand.xlsx"));
			// Create Workbook instance holding reference to .xlsx file
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			// Get first/desired sheet from the workbook
			sheet = workbook.getSheetAt(0);
			// Get the candidate row that we need to parse
			row = sheet.getRow(brand_number);

			// Parse the brand media section
			parse_brand_media();
			// Print brand media values
			System.out.println(brand_media.toString());
			
		    // set the brand
			 brand = new Brand();
			 // set brand name
			 brand.setBrandName(row.getCell(0).toString());
			 String [] brandLocations = row.getCell(1).toString().split("\\|");
			 brand.setBrandLocation(brandLocations);
			 brand.setHecs(row.getCell(2).toString());
			 brand.setCuisine(row.getCell(3).toString());
			 brand.setBusinessEmail(row.getCell(4).toString());
			 brand.setGroupName(row.getCell(5).toString());
			 brand.setMedia(brand_media);
			// Print brand details
			 System.out.println(brand.toString());
			file.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	

	public  void parse_brand_media() {
		try

		{

			// Get the needed brand from the brand sheet
			Row row = sheet.getRow(brand_number);

			// Create and set the media object
			String[] brand_media_string = row.getCell(6).toString().split("\\|");

			System.out.println(" Brand media_string values : ");
			for (int i = 0; i < brand_media_string.length; i++) {
				System.out.println(brand_media_string[i]);
			}
			if (brand_media_string.length < 3)
				System.out
						.println("Missing attributes in the brand media section");
			else if (brand_media_string.length == 3)

			{
				brand_media = new Media();
				brand_media.setProfileUrl(brand_media_string[0]);
				brand_media.setCoverUrl(brand_media_string[1]);
				String[] media_string_additionalPaths = brand_media_string[2]
						.split(",");
				brand_media.setAdditionalMedia(media_string_additionalPaths);
			} else

				System.out
						.println(""
								+ "Brand Media Attributes count is more than expected");
		} catch (Exception e) {
			e.printStackTrace();
		}
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
		BrandParser.file = file;
	}

}

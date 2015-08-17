package com.pack.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;





import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;





import com.pack.entities.Brand;
import com.pack.entities.Media;
import com.pack.entities.PaymentMethod;


/**
 * @author Yaser
 *
 */
public class PaymentMethodParser {
	private  XSSFSheet sheet;
	private  int paymentMethod_number;
	private  PaymentMethod paymentMethod;
	private static  FileInputStream file;
	private  Row row;


	public PaymentMethodParser(int paymentMethod_number) throws FileNotFoundException {
		this.paymentMethod_number = paymentMethod_number;
	}

	public  void parse() {
		try {

			FileInputStream file = new FileInputStream(new File(
					"paymentMethods.xlsx"));
			// Create Workbook instance holding reference to .xlsx file
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			// Get first/desired sheet from the workbook
			sheet = workbook.getSheetAt(0);
			// Get the candidate row that we need to parse
			row = sheet.getRow(paymentMethod_number);

			
		    // set the payment method details
			 paymentMethod = new PaymentMethod();

			 paymentMethod.setFirstName(row.getCell(0).toString());
			 paymentMethod.setLastName(row.getCell(1).toString());
			 paymentMethod.setCardNumber(row.getCell(2).toString()); 
			 paymentMethod.setExpirationMonth(Integer.parseInt(row.getCell(3).toString()));
			 paymentMethod.setExpirationYear(Integer.parseInt(row.getCell(4).toString()));
			 paymentMethod.setCardSecurityCode(row.getCell(5).toString());
			 paymentMethod.setAddress(row.getCell(6).toString());
			 paymentMethod.setCompany(row.getCell(7).toString());
			 paymentMethod.setState(row.getCell(8).toString());
			 paymentMethod.setCountry(row.getCell(9).toString());
			 paymentMethod.setZipCode(row.getCell(10).toString());
			// Print payment details
			 System.out.println(paymentMethod.toString());
			file.close();

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
		PaymentMethodParser.file = file;
	}

}
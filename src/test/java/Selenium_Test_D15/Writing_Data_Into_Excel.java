package Selenium_Test_D15;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_Data_Into_Excel {

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\WriteData.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook();
		XSSFSheet sheet= workbook.createSheet("WriteData");
		
		XSSFRow row1= sheet.createRow(0);
		row1.createCell(0).setCellValue("Java");
		row1.createCell(1).setCellValue("JavaScript");
		row1.createCell(2).setCellValue("Python");
		row1.createCell(3).setCellValue("Ruby");
		
		XSSFRow row2= sheet.createRow(1);
		row2.createCell(0).setCellValue("Selenium");
		row2.createCell(1).setCellValue("Cypress");
		row2.createCell(2).setCellValue("Playwrite");
		row2.createCell(3).setCellValue("Tosca");
		
		XSSFRow row3= sheet.createRow(2);
		row3.createCell(0).setCellValue("Postman");
		row3.createCell(1).setCellValue("RestAssured");
		row3.createCell(2).setCellValue("Katalon Studies");
		row3.createCell(3).setCellValue("SOAP UI");

		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("File is created...");
	}

}

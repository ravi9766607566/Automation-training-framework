package Selenium_Test_D15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_Dynamic_Data_Excel {

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\DynamicData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet= workbook.createSheet("DynamicWriteData");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Number of Rows");
		int row=sc.nextInt();
		
		System.out.println("Please Enter Number of Cells");
		int cols=sc.nextInt();
		
		for(int r=0; r<=row; r++)
		{
			XSSFRow currrow= sheet.createRow(r);
			for(int c=0; c<cols; c++)
			{
				XSSFCell cell= currrow.createCell(c);
				cell.setCellValue(sc.next());
			}
			System.out.println("Next row data");
		}
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is Created...");
		

	}

}

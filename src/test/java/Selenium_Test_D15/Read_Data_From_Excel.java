package Selenium_Test_D15;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Excel {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\TestData\\ReadData.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		
		int rows= sheet.getLastRowNum();
		int cols= sheet.getRow(1).getLastCellNum();
		
		System.out.println("Number of rows "+rows);
		System.out.println("Number of cols "+cols);
		
		for(int r=0; r<=rows; r++)
		{
			XSSFRow currRow=sheet.getRow(r);
			for(int c=0; c<cols; c++)
			{
				XSSFCell cell=currRow.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		workbook.close();
		file.close();

	}

}

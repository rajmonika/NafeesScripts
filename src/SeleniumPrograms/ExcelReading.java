package SeleniumPrograms;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook("C:\\Users\\Monika Raj\\Desktop\\Selenium\\Test Excel File.xlsx");
		
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		int rowCount = sh.getPhysicalNumberOfRows();
		System.out.println("Number of rows in the sheet1 : "+rowCount);
		
		int colCount = sh.getRow(2).getPhysicalNumberOfCells();//number of columns
		System.out.println("Number of columns in the sheet1 : "+colCount);
		
		for(int i=0; i<rowCount; i++)
		{
			String colData1 = sh.getRow(i).getCell(0).getStringCellValue();
			String colData2 = sh.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(colData1+" "+colData2);
		}
		
		System.out.println("*********Sheet 2**********");
		
		XSSFSheet sh2 = wb.getSheet("Sheet2");
		
		int rc = sh2.getPhysicalNumberOfRows();
		System.out.println("Number of rows in the sheet2 : "+rc);
		
		int cc = sh2.getRow(2).getPhysicalNumberOfCells();//number of columns
		System.out.println("Number of columns in the sheet2 : "+cc);
		
		for(int i=0; i<rc; i++)
		{
			for(int j=0; j<cc; j++)
			{
				String cellData = sh2.getRow(i).getCell(j).getStringCellValue();
				System.out.print(cellData);
			}
			System.out.println();
		}
		
		
}
}

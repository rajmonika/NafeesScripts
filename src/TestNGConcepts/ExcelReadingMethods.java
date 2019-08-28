package TestNGConcepts;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadingMethods {
	
	XSSFWorkbook wb;
	XSSFSheet sh;
	
	public ExcelReadingMethods(String excelPath, String sheetName) throws IOException
	{
		wb = new XSSFWorkbook(excelPath);
		sh = wb.getSheet(sheetName);
	}

	public int getRowCount()
	{
		int rowCount = sh.getPhysicalNumberOfRows();
		System.out.println("Total no. of Rows : "+rowCount);
		return rowCount;
	}
	
	public int getColCount()
	{
		int colCount = sh.getRow(0).getPhysicalNumberOfCells();//number of columns
		System.out.println("Total no. of Columns : "+colCount);
		return colCount;
	}
	
	public String getCellDataString(int rowNum, int colNum)
	{
		String cellData = sh.getRow(rowNum).getCell(colNum).getStringCellValue();
		return cellData;
	}
	
	public double getCellDataNumber(int rowNum, int colNum)
	{
		double cellData = sh.getRow(rowNum).getCell(colNum).getNumericCellValue();
		return cellData;
	}
		
}

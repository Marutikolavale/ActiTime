package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadConfig {
	//generic reusable method to read the property file

		public String readPropertyFile(String propPath,String key) throws IOException
		{
			FileInputStream fis=new FileInputStream(propPath);
			Properties prop = new Properties();
			prop.load(fis);
			String value = prop.getProperty(key);
			return value;
		}
		//read the Data from excel

		public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis =new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			Row row = sh.getRow(0);
			Cell cell = row.getCell(0);
			String data = cell.getStringCellValue();
			return data;
		}
		//how get Row count

		public int getRowCount(String execlPath,String sheetName) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis=new FileInputStream(execlPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			int rc = sh.getLastRowNum();
			return rc;		
		}
		//write the data from excel file

		public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data ) throws IOException
		{
			FileInputStream fis=new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			Row row = sh.getRow(rowCount);
			Cell cell = row.createCell(cellCount);
			cell.setCellValue(data);


			FileOutputStream fos=new FileOutputStream(excelPath);
			wb.write(fos);
		}
		
	}


package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExelPro {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fils =new FileInputStream("");	
		Workbook wrk = WorkbookFactory.create(fils);
		String data = wrk.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	}  
}

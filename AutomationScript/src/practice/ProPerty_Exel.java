package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ProPerty_Exel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream files = new FileInputStream("./Data/Information.xlsx");
		Workbook wb = WorkbookFactory.create(files);
		String data = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(data);
	}
}

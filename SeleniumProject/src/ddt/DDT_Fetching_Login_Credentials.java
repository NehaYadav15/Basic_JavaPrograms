package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_Fetching_Login_Credentials {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\nehav\\Videos\\Workspace\\8th July 2024\\SeleniumProject\\ExcelSheet\\Data_2_FetchingData.xlsx");
        Workbook wb=WorkbookFactory.create(fs);
        Sheet s1=wb.getSheet("login");
        Row r1=s1.getRow(1);
        Cell c1=r1.getCell(0);
        String un=c1.getStringCellValue();
        System.out.println(un);
        
        String pwd=wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
        System.out.println(pwd);
	}

}

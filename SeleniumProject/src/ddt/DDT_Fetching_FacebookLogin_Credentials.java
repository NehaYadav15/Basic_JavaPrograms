package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DDT_Fetching_FacebookLogin_Credentials {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\nehav\\Videos\\Workspace\\8th July 2024\\SeleniumProject\\ExcelSheet\\Data_2_FetchingData.xlsx");
        Workbook wb=WorkbookFactory.create(fs);
        String un=wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
        String pwd=wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
        
        EdgeDriver driver=new EdgeDriver();
		driver.get("https://en-gb.facebook.com/login/web/");
        driver.manage().window().maximize();
        WebElement e1=driver.findElement(By.id("email"));
        e1.sendKeys(un);
        WebElement e2=driver.findElement(By.id("pass"));
        e2.sendKeys(pwd);
        WebElement e3=driver.findElement(By.name("login"));
        e3.click();

	}

}

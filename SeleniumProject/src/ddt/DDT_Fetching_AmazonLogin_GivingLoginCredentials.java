package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DDT_Fetching_AmazonLogin_GivingLoginCredentials {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\nehav\\Videos\\Workspace\\8th July 2024\\SeleniumProject\\ExcelSheet\\Data_1_FetchingData.xlsx");
        Workbook wb=WorkbookFactory.create(fs);
        String un=NumberToTextConverter.toText(wb.getSheet("Login").getRow(1).getCell(0).getNumericCellValue());
        String pwd=wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://spcentral.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fspcentral.amazon.in%2F&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_spc_desktop_in&openid.mode=checkid_setup&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=amzn_spc_desktop_in&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("ap_email"));
		e1.sendKeys(un);
		WebElement e2=driver.findElement(By.id("continue"));
		e2.click();
		Thread.sleep(3000);
		WebElement e3=driver.findElement(By.name("password"));
		e3.sendKeys(pwd);
		WebElement e4=driver.findElement(By.id("signInSubmit"));
		e4.click();
	}

}

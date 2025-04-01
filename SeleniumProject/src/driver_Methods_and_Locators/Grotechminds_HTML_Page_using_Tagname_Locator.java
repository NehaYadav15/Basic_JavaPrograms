package driver_Methods_and_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grotechminds_HTML_Page_using_Tagname_Locator {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/nehav/OneDrive/Desktop/Document.imp/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.tagName("a"));
		e1.sendKeys(Keys.ENTER);
		e1.click();

	}

}

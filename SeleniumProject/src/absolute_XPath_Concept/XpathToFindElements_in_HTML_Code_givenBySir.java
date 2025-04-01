package absolute_XPath_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathToFindElements_in_HTML_Code_givenBySir {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/nehav/OneDrive/Desktop/Document.imp/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
		e1.click();
		WebElement e2=driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]"));
		e2.sendKeys("Neha");
		WebElement e3=driver.findElement(By.xpath("(/html/body/input)[1]"));
		e3.sendKeys("Neha_Yadav_15");

	}

}

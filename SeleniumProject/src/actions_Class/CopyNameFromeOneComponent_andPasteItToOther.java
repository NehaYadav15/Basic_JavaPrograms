package actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyNameFromeOneComponent_andPasteItToOther {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/nehav/OneDrive/Desktop/Document.imp/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("1"));
		e1.sendKeys("Manish");
		e1.sendKeys(Keys.CONTROL+"a");
		e1.sendKeys(Keys.CONTROL+"c");
		
		WebElement e2=driver.findElement(By.id("1"));
		e2.sendKeys(Keys.CONTROL+"v");

	}

}

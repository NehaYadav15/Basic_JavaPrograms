package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTextArea_Write_CSS_Using_TagName_AttributeName_and_AttributeValue {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		WebElement e1=driver.findElement(By.cssSelector("textarea[aria-owns='Alh6id']"));
		e1.sendKeys("Trump");
	}

}

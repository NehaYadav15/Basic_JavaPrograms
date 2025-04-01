package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Using_CaretSymbol_forAmazonSearchTextArea {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		WebElement e1=driver.findElement(By.cssSelector("input[placeholder^='Search Amazon.in']"));
		e1.sendKeys("Hand Bags");
	}

}

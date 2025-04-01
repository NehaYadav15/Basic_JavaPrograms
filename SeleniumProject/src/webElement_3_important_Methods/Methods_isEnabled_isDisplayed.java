package webElement_3_important_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Methods_isEnabled_isDisplayed {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		WebElement e1=driver.findElement(By.cssSelector(".gLFyf"));
		
		/*boolean b1=e1.isDisplayed();
		boolean b2=e1.isEnabled();
		if(b1 && b2)
		{
		e1.sendKeys("Linkedin"+Keys.ENTER);	
		}*/
		
		if(e1.isDisplayed() && e1.isEnabled())
		{
			e1.sendKeys("Linkedin"+Keys.ENTER);
		}

	}

}

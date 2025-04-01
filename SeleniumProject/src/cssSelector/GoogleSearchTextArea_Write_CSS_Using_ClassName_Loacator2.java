package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTextArea_Write_CSS_Using_ClassName_Loacator2 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		WebElement e1=driver.findElement(By.cssSelector(".gLFyf"));
		e1.sendKeys("MS Dhoni");
	}

}

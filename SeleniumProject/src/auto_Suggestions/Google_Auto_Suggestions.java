package auto_Suggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Auto_Suggestions {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.name("q"));
		e1.sendKeys("Modi");
		Thread.sleep(4000);
		List<WebElement> e2=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int noOfSuggestion=e2.size();
		System.out.println(noOfSuggestion);
		//e2.get(1).click();
		e2.get(noOfSuggestion-10).click();

	}

}

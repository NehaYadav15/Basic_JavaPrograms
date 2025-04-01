package auto_Suggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Auto_Suggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		e1.sendKeys("Shoe");
		Thread.sleep(4000);
		List<WebElement> e2=driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
		   int noOfSuggestion=e2.size();
		   System.out.println(noOfSuggestion);
		//e2.get(1).click();
		e2.get(noOfSuggestion-7).click();

	}

}

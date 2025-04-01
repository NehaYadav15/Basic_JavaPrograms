package auto_Suggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Auto_Suggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys("Shoe");
		Thread.sleep(4000);
		List<WebElement> e2=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int noOfSuggestion=e2.size();
		System.out.println(noOfSuggestion);
		//e2.get(1).click();
		e2.get(noOfSuggestion-9).click();

	}

}

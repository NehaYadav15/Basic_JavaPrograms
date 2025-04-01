package implicitWait_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait_1 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement e1=driver.findElement(By.partialLinkText("Customer Se"));
		e1.click();
		driver.close();

	}

}

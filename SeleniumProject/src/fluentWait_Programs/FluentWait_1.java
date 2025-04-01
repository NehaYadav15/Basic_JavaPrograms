package fluentWait_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWait_1 {

	public static void main(String[] args) 
	{
		EdgeDriver driver=new EdgeDriver();
    	driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		FluentWait<EdgeDriver> wait=new FluentWait<EdgeDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1)).ignoring(NullPointerException.class);
		wait.until(ExpectedConditions.titleContains("Google"));
		WebElement element=driver.findElement(By.xpath("(//input[@class='RNmpXc'])[2]"));
    	element.click();

	}

}

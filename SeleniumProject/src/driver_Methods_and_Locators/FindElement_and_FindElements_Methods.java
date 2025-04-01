package driver_Methods_and_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElement_and_FindElements_Methods {

	public static void main(String[] args) 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://amazon.in/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoes");
		//e1.sendKeys(Keys.ENTER);
		//e1.sendKeys("Shoes"+Keys.ENTER);
		WebElement e2=driver.findElement(By.id("nav-search-submit-button"));
		e2.click();
		driver.close();
		

	}

}

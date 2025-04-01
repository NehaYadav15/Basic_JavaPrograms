package handle_Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_Select_Dropdown_sideOfSearchTextField_using_Enter_and_Arrow_Down_Buttons {

	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//select[@name='url']"));
		//Selected dropdown using XPath and then trying to select its options.
		
        e1.sendKeys(Keys.ENTER);
        e1.sendKeys(Keys.ARROW_DOWN);
        

	}

}

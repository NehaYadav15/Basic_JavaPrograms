package handle_Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Select_Dropdown_sideOfSearchTextField_using_Arrow_Down_Button {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//select[@name='url']"));
		//Selected dropdown using XPath and then trying to select its options.
		
        //e1.sendKeys(Keys.ENTER);
        e1.sendKeys(Keys.ARROW_DOWN);

	}

}

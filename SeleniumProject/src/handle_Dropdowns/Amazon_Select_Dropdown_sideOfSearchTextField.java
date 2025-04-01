package handle_Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Select_Dropdown_sideOfSearchTextField {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//select[@name='url']"));
		//Selected dropdown using XPath and then trying to select its options.
		
		Select s=new Select(e1);
		Thread.sleep(1000);
		s.selectByIndex(2);
		Thread.sleep(1000);
		s.selectByValue("search-alias=mobile-apps");
		Thread.sleep(1000);
		s.selectByVisibleText("Books");

	}

}

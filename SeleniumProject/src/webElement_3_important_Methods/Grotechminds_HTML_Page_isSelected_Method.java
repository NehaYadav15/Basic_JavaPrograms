package webElement_3_important_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Locating are you ready to relocate Bangalore checkbox.....
public class Grotechminds_HTML_Page_isSelected_Method {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/nehav/OneDrive/Desktop/Document.imp/learningHTML1.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement e1=driver.findElement(By.xpath("(//input)[13]"));
		e1.click();
		Thread.sleep(1000);
		boolean b1=e1.isSelected();
		System.out.println(b1);
		

	}

}

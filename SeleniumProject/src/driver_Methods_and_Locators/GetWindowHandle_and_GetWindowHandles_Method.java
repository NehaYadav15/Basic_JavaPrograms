package driver_Methods_and_Locators;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class GetWindowHandle_and_GetWindowHandles_Method {

	public static void main(String[] args) 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://amazon.in/");
		String title=driver.getTitle();
		System.out.println(title);
		String pid=driver.getWindowHandle();
		System.out.println(pid);
		Set<String> pcid=driver.getWindowHandles();
		System.out.println(pcid);
		driver.close();
		
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("https://www.google.com");
		String title1=driver.getTitle();
		System.out.println(title1);
		String pid1=driver.getWindowHandle();
		System.out.println(pid1);
		Set<String> pcid1=driver.getWindowHandles();
		System.out.println(pcid1);
		driver1.quit();
		
	}

}

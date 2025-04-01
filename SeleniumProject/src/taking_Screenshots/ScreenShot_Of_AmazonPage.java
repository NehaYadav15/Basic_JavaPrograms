package taking_Screenshots;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class ScreenShot_Of_AmazonPage {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		ScreenShot_Of_AmazonPage s1=new ScreenShot_Of_AmazonPage();
		Class<? extends ScreenShot_Of_AmazonPage> c1=s1.getClass();
		System.out.println(c1);
		new ScreenShot_Of_AmazonPage().getClass();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//WebElement e1=driver.findElement(By.xpath("//select[@name='url']"));
		//Thread.sleep(1000);
		driver.manage().window().maximize();
		
		//Thread.sleep(1000);
		///Select s=new Select(e1);
		//s.selectByIndex(8);
		//Thread.sleep(1000);
		//s.selectByValue("search-alias=mobile-apps");
		//Thread.sleep(1000);
		//s.selectByVisibleText("Books");
		
		//Thread.sleep(1000);
		TakesScreenshot ts=driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(500);
		File destination=new File("C:\\Users\\nehav\\Videos\\Workspace\\8th July 2024\\SeleniumProject\\Screenshot\\One" +Math.random()+ ".png");
		Thread.sleep(500);
		FileHandler.copy(source, destination);
	    

	}

}

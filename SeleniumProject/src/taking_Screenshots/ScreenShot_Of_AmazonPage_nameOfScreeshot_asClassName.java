package taking_Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_Of_AmazonPage_nameOfScreeshot_asClassName
{

	public static void main(String[] args) throws IOException, InterruptedException
	{	
		Date d1=new Date();
		System.out.println(d1.getTime());
		
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		String date1=d2.toString();
		String month=date1.substring(4,7);
		System.out.println(month);
		String date=date1.substring(8,10);
		System.out.println(date);
		String year=date1.substring(date1.length()-4);
		System.out.println(year);
		String time=date1.substring(11,19);
		System.out.println(time);
		String date2=date.concat(month).concat(year).concat(time);
		System.out.println(date2);
		String date3=date.concat("/").concat(month).concat("/").concat(year).concat("/").concat(time);
		System.out.println(date3);
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(500);
		//File destination=new File("C:\\Users\\nehav\\Videos\\Workspace\\8th July 2024\\SeleniumProject\\Screenshot\\One" +new ScreenShot_Of_AmazonPage().getClass()+ ".png");
		File destination=new File("C:\\Users\\nehav\\Videos\\Workspace\\8th July 2024\\SeleniumProject\\Screenshot\\"+date3 +new ScreenShot_Of_AmazonPage().getClass() + ".png");
		//File destination=new File("C:\\Users\\nehav\\Videos\\Workspace\\8th July 2024\\SeleniumProject\\Screenshot\\Screenprint" +new Date().getTime()+ ".png");
		Thread.sleep(500);
		FileHandler.copy(source, destination);
	    

	}

}

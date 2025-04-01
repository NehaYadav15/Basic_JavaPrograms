package handling_Pop_Ups_inSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_Parent_Child_Pop_Up_Handling_1stWay {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement e1=driver.findElement(By.xpath("//span[text()='Google']"));
        e1.click();
        Thread.sleep(1000);
        Set<String> pcid=driver.getWindowHandles();
        System.out.println(pcid);
        Iterator<String> i2=pcid.iterator();
        String pid=i2.next();
        String cid=i2.next();
        System.out.println(pid);
        System.out.println(cid);
        //driver.close();
        driver.switchTo().window(cid);
        driver.close();

	}

}

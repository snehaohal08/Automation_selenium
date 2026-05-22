package Test.Selenium_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.org.apache.bcel.internal.generic.Select;

public class Task3FB {
	public static void main(String args[]) {
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.facebook.com/reg/?entry_point=login&next=");
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// firstName
		cd.findElement(By.xpath("//input[@dir='ltr']")).sendKeys("Sneha");
		//LastName
		cd.findElement(By.xpath("(//input[@dir='ltr'])[2]")).sendKeys("Ohal");
		
		// Mobile no
		cd.findElements(By.cssSelector("input[dir='ltr']")).get(2).sendKeys("9604064897");
		// Password
		cd.findElements(By.cssSelector("input[dir='ltr']")).get(3).sendKeys("Sneha@123");
	}
}

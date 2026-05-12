package Test.Selenium_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector {
	public static void main(String args[]) {
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		cd.manage().window().maximize();
//		 if you want to get for some time , and that eleemt is nit find give the NoSuchElementException "we use implicitlyWait "
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		cd.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
//		
		cd.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		cd.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
		cd.findElement(By.xpath("//button[text()=' Login ']")).click();
	}

}
